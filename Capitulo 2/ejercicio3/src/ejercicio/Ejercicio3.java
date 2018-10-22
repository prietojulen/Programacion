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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String base = javax.swing.JOptionPane.showInputDialog("Introduce la base del rectangulo");
        int basenum = Integer.parseInt(base); 
        
         String altura = javax.swing.JOptionPane.showInputDialog("Introduce la altura del rectangulo");
        int alturanum = Integer.parseInt(altura); 
        
        int resultado  = (basenum*2) + (alturanum*2);
        javax.swing.JOptionPane.showMessageDialog(null, "El perimetro de tu rectangulo es " + resultado);
        
    }
    
}
