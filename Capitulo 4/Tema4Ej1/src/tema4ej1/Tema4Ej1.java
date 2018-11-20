package tema4ej1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Tema4Ej1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        float arrayNumeros[] = new float[10];
        tratarNumero(arrayNumeros);
        tratarMaxMin(arrayNumeros);
    }
    
    
    public static void tratarNumero(float[] numeros){
        
        for(int x=0; x < 10; x++)
        {
            try
            {
                float numero = Float.parseFloat(JOptionPane.showInputDialog("Introduce un Numero!"));
            
                numeros[x] = numero;
                System.out.println(numeros[x]);
            }
            catch(Exception e)
            {
                System.out.println("No has introducido un numero, campeon" + e.getMessage());
            
            }
        
        }
    
    }
    
    public static void tratarMaxMin(float[] numeros){
    
    float minimo = 99999999999999999f;
    float maximo = 0;
    
        for(int x=0; x < 10; x++)
        {
            if(maximo < numeros[x])
            {
                maximo = numeros[x]; 
            }
            if(minimo > numeros[x])
            {
                minimo = numeros[x];
            }

        }
        
        JOptionPane.showMessageDialog(null, "El numero maximo es " + maximo + "\n"
                + "El numero minimo es " + minimo);
        
        Arrays.sort(numeros);
        
        JOptionPane.showMessageDialog(null, "El numero maximo es " + numeros[numeros.length - 1] + "\n"
                + "El numero minimo es " + numeros[0]);
    }
    
    
}