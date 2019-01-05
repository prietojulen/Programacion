package tema4_ej8;

import javax.swing.JOptionPane;


public class Tema4_ej8 {
    
    private static int fila = 0;
    private static int columna = 0;
    private static int numero = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] tabla = new int [5][5];
        
        pedirFila();
        pedirColumna();
        rellenarArray(tabla);
        mostrarResultado(tabla);
        
        char resp;
     
            pedirFila();
            pedirColumna();
            rellenarArray(tabla);
           /* 
            String respuesta = JOptionPane.showInputDialog("¿Desea continuar? S/N");
            respuesta = respuesta.toLowerCase();
            resp = respuesta.charAt(0);
            
            boolean comprobar = false;
            */
       
    }

    public static void pedirFila(){
    
        try{
            do{
                fila = Integer.parseInt(JOptionPane.showInputDialog("Introduce una fila del 1 al 5"));
                fila = fila -1;
            }
            while(fila < 0 || fila > 4);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No has introducido un valor lógico para la fina " + e.getMessage());
        }

    }
    
    public static void pedirColumna(){
    
        try{
            do{
                columna = Integer.parseInt(JOptionPane.showInputDialog("Introduce una columna del 1 al 5"));
                columna = columna -1;
            }
            while(columna < 0 || columna > 4);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No has introducido un valor lógico para la columna " + e.getMessage());
        }

    }
    
    public static void rellenarArray(int [][] tabla){
    
        try{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No has introducido un valor lógico para rellenar el array " + e.getMessage());
        }
        
        tabla[fila][columna] = numero;

    }
    public static void mostrarResultado(int [][] tabla){
    
        String salida="";
        
        for(int x=0; x < 5; x++){
            
            int total = 0;
            for(int y=0; y < 5; y++){
            
               
                total += tabla[x][y];
                
                       
            }
        salida+= ("FILA "+ (x+1) + " " + total ); 
       
        }
        JOptionPane.showMessageDialog(null, salida);
    
    }

}
