
package ejercicio;

    import javax.swing.JOptionPane;

public class Ejercicio15 {

        public static int contador = 0;
    
    public static void main(String[] args) {
        String respuesta;
        do{
        // Introduce notas 
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce nota"));
        
           if(nota >= 6)
           {
               contador ++;
               
           }
           //con la expresion .charAt(0) se le indica que solo coja el primer valor del "String"
           //respuesta = JOptionPane.showInputDialog("¿Quieres continuar? S/N").charAt(0);
           respuesta = JOptionPane.showInputDialog("¿Quieres continuar? SI/NO");
        }
        
        while (respuesta.equals("si"));
        
        JOptionPane.showMessageDialog(null,"Hay " + contador + " aprobado(s)");

        
    }
    
}
