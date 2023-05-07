
package Main;

import Entidad.NIF;
import Servicio.NIFService;

public class JavaGuia8Extra2_NIF {

  
    public static void main(String[] args) {
       
        NIFService N = new NIFService();
        
       NIF nif1 = N.crearNif();
        
        N.mostrar(nif1);
    }
    
}
