
package tema4ej_6;

import javax.swing.JOptionPane;

public class Tema4Ej_6 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int arrayCodAlu[] = new int [5];
        int arrayFaltas[] = new int [31];
        
        entrada();

    }
    
    public static void entrada(){
    
        int dia;
            
            try
            {
                do
                {
                  dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce día 1-30"));
                }
                while(dia < 0 || dia < 31);
            
            }
            catch(Exception e)
            {
                System.out.println("No has introducido un dato valido" + e.getMessage());
            }
        
        
        
        int codAulu = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del alumno"));        
        int faltas = Integer.parseInt(JOptionPane.showInputDialog("Introduce Nº de faltas"));
    
    }
    
    public static void salida(){
    
        JOptionPane.showMessageDialog(null, "El alumno" + );
    
    
    
    
    
    
    
    }
    
    
    
    
}
