
package ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio18 {
   
    public static void main(String[] args) {
        // TODO code application logic here
        // ESTE EJERCICIO ESTA MAL
        
         int n1 = 1;
         int n2 = 1;
         int n3 = 0;
         int contador = 2;
         String serie = n1 + " " + n2 + " " ;
        
         int nroFinal = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros quieres de la serie de Fibonacci? "));
        
            while (contador < nroFinal){
                
 
                    n3 = n1 + n2;
                    serie = serie + n3 + " ";
                    contador ++;

                    n1 = n2;
                    n2 = n3;
            }
                JOptionPane.showMessageDialog(null, serie);
            
        }
         
         
         
}
    

