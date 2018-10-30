package cap3_repasofinal03;

import javax.swing.JOptionPane;
public class Cap3_RepasoFinal03 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
       int accion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué deseas hacer? \n 1.- Sumar \n 2.- Restar \n 3.-Multiplicar \n 4.- Cociente y resto \n 5.- Salir"));
       
       do
       {
                do
                {


                }
                while(accion <=4 && accion >= 1);


        }
        while(accion > 5 && accion > 1);
       
        
    }
    
}
