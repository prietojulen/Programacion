
package tema4ej8;

import javax.swing.JOptionPane;

public class Tema4ej8 {
    
    public static int suma;

    public static void main(String[] args) {
        // TODO code application logic here
     
        int[][] arrayBarcos = new int [10][10];
        
            for(int x=0; x < 10; x++){
                for(int y=0; y < 10; y++)
                {                 
                   arrayBarcos[x][y] = 0;  
                }
            }
            
         String continuar = "n";

         do
        {
            int fila = Integer.parseInt(JOptionPane.showInputDialog("Intoroduce una fila 0 - 10"));
            int columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce columna 0 - 10"));


                // Entrada y acumulacion de los litros caidos
                suma = Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero"));

                arrayBarcos[fila-1][columna-1] = suma;
                
            
            continuar = JOptionPane.showInputDialog("Desea continuar? S/N");

        }
        while(continuar.charAt(0)=='s' || continuar.charAt(0)=='S');
        
        mostrarDatos(arrayBarcos);
        
        
    }
    
    public static void mostrarDatos(int arrayBarcos[][])
    {
        
        for(int x=0; x < 10; x++){
            //variable para saber la suma de la fila
            int litros = 0;

                for(int y=0; y < 10; y++)
                {                 
                   //los litros que han caido en el dia y suma 
                   suma = suma + arrayBarcos[x][y];
                  
                }
                //mostrar mes + litros
                JOptionPane.showMessageDialog(null,"Fila " + (x+1) + " columna " + (y+1) + " = " + suma);
                
        }
    }
     
}
