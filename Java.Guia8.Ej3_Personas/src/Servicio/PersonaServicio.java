/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos para 
llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, 
es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    boolean mayor;

    public Persona crearPersona() {

        Persona pers = new Persona();

        System.out.println(" ");
        System.out.println("Ingrese nombre: ");
        pers.setNombre(leer.next());

        System.out.println("Ingrese edad: ");
        pers.setEdad(leer.nextInt());

        System.out.println("Ingrese sexo: H, M u O");
        pers.setSexo(leer.next().toUpperCase().charAt(0));
        //PASA A MAYUSCULAS // LEE PRIMER CARACTER

        while (pers.getSexo() != 'H' && pers.getSexo() != 'M' && pers.getSexo() != 'O') {

            System.out.println("Sexo inválido, ingrese nuevamente (H - hombre, M - mujer, O - otro):");
            pers.setSexo(leer.next().toUpperCase().charAt(0));
        }

        System.out.println("Ingrese peso en kg.");
        pers.setPeso(leer.nextDouble());

        System.out.println("Ingrese altura: ");
        pers.setAltura(leer.nextDouble());

        return pers;
    }

    public boolean esMayorEdad(Persona pers) {

        if (pers.getEdad() >= 18) {

            mayor = true;
        } else {
            mayor = false;
        }
        return mayor;
    }

    /*
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
significa que la persona está por debajo de su peso ideal y la función devuelve 
un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa 
que la persona tiene sobrepeso, y la función devuelve un 1.
     */
    public double calcularIMC(Persona pers) {

        double imc = pers.getPeso()/(Math.pow(pers.getAltura(), 2));

        if (imc < 20) {
            return -1;

        } else if (imc >= 20 && imc <= 25) {
            return 0;

        } else {
            return 1;
        }
    }
}


