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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            String nota = javax.swing.JOptionPane.showInputDialog(null,"Introduce una nota");
            int notaNum = Integer.parseInt(nota);
            
             
             //si la nota es menos que 0 o mayor que 10, nota no valida
            if (notaNum < 0 || notaNum >10){
                javax.swing.JOptionPane.showMessageDialog(null,"Introduce una nota valida");
                //si la nota es menos que 5, suspenso
            }else { if (notaNum < 5){
                    javax.swing.JOptionPane.showMessageDialog(null,"Has suspendido");
            }else{
                //si la nota no es menor que 5, aprobado
                    javax.swing.JOptionPane.showMessageDialog(null,"¡Has aprobado!");
            }
            
            }
           

    }
    
}
