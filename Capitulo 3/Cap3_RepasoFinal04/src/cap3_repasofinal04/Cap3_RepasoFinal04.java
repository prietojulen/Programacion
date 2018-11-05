package cap3_repasofinal04;

import javax.swing.JOptionPane;
/*import Exception;*/



public class Cap3_RepasoFinal04 {

        public static String nombre;
        public static String cadena = "";
        public static int notaMedia;
        public static int n1;
        public static int n2;
        public static int n3;
        public static int n4;
        public static int n5;
        public static int n6;
    
    public static void main(String[] args) {
        // ejrecicio 4
        
        do
        {
            nombre = JOptionPane.showInputDialog("Introduce nombre de alumno" + "\n" + "escribe FIN para terminar");
            
            nombre = nombre.toUpperCase();
            
            if(!nombre.equals("FIN"))
            {
            
                    try
                    {
                        do
                        {
                            n1 = Integer.parseInt(JOptionPane.showInputDialog("Nota 1"));
                        }
                        while(n1 < 0 || n1 > 10);

                        do
                        {
                            n2 = Integer.parseInt(JOptionPane.showInputDialog("Nota 2"));
                        }
                        while(n2 < 0 || n2 > 10);

                        do
                        {
                            n3 = Integer.parseInt(JOptionPane.showInputDialog("Nota 3"));
                        }
                        while(n3 < 0 || n3 > 10);

                        do
                        {
                            n4 = Integer.parseInt(JOptionPane.showInputDialog("Nota 4"));
                        }
                        while(n4 < 0 || n4 > 10);

                        do
                        {
                            n5 = Integer.parseInt(JOptionPane.showInputDialog("Nota 5"));
                        }
                        while(n5 < 0 || n5 > 10);

                        do
                        {
                            n6 = Integer.parseInt(JOptionPane.showInputDialog("Nota 6"));
                        }
                        while(n6 < 0 || n6 > 10);
                    }
                    
                    /*catch(NotaNoNumericaException e)
                    {
                        JOptionPane.showMessageDialog(null,"La nota debe ser numérica");
                    }*/
                    
                    catch(Exception e )
                    {
                        System.out.println("No has elegido una opcion valida" + e.getMessage());
                    }
            
                    notaMedia = (n1+n2+n3+n4+n5+n6)/6;

                    cadena = cadena + "La nota media de " + nombre + " es " + notaMedia + "\n";
            
            }
            else
            {
                JOptionPane.showMessageDialog(null," " + cadena);
            }
        
        }
        while(!nombre.equals("FIN"));
        
        
        
    }
    
}
