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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cent = javax.swing.JOptionPane.showInputDialog(null,"Introduce una temperatura en centigrados");
        int centNumero = Integer.parseInt(cent);
        
        double Far = 1.8*centNumero + 32;
        javax.swing.JOptionPane.showMessageDialog(null,cent + "ºC son " + Far + " grados Fahrenheit");
    }
    
}
