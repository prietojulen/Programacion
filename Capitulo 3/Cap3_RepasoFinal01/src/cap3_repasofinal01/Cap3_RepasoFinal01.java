package cap3_repasofinal01;

import javax.swing.JOptionPane;


public class Cap3_RepasoFinal01 {
    
    public static int horas;
    public static char estadoF;
    public static char estudiosF;
    public static String plus;
    public static int sueldo;
    
    public static void main(String[] args) {
        // TODO code application logic here

        
        do
        {
            horas = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de horas trabajadas"));

            String estado = new String (JOptionPane.showInputDialog("Introduce tu estado civil, (Soltero,Casado, Viudo o Divorciado)"));
            estadoF = estado.charAt(0);

            String estudios = new String (JOptionPane.showInputDialog("Nivel de estudios (Primarios, Medio, Superior)"));
            estudiosF = estudios.charAt(0);
            
            plus = estadoF + "" +estudiosF;

        }
        while(horas < 40);
        
        if(horas > 40)
        {
        
            int extra = horas - 40;
            sueldo = (40*10) + (extra*15);
            
        
        }
        else
        {
            sueldo = horas*10; 
        }
        
        if(plus.contentEquals("SP") || plus.contentEquals("VS") || plus.contentEquals("SM") || plus.contentEquals("CS") || plus.contentEquals("VP") || plus.contentEquals("SS") || plus.contentEquals("DS"))
        {
           sueldo = sueldo + 100;
           JOptionPane.showMessageDialog(null, "Tu sueldo es de "+ sueldo + "€"  );
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Tu sueldo es de "+ sueldo + "€");
        }        
        
        
    }
    
}
