/*
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad 
máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
el tamaño de la taza y simula la acción de servir la taza con la capacidad 
indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se 
sirve lo que quede. El método le informará al usuario si se llenó o no la taza, 
y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método 
lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import Entidad.Cafetera;

import java.util.Scanner;

public class CafeteraServicio {

    private Scanner leer = new Scanner(System.in);

    //Si quiero crear la cafetera primero con los datos:
    public Cafetera crearCafetera() {

        Cafetera caf = new Cafetera();

        System.out.println("Cafetera Nespresso: Capacidad máxima:1000 ml.");
        caf.setCapacidadMaxima(1000);

        // cant actual en cero:
        caf.setCantidadActual(0);

        return caf;
    }

    public void llenarCafetera(Cafetera caf) {

        caf.setCantidadActual(caf.getCapacidadMaxima());

        System.out.println("Cafetera llena");
    }

    public void servirTaza(Cafetera caf) {

        System.out.println("Ingrese tamaño de taza en ml");
        int taza = leer.nextInt();

        if (caf.getCantidadActual() < taza) {

            System.out.println("La cantidad actual de café no alcanza para llenar la taza, se servirá " + caf.getCantidadActual() + " ml.");

            caf.setCantidadActual(0);

        } else {
            System.out.println("Taza servida");
        }

        caf.setCantidadActual(caf.getCantidadActual() - taza);
    }

    public void vaciarCafetera(Cafetera caf) {

        caf.setCantidadActual(0);

        System.out.println("Cafetera vacía");
    }

    public void agregarCafe(Cafetera caf) {

        System.out.println("Ingrese cantidad de café a agregar en ml.");
        int agregar = leer.nextInt();

        if (agregar > caf.getCapacidadMaxima()) {

            caf.setCantidadActual(caf.getCapacidadMaxima());

            System.out.println("Cafe agregado hasta la máxima capacidad posible");

        } else {

            caf.setCantidadActual(caf.getCantidadActual() + agregar);

            System.out.println("Cafe agregado");

        }

    }

    public void mostrarCantActual(Cafetera caf) {
        System.out.println(caf.getCantidadActual());
    }
}
