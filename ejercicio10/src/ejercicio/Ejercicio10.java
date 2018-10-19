/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author PETO
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String dia = javax.swing.JOptionPane.showInputDialog(null,"Introduce un numero del 1 al 7");
            int diaNum = Integer.parseInt(dia);
            
         if (diaNum < 1 || diaNum >7)
          {
                javax.swing.JOptionPane.showMessageDialog(null,"Introduce un dia valido");
            }
         switch(diaNum)
         {
            case 1:
                 javax.swing.JOptionPane.showMessageDialog(null,"Es LUNES!");
            break;
            case 2:
                 javax.swing.JOptionPane.showMessageDialog(null,"Es MARTES!");
            break;
            case 3:
                 javax.swing.JOptionPane.showMessageDialog(null,"Es MIERCOLES!");
            break;
            case 4:
                 javax.swing.JOptionPane.showMessageDialog(null,"Es JUEVES!");
            break;
            case 5:
                 javax.swing.JOptionPane.showMessageDialog(null,"Es VIERNES!");
            break;
            case 6:
                 javax.swing.JOptionPane.showMessageDialog(null,"Es SABADO!");
            break;
            case 7:
                 javax.swing.JOptionPane.showMessageDialog(null,"Es DOMINGO!");
            break;
          //  default:
          //     javax.swing.JOptionPane.showMessageDialog(null,"ERROR");
          //  break;
            
         }
        
    }
    
}
