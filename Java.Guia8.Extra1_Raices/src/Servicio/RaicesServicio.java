/*
Luego, en RaicesServicio 
las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
para que esto ocurra, el discriminante debe ser igual que 0.
 */
package Servicio;

import Entidad.Raices;


public class RaicesServicio {

    
Raices raiz = new Raices();


double discriminante = 0;


public double getDiscriminante (Raices raiz){
    
   discriminante = (Math.pow(raiz.getB(), 2)- 4*raiz.getA()* raiz.getC());
  
   return discriminante;
}

public boolean tieneRaices (Raices raiz) {
    
   return (getDiscriminante(raiz) >= 0); //SI SE DA ESA CONDICION, DA TRUE X DEFECTO
}

public boolean tieneRaiz (Raices raiz) {
    
    return (getDiscriminante(raiz) == 0); //SI SE DA ESA CONDICION, DA TRUE X DEFECTO
 } 

/*
Método obtenerRaices(): llama a tieneRaices() y si devolvió́ true, imprime las 
2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única 
raíz. Es en el caso en que se tenga una única solución posible.
Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b

*/

public void obtenerRaices (Raices raiz) {
    
    if (tieneRaices (raiz) == true) {
        
        double raizC = Math.sqrt(discriminante);
        
        double solucion1 = (-raiz.getB()+ raizC)/2*raiz.getA();
        double solucion2 = (-raiz.getB()- raizC)/2*raiz.getA();
        System.out.println("Las dos posibles soluciones son : " + solucion1 + " y " + solucion2);
    }
}

public void obtenerRaiz (Raices raiz) {
    
    if (tieneRaiz (raiz) == true) {
        
        double solucion = -raiz.getB()/2*raiz.getA();
       
        System.out.println("La única solucion es " + solucion);
    }
}  

/*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y 
mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con 
los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros 
métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el 
signo delante de -b
*/

public void calcular(Raices raiz){
    
    if (tieneRaices(raiz) == true) {
        obtenerRaices(raiz) ;
    } else if (tieneRaiz(raiz) == true) {
        obtenerRaiz(raiz) ;
    } else 
        System.out.println(" No existen posibles soluciones");
    
}
}
