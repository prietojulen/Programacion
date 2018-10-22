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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cat1 = javax.swing.JOptionPane.showInputDialog(null,"Introduce un cateto");
        int cat1Num = Integer.parseInt(cat1);
        
        String cat2 = javax.swing.JOptionPane.showInputDialog(null,"Introduce un segundo cateto");
        int cat2Num = Integer.parseInt(cat2);
        
        Double hipo = Math.sqrt(Math.pow(cat1Num, 2) + Math.pow(cat2Num, 2));
        
        javax.swing.JOptionPane.showMessageDialog(null, "La hipotenusa es " + hipo);
        
    }
    
}
