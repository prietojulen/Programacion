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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n1 = javax.swing.JOptionPane.showInputDialog("Introduce el primer numero");
        int n1Num = Integer.parseInt(n1);
        
        String n2 = javax.swing.JOptionPane.showInputDialog("Introduce el segundo numero");
        int n2Num = Integer.parseInt(n2);
        
        String n3 = javax.swing.JOptionPane.showInputDialog("Introduce el tercer numero");
        int n3Num = Integer.parseInt(n3);
        
        if (n1Num > n2Num && n1Num > n3Num)
        {
            javax.swing.JOptionPane.showMessageDialog(null, n1Num + " es el numero mas alto");
            
            if(n2Num > n3Num)
              {
                javax.swing.JOptionPane.showMessageDialog(null, n3Num + " es el numero mas bajo");

              }
                else
                    {
                       javax.swing.JOptionPane.showMessageDialog(null, n2Num + " es el numero mas bajo");
                    }
            
        }
        else
        {if (n2Num > n3Num)
            {
              javax.swing.JOptionPane.showMessageDialog(null, n2Num + " es el numero mas alto");
              if (n1Num > n3Num)
              {
                  javax.swing.JOptionPane.showMessageDialog(null, n3Num + " es el numero mas bajo");
              }else
                {
                javax.swing.JOptionPane.showMessageDialog(null, n1Num + " es el numero mas bajo");
                }
            }
            else
                {
                javax.swing.JOptionPane.showMessageDialog(null, n3Num + " es el numero mas alto");
                if (n1Num > n2Num)
                    {
                    javax.swing.JOptionPane.showMessageDialog(null, n2Num + " es el numero mas bajo");
                    }
                else
                    {
                    javax.swing.JOptionPane.showMessageDialog(null, n1Num + " es el numero mas bajo");
                    }
                     
                }
        
        }
        
    }
    
}
