
package repasocombobox;

import GUI.*;
import UML.*;
import java.util.ArrayList;

public class main {

   private static   VentanaComboBox Vcb;
   private static Contrato[] aContrato;
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        llenarContratos();
        
        Vcb = new VentanaComboBox();
        Vcb.setVisible(true);
        
        
    }
    
    public static void llenarContratos(){
    
         aContrato = new Contrato[8];
         aContrato[0] = new Contrato (1,"Indefinido");
         aContrato[1] = new Contrato (2,"Temporal");
         aContrato[2] = new Contrato (3,"Por obra o servicio");
         aContrato[3] = new Contrato (4,"Eventual");
         aContrato[4] = new Contrato (5,"Interinidad");
         aContrato[5] = new Contrato (6,"Relevo");
         aContrato[6] = new Contrato (7,"Formación y aprendizaje");
         aContrato[7] = new Contrato (8,"Prácticas");

    }
    
    public static void llenarComboBox(ComboBox cbContrato){
    
        int x;
        
        for(x=0; x < aContrato.length ; x++){
            
           GUI.VentanaComboBox.cbContrato.
        
        
        }
    
    
    }
    
    
    
    
}
