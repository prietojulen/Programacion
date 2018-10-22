
package ejercicio13;

        import javax.swing.JOptionPane;

public class Ejercicio13 {
    
   public static int contador = 0;
   public static int contadorChicas = 0;
   public static int contadorChicos = 0;

       
       
       public static void main(String[] args){
         
           
             for (contador = 1; contador <=2 ; contador = contador +1){
                     
                 String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
                 String sexo = JOptionPane.showInputDialog("Introduce tu sexo (masculino / femenino) ");
                 String edad = JOptionPane.showInputDialog("Introduce tu edad ");
       
                 String altura = JOptionPane.showInputDialog("Introduce tu altura en cm");
                 int alturaNum = Integer.parseInt(altura);
       
                 String peso = JOptionPane.showInputDialog("Introduce tu peso en Kg");
                 int pesoNum = Integer.parseInt(peso);
                 
                 //apto - no apto
                 tratarApto(sexo, alturaNum,  pesoNum);
                 
                 
             }
           
                 JOptionPane.showMessageDialog(null, "Chicas aptas " + contadorChicas + " | Chicos aptos" + contadorChicos);
               
       
       }
       
  
    public static void tratarApto(String sexo, int alturaNum, int pesoNum){
    
            if (sexo.equals("femenino"))
            {
               
                if (alturaNum >= 160 && pesoNum >= 60)
                {
                    contadorChicas ++;
                
                }
                
            }
            else
            {
                if (alturaNum >= 170 && pesoNum >= 70)
                {
                    contadorChicos ++;
                }
            }
    
    
    }   
    
        
}
    

