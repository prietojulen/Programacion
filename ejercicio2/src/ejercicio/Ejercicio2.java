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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       String n1 = javax.swing.JOptionPane.showInputDialog("Introduce el primer numero");
        int n1num = Integer.parseInt(n1); 
        
         String n2 = javax.swing.JOptionPane.showInputDialog("Introduce el segundo numero");
        int n2num = Integer.parseInt(n2); 
        
        int resultado  = n1num * n2num;
        javax.swing.JOptionPane.showMessageDialog(null, "El resultado de " + n1 +"x" + n2 + "=" + resultado);
        
        
    }
    
}
