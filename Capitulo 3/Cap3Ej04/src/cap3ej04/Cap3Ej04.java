package cap3ej04;

import java.text.SimpleDateFormat;  
import static java.time.Clock.system;
import java.util.Date; 
import javax.swing.JOptionPane;
import java.util.Date;

public class Cap3Ej04 {

    public static void main(String[] args) {
        // TODO code application logic here
        
    
        String fechaString1 = JOptionPane.showInputDialog("Teclea una fecha dd-MM-yyyy");
        String fechaString2 = JOptionPane.showInputDialog("Teclea una fecha dd-MM-yyyy");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        
        
        try{
            Date fecha1 = formatter.parse(fechaString1);
            Date fecha2 = formatter.parse(fechaString2);
            System.out.println(fecha1);
            System.out.println(fecha2);
            Long segundos1 = fecha1.getTime()/1000;//dividido enetre 1000 para pasarlo a segundos
            Long segundos2 = fecha2.getTime()/1000;
            
            System.out.println(segundos1 + "|" + segundos2);
            
            Long resultado;
            if(segundos1 > segundos2){
                 resultado = segundos1 -segundos2;
                 resultado = resultado / 86400;// segundos de un dia
            }
            else{
                resultado = segundos2 - segundos1;
                resultado = resultado / 86400;
            }
            
             JOptionPane.showMessageDialog(null, "La diferencia es de " + resultado + " día(s)" );
          
             
        }
        catch(Exception e ){
               System.out.println("Problemas al convertir String en Date" + e.getMessage());

        }
        
        
 
        
        
    }
    
}
