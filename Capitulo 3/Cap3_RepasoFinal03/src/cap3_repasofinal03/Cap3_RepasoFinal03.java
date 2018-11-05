package cap3_repasofinal03;

import javax.swing.JOptionPane;
public class Cap3_RepasoFinal03 {
    public static int accion;
    public static int resultadoSuma;
    public static int resultadoResta;
    public static String resultadoMultiplicar = "\n ";
    public static int resultadoDivision;
    public static int resultadoResto;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
            try
            {
                do
                {
                    accion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué deseas hacer? \n 1.- Sumar \n 2.- Restar \n 3.- Multiplicar \n 4.- Cociente y resto \n 5.- Salir"));
                   
                    if(accion == 5)
                    {
                        JOptionPane.showMessageDialog(null, "Fin del programa");
                    }
                    else
                    {
                        switch(accion)
                             {
                                 case 1: suma();
                                      JOptionPane.showMessageDialog(null, "El resultado es " + resultadoSuma);
                                     break;
                                 case 2: resta();
                                      JOptionPane.showMessageDialog(null, "El resultado es " + resultadoResta);
                                     break;
                                 case 3:
                                       JOptionPane.showMessageDialog(null, "El resultado es " + multiplicar());
                                     break;
                                 case 4: division();
                                      JOptionPane.showMessageDialog(null, "El resultado es " + resultadoDivision + " y el resto es de " + resultadoResto);
                                     break;
                                 default: 
                                     JOptionPane.showMessageDialog(null,"No has elegido una opcion valida");
                                     break;

                             }
                    } 
                }
                while(accion <=4 || accion >=6);
            }
            
            catch(Exception e )
            {
                System.out.println("No has elegido una opcion valida" + e.getMessage());
            }
      
       
        
    }
        public static int suma()
        {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));

               resultadoSuma= n1 + n2;
               return resultadoSuma;


        }
        public static int resta()
        {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));

               resultadoResta= n1 - n2;
               return resultadoResta;


        }
        
        public static String multiplicar()
        {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("¿Qué numero quieres multiplicar?"));
            
            for (int i = 0; i<=10; i++)
            {
                resultadoMultiplicar +=   i + " * " + n1 + "=" + i*n1 + "\n";
            }
               
           
            return resultadoMultiplicar;
        }
        
             /*resultadoMultiplicar = System.out.println("12 * " + i + " = " + 12*i);*/
        
        
        public static int division()
        {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));

               resultadoDivision= n1/n2;
               resultadoResto = n1%n2;
               return resultadoResta + resultadoResto;


        }
    
}
