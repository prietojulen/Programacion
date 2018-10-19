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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String rad = javax.swing.JOptionPane.showInputDialog(null,"Introduce un radio");
        int radNum = Integer.parseInt(rad);
        
        Double area = Math.PI * radNum * radNum;
        
        javax.swing.JOptionPane.showMessageDialog(null, "El area es " + area);
        
    }
    
}
