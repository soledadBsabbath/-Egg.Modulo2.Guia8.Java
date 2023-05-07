package Main;

import Entidad.Raices;
import Servicio.RaicesServicio;

public class JavaGuia8Extra1_Raices {

  
    public static void main(String[] args) {
        
        RaicesServicio raices1 = new RaicesServicio();
        
        Raices raices2 = new Raices(1,2,1);
        
        raices1.calcular(raices2);
    }
    
}
