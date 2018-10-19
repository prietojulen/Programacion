
package ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio17 {

    //public static int contador = 0; -- No aparece en la funcion, no es necesaria como global.
    public static int maximo = -1;
    public static String nombreMax;
    public static int minimo = 11;
    public static String nombreMin;
 
    
    public static void main(String[] args) {
        // Teclea la nota -- Muestra por pantalla  la nota mas alta y la nota mas baja + nombre
        int contador;
        
        for(contador = 0; contador <=40 ; contador++){
        int nota=Integer.parseInt(JOptionPane.showInputDialog("Teclea la calificacion"));
        String nombre = JOptionPane.showInputDialog("Teclea el nombre de un alumno");
        
         calcularMaxMin(nota, nombre);
        
         contador ++;
         
    }
        
        JOptionPane.showMessageDialog(null, nombreMax + " es el alumno con la calificacion mas alta " + 
                maximo + " | " + nombreMin + " es el alumno con la calificacion mas baja " + minimo);
        
        
        
    }
    
    public static void calcularMaxMin(int nota, String nombre){
        
        if (nota > maximo)
        {
            maximo= nota;
            nombreMax = nombre;
        }
        if (nota < minimo)
        {
            minimo= nota;
            nombreMin = nombre;
        }
    
    
    }
    
    
    
}
