package Main;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

public class JavaGuia8Ej1_CuentaBancaria {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // instancio objeto desde clase servicio:
        //(intermediario entre el Main y la Clase Entidad)
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();

        // instancio un objeto cuenta bancaria:
        CuentaBancaria cta1 = cbs.crearCuenta();     //a cuenta1 le estoy asignando el valor de retorno de crear cuenta en Servicio

        int opcion;
        char resp;

        do {

            System.out.println(" 1 - Deposito");
            System.out.println(" 2 - Extracción");
            System.out.println(" 3 - Extracción Rápida");
            System.out.println(" 4 - Consultar saldo");
            System.out.println(" 5 - Consultar Datos");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    cbs.ingresar(cta1);  // obj de cta servicio inicializado aca . llamado a metodo ( obj cta bancaria )
                    break;

                case 2:
                    cbs.retirar(cta1);
                    break;

                case 3:
                    cbs.extraccionRapida(cta1);
                    break;

                case 4:
                    cbs.consultarSaldo(cta1);
                    break;

                case 5:
                    cbs.consultarDatos(cta1);
                    break;
            }

            System.out.println(" Desea realizar otra operacion? Presione s para contnuar o cualquier tecla para salir");
            resp = leer.next().charAt(0);

        } while (resp == 's');
    }
}
