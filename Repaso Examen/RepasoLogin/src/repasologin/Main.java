
package repasologin;

import GUI.VentanaLogIn;
import UML.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Main {

    private static VentanaLogIn Li;
    
    private static ArrayList<Empleados> listaEmpleados = new ArrayList<Empleados>();
    private static Empleados E;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Li = new VentanaLogIn();
        Li.setVisible(true);

        addUser();
        
        System.out.println(listaEmpleados.get(0));
        
    }
    
    public static void addUser(){
    
    Empleados e1 = new Empleados();
    e1 = new Empleados("admin","1111a");
    
    Usuario u1 = new Usuario();
    u1 = new Usuario("admin","admin");
    
    e1.setU(u1);
    listaEmpleados.add(e1);
        
    }
    
    public static boolean comprobarLogin(String nickname,String pwd){
    int x;
    
        for(x =0;x < listaEmpleados.size() && E == null; x++){

            String nickname_p = listaEmpleados.get(x).getU().getNickname();
            String pwd_p = listaEmpleados.get(x).getU().getPwd();

            if(nickname_p.equals(nickname) && pwd_p.equals(pwd)){
                E = listaEmpleados.get(x);
            }
            }
            if(E == null){
                return false;
            }else{
                return true;
        }  
    
    }
    
    public static void finalizarLogIn(){
        Li.dispose();
        
        JOptionPane.showMessageDialog(null, "LogIn correcto");

    
    }
    
}
