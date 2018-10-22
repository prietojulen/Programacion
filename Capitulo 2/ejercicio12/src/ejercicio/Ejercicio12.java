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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String consumo = javax.swing.JOptionPane.showInputDialog("Teclea tu consumo personal");
         int consumoNum = Integer.parseInt (consumo);
         double importe = 0;
         
         if (consumoNum > 300)
         {
         if (consumoNum > 500){
             importe = 300 * 0.03 + (consumoNum-300)*0.02;
             if (consumoNum > 800){
                 importe = importe - importe*1.25/100;
             }
         }
         else
            {
               importe = consumoNum * 0.03; 
            }
         
         }
         else
         {
             importe = consumoNum * 0.04;
         }
        
            javax.swing.JOptionPane.showMessageDialog(null,"Tu consumo este mes tiene un importe de " + importe);
        
    }
    
}
