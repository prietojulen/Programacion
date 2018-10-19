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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String D = javax.swing.JOptionPane.showInputDialog("Introduce una diagonal");
        int Dnum = Integer.parseInt(D);
        
        String d = javax.swing.JOptionPane.showInputDialog("Introduce la segunda diagonal");
        int dnum = Integer.parseInt(d);
        
        int area= Dnum*(dnum/2);
        
        javax.swing.JOptionPane.showMessageDialog(null,"El area de tu rombo es " + area);
        
        
    }
    
}
