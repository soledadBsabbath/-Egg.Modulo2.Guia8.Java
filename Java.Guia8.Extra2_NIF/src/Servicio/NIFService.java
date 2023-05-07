/*
En NIFService se dispondrá de los siguientes métodos:
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que 
le corresponderá. Una vez calculado, le asigna la letra que le corresponde según

Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la 
letra en mayúscula; por ejemplo: 00395469-F).

La letra correspondiente al dígito verificador se calculará a traves de un método 
que funciona de la siguiente manera: Para calcular la letra se toma el resto de 
dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). 
El método debe buscar en un array (vector) de caracteres la posición que 
corresponda al resto de la división para obtener la letra correspondiente. 
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;


public class NIFService {
    Scanner leer = new Scanner (System.in);
    

char [] letras = new char []{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D','X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

//NIFService nif1 = new NIFService();

public NIF crearNif (){
    
    NIF nif1 = new NIF ();
    
    System.out.println("Ingresar n° DNI");
    nif1.setDNI(leer.nextLong());
    
    long num = nif1.getDNI()%23;

    for (int i = 0; i < 23; i++) {
        
        if (num == i) {
            
            nif1.setLetra(letras[i]);
        }
    }
   
    return nif1;
}

public void mostrar (NIF nif1) {
    System.out.println("NIF: "+ nif1.getDNI() + " - " + nif1.getLetra() );
}


}
