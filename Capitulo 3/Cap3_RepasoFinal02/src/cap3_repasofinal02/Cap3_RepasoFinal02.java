package cap3_repasofinal02;

import javax.swing.JOptionPane;


public class Cap3_RepasoFinal02 {

    public static char visual;
    public static char cobol;
    public static char java;
    public static char sql;;
    public static String nota = "";

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        

        int visualNota = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog (null, "¿Es el alumno apto en Visual.net?");
            if(visualNota == JOptionPane.YES_OPTION)
            {
                
                if(visualNota==0)
                {
                visual = 'V';
                nota = visual + "";
                }
                else
                {
                nota = nota + "";
                }
            }

            JOptionPane.showMessageDialog(null,nota);
            
        int cobolNota = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog (null, "¿Es el alumno apto en cobol?");
            if(cobolNota == JOptionPane.YES_OPTION)
            {
                
                if(cobolNota==0)
                {
                 cobol = 'C';   
                 nota = nota + "" + cobol;
                }
                else
                {
                nota = nota + "";
                }
                
            }
            JOptionPane.showMessageDialog(null,nota);

            
            int javaNota = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog (null, "¿Es el alumno apto en java?");
            if(javaNota == JOptionPane.YES_OPTION)
            {
                
                if(javaNota==0)
                {
                    java = 'J';
                    nota = nota + "" + java;
                }
                else
                {
                nota = nota + "";
                }
            }
            JOptionPane.showMessageDialog(null,nota);

            
            int sqlNota = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog (null, "¿Es el alumno apto en SQL?");
            if(sqlNota == JOptionPane.YES_OPTION)
            {
                
                if(sqlNota==0)
                {
                    sql = 'S';
                    nota = nota + "" + sql;
                }
                else
                {
                    nota = nota + "";
                }
            }
            JOptionPane.showMessageDialog(null,nota);

            switch(nota)
            {
                case "VCJS" :
                    JOptionPane.showMessageDialog(null, "Sobresaliente!");
                    break;
                    
                case "VCS" :
                case "CJS" :
                    JOptionPane.showMessageDialog(null, "Notable!");
                    break;
                   
                case "CS" :
                    JOptionPane.showMessageDialog(null, "Bien!");
                    break;
                    
                case "VS" :
                case "VJ" :
                case "CJ" :
                case "VC" :
                     JOptionPane.showMessageDialog(null, "Suficiente");
                     break;
                default :
                     JOptionPane.showMessageDialog(null, "SUSPENSO!");
                     break;
                    
            
            }


    }
    
}
