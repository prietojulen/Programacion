package repasotema5_ej1;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class RepasoTema5_ej1 {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double> numeros = new ArrayList();
        
        Menu(numeros);
        //EntradaDatos(numeros);
    }
    
    public static void EntradaDatos(ArrayList<Double> numeros){
        boolean validar = false;
        do{
            try{
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero real"));
            validar=true;
            numeros.add(numero);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Opción no válida. Necesitamos un número del 1 al 10");
            }
        }
        while(validar=true);

    }
    
    
    public static void Menu(ArrayList<Double> numeros){
        int opcion = 0;
        do{
            try
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Indica la operación que deseas realizar: \n "
                        + "1.- Visualizar máximo y mínimo \n "
                        + "2.- Buscar un número \n"
                        + "3.- Borrar un número \n"
                        + "4.- Convertir en un array \n"
                        + "5.- Mostrar el numero de elementos que contiene. \n" 
                        + "6.- Inserta un nuevo elemento por el ﬁnal.\n" 
                        + "7.- Inserta un nuevo numero en una posición concreta \n" 
                        + "8.- Borra un elemento de una posicion concreta. \n"
                        + "9.- Calcular la suma y la media aritmética de los valores contenido. \n"
                        + "10.- Fin"));
                switch(opcion)
                {
                    case 1:
                        opc1(numeros);
                        break;
                     case 2:
                        opc2(numeros);
                        break;   
                     case 3:
                        opc3(numeros);
                        break;
                     case 4:
                        opc4(numeros);
                        break;
                     case 5:
                        opc5(numeros);
                        break;
                    case 6:
                       opc6(numeros);
                       break;
                    case 7:
                       opc7(numeros);
                       break;
                    case 8:
                       opc8(numeros);
                       break;
                    case 9:
                        opc9(numeros);
                       break;
                    case 10:
                        break;
                 }
            }
            
            catch(Exception e)
            {
                    JOptionPane.showMessageDialog(null,"Opción no válida. Necesitamos un número del 1 al 10");
            }
        }
        while(opcion!= 10);
    }

    
    public static void opc1(ArrayList<Double> numeros){
        //Visualizar máximo y mínimo
        
            Double maximo= 0.0;
            Double minimo = 9999999.0;
        
        for(int x=0; x < numeros.size(); x++){
        
           if(minimo > numeros.get(x)){minimo = numeros.get(x);}
           if(maximo < numeros.get(x)){maximo = numeros.get(x);}
        }
        JOptionPane.showMessageDialog(null,"Minimo = "+ minimo + "\n"
                + "Maximo = " + maximo);
        
    }
    public static void opc2(ArrayList<Double> numeros){
        //Buscar un número
        Double x = Double.parseDouble(JOptionPane.showInputDialog("¿Qué numero quieres buscar?"));
        
        if(numeros.indexOf(x) != -1){
            JOptionPane.showMessageDialog(null, "Numero encontrado!");
        }else{
            JOptionPane.showMessageDialog(null, "Numero NO encontrdo");
        }
    
    }
    public static void opc3(ArrayList<Double> numeros){
        //Borrar un número
        Double x = Double.parseDouble(JOptionPane.showInputDialog("¿Qué numero quieres borrar?"));
        
        if(numeros.indexOf(x) != -1){
            numeros.remove(x);
            JOptionPane.showMessageDialog(null, "Se ha borrado el numero " + x);
        }else{
            JOptionPane.showMessageDialog(null, "No existe el numero " + x + " en el ArrayList");
        }
    }
    
    public static void opc4(ArrayList<Double> numeros){
        //Convertir en un array
        Double [] arrayNumeros = new Double[numeros.size()];
        arrayNumeros = numeros.toArray(arrayNumeros);
    
    
    }
    public static void opc5(ArrayList<Double> numeros){
        //Mostrar el numero de elementos que contiene
        if(numeros.isEmpty()==false){
        
            JOptionPane.showMessageDialog(null,"El ArrayList tiene "+ numeros.size() + " elemento(s)");
          
        }else{
            
            JOptionPane.showMessageDialog(null,"El ArrayList está vacio");
            
        }
          
    }
    public static void opc6(ArrayList<Double> numeros){
        //Inserta un nuevo elemento por el ﬁnal
        Double x = Double.parseDouble(JOptionPane.showInputDialog("¿Qué numero quieres insertar?"));
        numeros.add(x);
    }
    public static void opc7(ArrayList<Double> numeros){
        //Inserta un nuevo numero en una posición concreta
        int x = Integer.parseInt(JOptionPane.showInputDialog("¿En qué posición quieres insertar?"));
        Double y = Double.parseDouble(JOptionPane.showInputDialog("¿Qué numero quieres insertar?"));
        numeros.add(x, y);
    }
    
    public static void opc8(ArrayList<Double> numeros){ 
        //Borra un elemento de una posicion concreta
        int x = Integer.parseInt(JOptionPane.showInputDialog("¿Qué posición quieres borrar?"));
        numeros.remove(x);
    }
    
    public static void opc9(ArrayList<Double> numeros){
        //Calcular la suma y la media aritmética de los valores contenido
        Double suma = 0.0;
        for(int x=0; x < numeros.size(); x++){
            suma += numeros.get(x);
        }
         Double media = suma/numeros.size();
        JOptionPane.showMessageDialog(null, "Suma total = " + suma + " Media = " + media);
    }
    
}
