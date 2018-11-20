package tema4ej3;

import javax.swing.JOptionPane;


public class Tema4Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
            float[][] arrayMesDia = new float [12][31];
        
            for(int x=0; x < 12; x++){
                for(int y=0; y < 31; y++)
                {                 
                   arrayMesDia[x][y] = 0;  
                }
            }
            
         String continuar = "n";

         do
        {
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes 1 - 12: "));
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia"));

            if (arrayMesDia[mes-1][dia-1] != 0)
            {
                JOptionPane.showMessageDialog(null, "Ya has introducido datos aquí!!!!");
            }
            else
            {
                // Entrada y acumulacion de los litros caidos
                float litros = Float.parseFloat(JOptionPane.showInputDialog("Teclea los litros caídos: "));

                arrayMesDia[mes-1][dia-1] = litros;
                
            }
            continuar = JOptionPane.showInputDialog("Desea continuar? S/N");

        }
        while(continuar.charAt(0)=='s' || continuar.charAt(0)=='S');
        
        mostrarDatos(arrayMesDia);
    }
    
    public static void mostrarDatos(float arrayMesDia[][])
    {
        
        for(int x=0; x < 12; x++){
            //variable para saber los litros del mes en cuestion
            float litros = 0;

                for(int y=0; y < 31; y++)
                {                 
                   //los litros que han caido en el dia y suma 
                   litros = litros + arrayMesDia[x][y];
                  
                }
                //mostrar mes + litros
                JOptionPane.showMessageDialog(null,"En el mes " + (x+1) + " han caido " + litros + "L");
                
            }
        
    
    }

    
}
