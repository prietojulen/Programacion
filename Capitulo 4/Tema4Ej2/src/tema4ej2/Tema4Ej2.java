package tema4ej2;

import javax.swing.JOptionPane;

public class Tema4Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] meses = 
        {
        "enero", "febrero","marzo","abril","mayo","junio","julio", "agosto","septiembre","octubre","noviembre","diciembre"
        };
       
         String mes = JOptionPane.showInputDialog("Escribe un mes");
         mes = mes.toLowerCase();
         boolean encontrado = false;
         
         for(int x=0; x < 12; x++)
         {
             if(mes.equals(meses[x]))
             {
                 encontrado = true;
             }
         }
         if(encontrado == true)
         {
            JOptionPane.showMessageDialog(null,"Correcto");
         }
         else
             JOptionPane.showMessageDialog(null,"Tu mes no ha sido encontrado, aprende a escribir");
        
    }    
}
