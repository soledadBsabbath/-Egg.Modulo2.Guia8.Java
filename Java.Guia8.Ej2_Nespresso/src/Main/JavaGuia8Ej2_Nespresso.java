/*
Programa Nespresso. 
 */
package Main;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

public class JavaGuia8Ej2_Nespresso {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        char resp;

        CafeteraServicio c1 = new CafeteraServicio();

        Cafetera ca = c1.crearCafetera();

        
        
        do {

            System.out.println("Llenar cafetera: opción 1");
            System.out.println("Servir taza: opción 2");
            System.out.println("Vaciar cafetera: opción 3");
            System.out.println("Agregar café: opción 4");
            System.out.println("Mostrar cafetera: opción 5");

            switch (leer.nextInt()) {

                case 1:
                    c1.llenarCafetera(ca);
break;
                case 2:
                    c1.servirTaza(ca);
break;
                case 3:
                    c1.vaciarCafetera(ca);
break;
                case 4:
                    c1.agregarCafe(ca);
                    break;
                case 5: 
                    c1.mostrarCantActual(ca);
            }

            System.out.println("Desea continuar? s para continuar, o cualquier tecla para salir ");

            resp = leer.next().charAt(0);

        } while (resp == 's');

    }

}
