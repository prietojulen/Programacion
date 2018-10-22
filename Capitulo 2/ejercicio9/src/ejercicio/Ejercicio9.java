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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String nota = javax.swing.JOptionPane.showInputDialog(null,"Introduce una nota");
            int notaNum = Integer.parseInt(nota);
            
          if (notaNum < 0 || notaNum >10)
          {
                javax.swing.JOptionPane.showMessageDialog(null,"Introduce una nota valida");
            }
          else
          {
              if (notaNum < 4)
              {
                  javax.swing.JOptionPane.showMessageDialog(null,"Deficiente");
              }
              else
              {
                  if (notaNum < 5)
                  {
                     javax.swing.JOptionPane.showMessageDialog(null,"Insuficiente");
                  }
                  else
                  {
                     if (notaNum < 6)
                     {
                          javax.swing.JOptionPane.showMessageDialog(null,"Sufi");
                      }
                     else
                     {
                        if (notaNum < 7)
                        {
                             javax.swing.JOptionPane.showMessageDialog(null,"Bien");
                        }
                        else
                        {
                            if (notaNum < 9)
                            {
                                javax.swing.JOptionPane.showMessageDialog(null,"Notable");
                             }
                            else
                            {
                                if (notaNum > 9)
                                {
                                javax.swing.JOptionPane.showMessageDialog(null,"Sobresaliente!");
                                }
                            
                            }
                    
                  }
                  }
                  }
                  }
              }
          
          }
            
        
        
}
    

