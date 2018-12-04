
package tema6ej1;

import MisClases.Circunferencia;
import javax.swing.JOptionPane;

public class Tema6Ej1 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        operaciones();
   
    }
    
    public static void operaciones(){
    
        Circunferencia c1;
        
        c1 = new Circunferencia();
        c1.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Introduce radio")));
        
        
        c1.calcularLongitud();
        c1.calcularArea();
        c1.calcularVolumen();
        
        JOptionPane.showMessageDialog(null, "La longitud para tu radio de " + c1.getRadio() + " es de " + c1.getLongitud() + "\n"
                + "El area es de  " + c1.getArea() + "\n"
                + "El volumen es de " + c1.getVolumen());
        
    }

}
