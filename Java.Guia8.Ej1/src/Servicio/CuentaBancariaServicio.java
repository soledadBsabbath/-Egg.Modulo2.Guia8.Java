/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará 
al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará 
el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que 
el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in);

    //metodo crear cuenta 
    // Como quiero que me devuelva una Cuenta bancaria entera con todos los datos, se usa como tipo el nombre de la clase
    public CuentaBancaria crearCuenta() {

        // instancio 1 objeto 
        CuentaBancaria cuenta1 = new CuentaBancaria();

        System.out.println("Ingresar número de cuenta");
        cuenta1.setNumeroCuenta(leer.nextInt()); // al objeto le asigno el nro de cta ingresado

        System.out.println("Ingresar DNI de usuario");
        cuenta1.setDniCliente(leer.nextLong());
        
        System.out.println("Ingresar saldo actual");
        cuenta1.setSaldoActual (leer.nextDouble());

        return cuenta1;
    }   
        
    public void ingresar (CuentaBancaria cuenta1) {
        
        System.out.println("Ingresar suma a depositar");
        
        cuenta1.setSaldoActual (cuenta1.getSaldoActual () + leer.nextDouble());
    }

    public void retirar (CuentaBancaria cuenta1) {
        
        System.out.println("Ingrese monto de extracción");
        double extraccion = leer.nextDouble();
        
        if (extraccion > cuenta1.getSaldoActual()) {
            System.out.println(" El monto ingresado es mayor al saldo existente, se retirarán $" + cuenta1.getSaldoActual());
        
            cuenta1.setSaldoActual (0);
            
        } else {
            cuenta1.setSaldoActual (cuenta1.getSaldoActual() - extraccion);
            
            System.out.println("Extraccion exitosa.");
        }
    }
        
    
    public void extraccionRapida (CuentaBancaria cuenta1) {
            
         System.out.println("Se retirará " + cuenta1.getSaldoActual() * 0.20);   
         
         cuenta1.setSaldoActual (cuenta1.getSaldoActual() * 0.80);
    }
    
    
    public void consultarSaldo (CuentaBancaria cuenta1) {
        
        System.out.println("Saldo disponible:" + cuenta1.getSaldoActual());
    }
    
    
    public void consultarDatos (CuentaBancaria cuenta1){
        
        System.out.println("Número de Cuenta: "+cuenta1.getNumeroCuenta()); 
             System.out.println("DNI de usuario: "+cuenta1.getDniCliente()); 
                  System.out.println("Saldo Actual: "+cuenta1.getSaldoActual()); 
    }
}
