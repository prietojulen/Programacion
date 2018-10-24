package cap3ej05;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Cap3Ej05 {

  
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Pedimos los datos de entrada
        String diaString = JOptionPane.showInputDialog("Introduce DÍA");
        String mesString = JOptionPane.showInputDialog("Introduce MES");
        String añoString = JOptionPane.showInputDialog("Introduce AÑO");
        
        //Creamos una cadena con los datos y la convertimos al formato dd-MM-yyyy
        String fechaString = diaString + "-" + mesString + "-" + añoString;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        
         try{
            Date fecha = formatter.parse(fechaString);
            
            System.out.println(fecha);
            Long segundos1 = fecha.getTime()/1000;//dividido enetre 1000 para pasarlo a segundos
          
            System.out.println(segundos1);
            Long fechaModificada = segundos1 + 8640000;// fecha + 100 dias
            
            Date resultadoFecha = new Date(fechaModificada *1000);
            //String salida = resultadoFecha.getDate() + ',' + resultadoFecha.getDay();
            
            
            //.getDay() devuelve un numero --0 = domingo 6 = sabado
            int diaLetras = resultadoFecha.getDay();
            String diaLetrasFin = "";
            
            
            
            switch(diaLetras){
                case 0 : diaLetrasFin = "Domingo";
                    break;
                case 1 : diaLetrasFin = "Lunes";
                    break;
                case 2 : diaLetrasFin = "Martes";
                    break;
                case 3 : diaLetrasFin = "Miercoles";
                    break;
                case 4 : diaLetrasFin = "Jueves";
                    break;
                case 5 : diaLetrasFin = "Viernes";
                    break;
                case 6 : diaLetrasFin = "Sabado";
                    break;    
                
            }
           
            System.out.println(diaLetrasFin);
            //.gethMonth() devuelve un numero --0 = Enero // 11 = diciembre
            
            int mesLetras = resultadoFecha.getMonth();
            String mesLetrasFin = "";
            switch(mesLetras){
                case 0 : mesLetrasFin = "Enero";
                    break;
                case 1 : mesLetrasFin = "Febrero";
                    break;
                case 2 : mesLetrasFin = "Marzo";
                    break;
                case 3 : mesLetrasFin = "Abril";
                    break;   
                case 4 : mesLetrasFin = "Mayo";
                    break; 
                case 5 : mesLetrasFin = "Junio";
                    break;
                case 6 : mesLetrasFin = "Julio";
                    break; 
                case 7 : mesLetrasFin = "Agosto";
                    break;
                case 8 : mesLetrasFin = "Septiembre";
                    break;
                case 9 : mesLetrasFin = "Octubre";
                    break;
                case 10 : mesLetrasFin = "Noviembre";
                    break;
                case 11 : mesLetrasFin = "Diciembre";
                    break;    
            }
            
            System.out.println(mesLetrasFin);
            
            
            
            JOptionPane.showMessageDialog(null,"Tu fecha +100 dias es ...");
            JOptionPane.showMessageDialog(null,diaLetrasFin + ", "  + resultadoFecha.getDate() + " de " + mesLetrasFin + " de " + resultadoFecha.getYear()); 
        }
        catch(Exception e ){
               System.out.println("Problemas al convertir String en Date" + e.getMessage());

        }
        
        
    }

    private static String Date(long l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
