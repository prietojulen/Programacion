package cap3_repasofinal05;


import javax.swing.JOptionPane;

public class Cap3_RepasoFinal05 {

    public static int heridos;
    public static int muertos;
    public static int n1;
    public static int n2;
    public static int n3;
    public static int numR1;
    public static int numR2;
    public static int numR3;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
            do
            {
            //generamos un numero aletorio entre 100 y 999
            double NRandom = Math.floor(Math.random()*(999-100+1)+100);
            //imprimimos el numero para ver cual es y poder acabar el juego
            System.out.println(NRandom);
            
            //pasamos a string el numero para quedarnos con las centenas, decenas y unidades
            String NumeroRandom = Double.toString(NRandom); 
            
            
            //guardamos las centenas, decenas y unidades en variables distintas
            //para ello pasamos de char a int
            numR1 = Character.getNumericValue(NumeroRandom.charAt(0));
            numR2 = Character.getNumericValue(NumeroRandom.charAt(1));
            numR3 = Character.getNumericValue(NumeroRandom.charAt(2));
            }
            while(numR1 != numR2 && numR1 != numR3 && numR2 != numR3);
            //comprobacion de que el numero junto y separado es el mismo
            //JOptionPane.showMessageDialog(null, NumeroRandom + "||" + numR1 + "-" + numR2 + "-" + numR3 );
            
            
            //cremos las centenas, decenas y unidades del jugador
            String numeroEntrada;
            int nEntrada = 0;
            n1 = 0;
            n2 = 0;
            n3 = 0;
 
            boolean comprobacion = false;

                do
                {
                    try
                    {
                        numeroEntrada = JOptionPane.showInputDialog("Introduce tu numero");
                        nEntrada = Integer.parseInt(numeroEntrada);

                        n1 = Character.getNumericValue(numeroEntrada.charAt(0));
                        n2 = Character.getNumericValue(numeroEntrada.charAt(1));
                        n3 = Character.getNumericValue(numeroEntrada.charAt(2));
                        System.out.print(n1+ " "+ n2+ " " + n3);
                        comprobacion = true;
                        tratarNumero();
                        
                        JOptionPane.showMessageDialog(null,"- Muertos " + muertos + " - Heridos " + heridos);
                        
                        
                    }
                    catch(Exception e)
                    {
                         System.out.println("No has introducido un dato valido" + e.getMessage());
                         comprobacion = false;
                    }
                }
                while(comprobacion = false || nEntrada < 100 || nEntrada > 999);
    }
    
    public static void tratarNumero()
    {
        if(n1 == numR1 && n2 == numR2 && n3 == numR3)
        {
            muertos = 3;
            
        }
        else{
         if(n1 == numR1)
         {
             muertos++;
         }
         else
        {
             if(n1 == numR2)
             {
                 heridos++;
             }
             else
             {
                 if(n1 == numR3)
                 {
                     heridos++;
                 }
                 else
                 {
                     if(n2 == numR1)
                     {
                         heridos++;
                     }
                     else
                     {
                        if(n2 == numR2)
                        {
                            muertos++;
                        }
                        else
                        {
                            if(n2 == numR3)
                            {
                                heridos++;
                            }
                            else
                            {
                                if(n3 == numR1)
                                {
                                    heridos++;
                                }
                                else
                                {
                                    if(n3 == numR2)
                                    {
                                        heridos++;
                                    }
                                    else
                                    {
                                        if(n3 == numR3)
                                        {
                                            muertos++;
                                        }
                                        }
                                    }
                                }
                            }
                        }
                        }
                     }
                 }
        
        }
        }
        
         
        
    }
    

