package ejercicio14;
        
        import javax.swing.JOptionPane;
        

public class Ejercicio14 {
    
    public static int contador = 0;
    public static int suma = 0;


    public static void main(String[] args) {
        // teclea 5 numeros a sumar
        do
        {
            int n = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero")) ;
            
            suma = suma + n;
            
            contador ++;
        
        }
        
        while (contador !=5);
        
        JOptionPane.showMessageDialog(null, "El resultado es " + suma);
        
    }
    
}
