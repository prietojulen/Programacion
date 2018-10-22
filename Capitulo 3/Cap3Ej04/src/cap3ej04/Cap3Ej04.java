package cap3ej04;

import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Cap3Ej04 {

    public static void main(String[] args) {
        // TODO code application logic here
        
            Date fechaHoy = new Date();
            System.out.println("Hoy es " + fechaHoy);
            
            Date fechaUno = JOptionPane.showInputDialog("Introduce la fecha mas lejana  dd/mm/yyyy ");
            
            Date fechaDos;
            
            Date fechaTres = fechaTres.getDay();
        
            JOptionPane.showInputDialog("Hay " + (fechaUno.-fechaDos) + " dias de diferencia" );
            
        
        
        
        
        /*LocalDAte date = LocalDate.now();
        LocalDate fechaInicio;
        LocalDate fechafin;
        
            int dias=(int) ((fechafin.getTime()-fechafin.getTime())/86400000);

            System.out.println("Hay "+dias+" dias de diferencia");*/
        
        
        
    }
    
}
