
package tema5ej1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tema5Ej1 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ArrayList <Double> numeros = new ArrayList();
        
        
       String continuar = "";
       Double valor;

       do
       {
        valor = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
           
        numeros.add(valor);
           
        continuar = JOptionPane.showInputDialog("¿Desea continuar? \n Teclea FIN para continuar");
        continuar = continuar.toUpperCase();
        
       }
       while(continuar.equals("FIN"));
        
        menu(numeros); 
            
        
    }
    
    public static void menu(ArrayList<Double> numeros){
    
        int opc=0;
        
        do
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opción 1 - 10 \n" 
                + "1.- Visualizar valor MAXIMO y MINIMO \n"
                + "2.- Solicitar numero y buscarlo. ¿Se ha encontrado el número? \n"
                + "3.- Solicitar numero y borrarlo. Si no existe Error \n"
                + "4.- Convertir ArrayList en array \n"
                + "5.- Si no está vacio, mostrar el elemento que contiene \n"
                + "6.- Insertar un nuevo elemento por el final \n"
                + "7.- Insertar un nuevo elemento en la posicion que indique el usuario \n"
                + "8.- Borrar el elemento de una posición concreta \n"
                + "9.- Calcular la suma y la media aritmtica de los valores contenidos \n"
                + "10.-Finalizar")); 
            
            seleccion(opc,numeros);
        }
        while(opc !=10);

    }
    
    
    public static void seleccion(int opc,ArrayList<Double> numeros)
    {
        switch(opc)
        {
            case 1: opc1(numeros);
                break;
            case 2: opc2(numeros);
                break;
            case 3: opc3();
                break;
            case 4: opc4();
                break;
            case 5: opc5();
                break;
            case 6: opc6(numeros);
                break;
            case 7: opc7(numeros);
                break;
            case 8: opc8();
                break;
            case 9: opc9();
                break;
            case 10: break;
            default : JOptionPane.showInputDialog("Introduce una opcion valida");
        }
        
    }
    
    
    public static void opc1(ArrayList<Double> numeros){
    
        Double maximo = 0.0;
        Double minimo = 99999999.0;
        
        for(int x=0; x > numeros.size() ; x++)
        {
            //Double aux = numeros.get(x);
            
            if(numeros.get(x) > maximo)
            {
                maximo = numeros.get(x);
            
            }
            if(numeros.get(x) < minimo)
            {
                minimo = numeros.get(x);
            }
 
        }  
        
        JOptionPane.showMessageDialog(null, "El numero mínimo es " + minimo + " \n"
                + "El numero máximo es " + maximo);
        

    }
    public static void opc2(ArrayList<Double> numeros){
        
        Double buscar = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero para buscar"));
    
        int resultado = numeros.indexOf(buscar);
        
        if(resultado != -1)
        {
            JOptionPane.showMessageDialog(null, "¡He encontrado tu numero!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "¡No he encontrado tu numero :'( ");
        }
        
        /*
        for(int x=0; x > numeros.size() ; x++){
            
            if(buscar == numeros.get(x))
            {
                JOptionPane.showMessageDialog(null, "¡He encontrado tu numero!");
            
            }
            else
            {
                JOptionPane.showMessageDialog(null, "¡No he encontrado tu numero :'( ");
            }
        
        }
        */
    
    
    }
    public static void opc3(){}
    public static void opc4(){}
    public static void opc5(){}
    
    public static void opc6(ArrayList numeros)
    {
      //Introducimos un numero al final del ArrayList
      Double valor;  
        
      valor = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
           
      numeros.add(valor);  

      
     
    }
    public static void opc7(ArrayList numeros){
    //Insertamos un numero en la posicion que nos indiquen
        
    Double valor; 
    int posicion;
        
    valor = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
    posicion = Integer.parseInt(JOptionPane.showInputDialog("¿En qué posición lo quieres insertar?"));
    
    numeros.add(posicion,valor);

    }
    public static void opc8(){}
    public static void opc9(){}
    public static void opc10(){}
    

    
}
