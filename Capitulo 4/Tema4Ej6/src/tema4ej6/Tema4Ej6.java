
package tema4ej6;

import javax.swing.JOptionPane;

public class Tema4Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Contrl de faltas de asistencia de los alumnos.
        
        int[][] arrayFaltas = new int [30][5];
        
        for(int x=0; x < 30; x++)
        {
            for(int y=0; y < 5; y++)
            {                 
                arrayFaltas[x][y] = 0;  
            }
        }
        
        String continuar = "n";
        
        int mes;
        int alumno;
        do
        {
            mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el día  de Noviembre 1 - 30: "));
            alumno = Integer.parseInt(JOptionPane.showInputDialog("Teclea el codigo del alumno  1 - 5"));

            if (arrayFaltas[alumno-1][mes-1] != 0)
            {
                JOptionPane.showMessageDialog(null, "Ya has introducido datos aquí!!!!");
            }
            else
            {
                // Entrada y suma de faltas
                int faltas = Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero de faltas"));

                arrayFaltas[mes-1][alumno-1] = faltas;
                
            }
            continuar = JOptionPane.showInputDialog("Desea continuar? S/N");

        }
        while(continuar.charAt(0)=='s' || continuar.charAt(0)=='S');
        
        mostrarDatos(arrayFaltas);
        
    }
    
    
    public static void mostrarDatos(int arrayFaltas[][])
    {
        
        for(int x=0; x < 5; x++){
            //variable para saber las faltas 
            float faltas = 0;

            int y = 0;
                for(y=0; y < 30; y++)
                {                 
                   //los litros que han caido en el dia y suma 
                   faltas = faltas + arrayFaltas[x][y];
                  
                }

                //mostrar dia + faltas
                if (arrayFaltas[x-1][y-1] != 0)
                {
                 
                    JOptionPane.showMessageDialog(null,"En el día " + (y+1) + " el alumno " + (x+1) + " acumula " + faltas);
                }
            }
    }
    
    
}
