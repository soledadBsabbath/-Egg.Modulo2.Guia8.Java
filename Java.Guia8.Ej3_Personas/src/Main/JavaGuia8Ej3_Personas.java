/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos 
todos los métodos para cada objeto, deberá comprobar si la persona está en su peso 
ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada 
objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
en distintas variables(arrays), para después calcular un porcentaje de esas 4 
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, 
por encima, y también calcularemos un porcentaje de cuantos son mayores de edad 
y cuantos menores. Para esto, podemos crear unos métodos adicionales.
 */
package Main;

import Entidad.Persona;
import Servicio.PersonaServicio;

public class JavaGuia8Ej3_Personas {

    public static void main(String[] args) {

        PersonaServicio p = new PersonaServicio();

        Persona[] pers = new Persona[4]; /// INICIALIZA LOS OBJETOS COMO VECTOR
        double[] imc = new double[4];   /// INICIALIZA VECTOR PARA ALMACENAR LOS 4 IMC
        boolean[] mayorEdad = new boolean[4]; /// INICIALIZA VECTOR PARA ALMACENAR LOS RESULTADOS

        for (int i = 0; i < 4; i++) {
           pers[i] = p.crearPersona();
            mayorEdad[i] = p.esMayorEdad(pers[i]);
            imc[i] = p.calcularIMC(pers[i]);
        }

        int contMayor = 0;
        int contMenor = 0;
        int contDebajoPeso = 0;
        int contPesoIdeal = 0;
        int contSobrepeso = 0;

        for (int i = 0; i < 4; i++) {

            if (mayorEdad[i] == true) {
                contMayor++;
            } else {
                contMenor++;
            }

            if (imc[i] == -1) {
                contDebajoPeso++;

            } else if (imc[i] == 0) {
                contPesoIdeal++;

            } else if (imc[i] == 1) {
                contSobrepeso++;

            }
        }

        System.out.println("Porcentaje de personas menores de edad:" + (contMenor * 100) / 4);
        System.out.println("Porcentaje de personas mayores de edad:" + (contMayor * 100) / 4);
        System.out.println("Porcentaje de personas que se encuentran por debajo de su peso ideal:" + (contDebajoPeso * 100) / 4);
        System.out.println("Porcentaje de personas que se encuentran en su peso ideal:" + (contPesoIdeal * 100) / 4);
        System.out.println("Porcentaje de personas que se encuentran con sobrepeso:" + (contSobrepeso * 100) / 4);
    }

}
