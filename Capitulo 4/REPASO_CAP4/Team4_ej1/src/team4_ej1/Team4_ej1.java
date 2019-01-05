package team4_ej1;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class Team4_ej1 {

    private static String frase;

    public static void main(String[] args) {
        // TODO code application logic here
        
        char[] abecedario = new char[27];
        int[] contador = new int[27];
        
        rellenarArray(abecedario);
        introducirFrase();
        contarCaracteres(abecedario,contador);
        mostrarResultado(abecedario,contador);
     
    }
    
    public static void rellenarArray(char[] abecedario){
    
        
        for(int x=0;x < 27;x++){
            String letraEntrada = JOptionPane.showInputDialog("Introduce una letra");
            char letra;
            letra = Character.toLowerCase(letraEntrada.charAt(0));

            /*while(Arrays.binarySearch(abecedario, 0, abecedario.length, letra) != -1){
                letraEntrada = JOptionPane.showInputDialog("Introduce una letra valida");
                letra = letraEntrada.charAt(0);
            }*/

            abecedario[x] = letra;
        }
        
    }
    
    public static void introducirFrase(){
    
        frase = JOptionPane.showInputDialog("Introduce una frase en minusculas");
        frase = frase.toLowerCase();
    }
    
    public static void contarCaracteres(char[] abecedario,int[] contador){
        
        char[] aux = frase.toCharArray();
    
        for(int x=0;x < abecedario.length ;x++){
        
            for(int y=0;y < aux.length; y ++){
            
                if(Character.compare(abecedario[x], aux[y]) == 0){
                    contador[x] = contador[x] +1;
                }
            }
        }    
    }
    
    public static void mostrarResultado(char[] abecedario,int[] contador){
    
        String salida="";
        for(int z=0; z < 27; z++){
            
            
            
            
            salida+="Letra " + abecedario[z] + " = " + contador[z] + "\n";
        
            
        }
        
        JOptionPane.showMessageDialog(null, salida);

    }
    
    
}
