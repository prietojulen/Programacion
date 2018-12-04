
package tema6ej2;

import MisCalses.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Tema6Ej2 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList  <Alumno> agenda = new  ArrayList();
        
        meterAlumnos(agenda);
        buscarAlumnos(agenda);
        
    }
    
    public static void meterAlumnos(ArrayList<Alumno> agenda){
    
        for(int x=0; x <2 ; x++)
        {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
            String nombre = JOptionPane.showInputDialog("Nombre");
            String direccion = JOptionPane.showInputDialog("Dirección");
            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Telefono"));
        
            Alumno a = new Alumno(codigo,nombre,direccion,telefono);
            
            agenda.add(a);
        }

    
    }
    
    public static void buscarAlumnos(ArrayList<Alumno> agenda){
    
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("¿Que alumno buscas?"));
        
        for(int x=0; x < agenda.size(); x++)
        {
                if(agenda.get(x).getCodigo() == codigo)
                {
                    JOptionPane.showMessageDialog(null, agenda.get(x).getCodigo()+ " " + agenda.get(x).getNombre());
                }
        }
       
    }
    
    
    
}
