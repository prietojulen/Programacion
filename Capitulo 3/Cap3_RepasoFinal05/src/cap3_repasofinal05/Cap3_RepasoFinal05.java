package cap3_repasofinal05;


import javax.swing.JOptionPane;

public class Cap3_RepasoFinal05 {

    public static int heridos;
    public static int muertos;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
            //generamos un numero aletorio entre 100 y 999
            double NRandom = Math.floor(Math.random()*(999-100+1)+100);
            //imprimimos el numero para ver cual es y poder acabar el juego
            System.out.println(NRandom);
            
            //pasamos a string el numero para quedarnos con las centenas, decenas y unidades
            String NumeroRandom = Double.toString(NRandom); 
            
            
            //guardamos las centenas, decenas y unidades en variables distintas
            //para ello pasamos de char a int
            int numR1 = Character.getNumericValue(NumeroRandom.charAt(0));
            int numR2 = Character.getNumericValue(NumeroRandom.charAt(1));
            int numR3 = Character.getNumericValue(NumeroRandom.charAt(2));
            
            //comprobacion de que el numero junto y separado es el mismo
            //JOptionPane.showMessageDialog(null, NumeroRandom + "||" + numR1 + "-" + numR2 + "-" + numR3 );
            
            
            //cremos las centenas, decenas y unidades del jugador
            String numeroEntrada;
            int nEntrada = 0;
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
 
            boolean comprobacion = false;

            try
            {
                do
                {
                    
                    numeroEntrada = JOptionPane.showInputDialog("Introduce tu numero");
                    nEntrada = Integer.parseInt(numeroEntrada);
                    
                    n1 = Character.getNumericValue(numeroEntrada.charAt(0));
                    n2 = Character.getNumericValue(numeroEntrada.charAt(1));
                    n3 = Character.getNumericValue(numeroEntrada.charAt(2));
                    System.out.print(n1+ " "+ n2+" " + n3);
                    comprobacion = true;

                }
                while(comprobacion = false && nEntrada < 100 || nEntrada > 999);
            }                  
            catch(Exception e)
            {
                System.out.println("No has introducido un dato valido" + e.getMessage());
            }
            
        
    }
    
}
