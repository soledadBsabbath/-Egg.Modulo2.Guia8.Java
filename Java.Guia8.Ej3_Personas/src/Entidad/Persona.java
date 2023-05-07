/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los 
siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ 
para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. 
Agregar constructores, getters y setters.
*/

package Entidad;

public class Persona {
    
    
    public String nombre;
    public int edad;
    public char sexo;
    public double peso;
    public double altura;

    
    
    public Persona() {
    }

    
   
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public int getEdad() {
        return edad;
    }

    
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    public char getSexo() {
        return sexo;
    }

    
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    
    
    public double getPeso() {
        return peso;
    }

    
    
    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    
    public double getAltura() {
        return altura;
    }

    
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
            
    
    
    
    
}
