package ejercicio;

    import javax.swing.JOptionPane;

public class Ejercicio16 {

    public static int contador = 0;
    public static int sumaEdades = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        String respuesta = "si";
        
        while (respuesta.equals("si")){
            
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Teclea una edad"));
       
            contador ++;
            //sumaEdades +=edad; es lo mismo
            sumaEdades = sumaEdades + edad;
            
            
            //int respuesta = JOPtionPane.shoeConfirmDialog(null,"");
            //devuelve un 0 si hacemos click en la primera opcion, un 1 si le damos a la segunda
            respuesta = JOptionPane.showInputDialog("¿Quieres continuar? SI/NO");
         
        }
      
        
            JOptionPane.showMessageDialog(null,"La edad media es " + (sumaEdades/contador));
        
        
    }
    
}
