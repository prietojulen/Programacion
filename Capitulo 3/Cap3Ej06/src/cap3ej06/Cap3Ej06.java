package cap3ej06;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Cap3Ej06 {


    public static void main(String[] args) {
        // Introduces una fecha -- recives la estación del año
        
        String fecha = JOptionPane.showInputDialog("Teclea una fecha dd-MM-yyyy");
        String primavera = "21-02";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM");
                
        try
        {
            Date fechaFin = formatter.parse(fecha);
            Long segundos = fechaFin.getTime()/1000;//dividido enetre 1000 para pasarlo a segundos
            int seg = segundos.intValue(); //switch no admite long, por lo que hay que pasarlo a int
            
            int dia = fechaFin.getDate();
            int mes =  fechaFin.getMonth();
            
            int mesPrimavera = 2;
            int mesVerano = 5;
            int mesOtoño = 8;
            int mesInvierno = 11;    
            
            if( fecha > primavera)
            {
            
            }
            
            
        
        }
        catch(Exception e ){
               System.out.println("Problemas al convertir String en Date" + e.getMessage());

        }
        
    }
    
}
