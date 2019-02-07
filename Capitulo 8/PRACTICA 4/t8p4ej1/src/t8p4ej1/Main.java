package t8p4ej1;

import GUI.*;
import UML.*;
import Excepciones.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
public class Main {

    static LogIn Li;
    static VentanaPrincipal Vp;
    static Formulario Fo;
    static FormularioUsuarios Fu;
    
    private static ArrayList<Persona> listaPersona = new ArrayList<Persona>();
    private static Persona p;
    
    private static Contrato[] aContrato;
    private static Departamento[] aDepartamento;
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        rellenarDatos();
        addPrimerUsuario();
        
        
        Li = new LogIn();
        Li.setVisible(true);
    }
    
    public static void addPrimerUsuario(){
    
        
        Persona p1 = new Persona();
        p1 = new Persona ("11111111a","11111111111","administrador adminnistrador","aaaaaa","111111111","Hombre","Soltero",aContrato[0],aDepartamento[0],new Date(),1);
        Usuario u = new Usuario("admin","admin"); 
        // Unimos a la persona con su "usuario" informatico
        p1.setU(u);
        listaPersona.add(p1);
    }
    
    public static boolean comprobarLogin(String nombre, String contraseña){
        int x;        
        for(x=0; x < listaPersona.size() && p == null; x++){
            
            String nombre_p = listaPersona.get(x).getU().getNombre();
            String pwd = listaPersona.get(x).getU().getContraseña();
                     
            if(nombre_p.equals(nombre) && pwd.equals(contraseña)){
                p = listaPersona.get(x);
            }
        }
        
        System.out.println(x < listaPersona.size());
        
        if(p == null){
            return false;
        }else{
            return true;
        }
    }
       
    
    
    
    public static void finalizarLogin(){
    
       Li.dispose();
       
       Vp = new VentanaPrincipal();
       Vp.setVisible(true);
    }
    
    public static void clickAlta(){
        Vp.dispose();
        
        Fo = new Formulario();
        Fo.setVisible(true);
    }
    
    public static void cancelarFormulario(){
        Fo.dispose();
        Vp.setVisible(true);
       
    }
    public static void crearUsuarioNuevoVentana(){
        
        Li.dispose();
        Fu = new FormularioUsuarios();
        Fu.setVisible(true);
        
    }
    public static void crearNuevoUsuario(){
       
    
    
    }
    public static void cancelarFormularioUsuarios(){
        Fu.dispose();
        Li.setVisible(true);
    }
    
    public static void rellenarDatos(){
        //Rellenamos el Array de contratos con todos los tipos de contrato que existen. 
        
        aContrato = new Contrato[8];
        aContrato[0] = new Contrato();
        aContrato[0].setIdContrato(1);
        aContrato[0].setTipoContrato("Indefinido");
        
        aContrato[1] = new Contrato();
        aContrato[1].setIdContrato(2);
        aContrato[1].setTipoContrato("Temporal");
        
        aContrato[2] = new Contrato();
        aContrato[2].setIdContrato(3);
        aContrato[2].setTipoContrato("Por obra o servicio");
        
        aContrato[3] = new Contrato();
        aContrato[3].setIdContrato(4);
        aContrato[3].setTipoContrato("Eventual");
        
        aContrato[4] = new Contrato();
        aContrato[4].setIdContrato(5);
        aContrato[4].setTipoContrato("Interinidad");
        
        aContrato[5] = new Contrato();
        aContrato[5].setIdContrato(6);
        aContrato[5].setTipoContrato("Relevo");
        
        aContrato[6] = new Contrato();
        aContrato[6].setIdContrato(7);
        aContrato[6].setTipoContrato("Formación y aprendizaje");
        
        aContrato[7] = new Contrato();
        aContrato[7].setIdContrato(8);
        aContrato[7].setTipoContrato("Prácticas");
    
        //Rellenamos el Array con los departamentos
        
        aDepartamento = new Departamento[9];
        
        aDepartamento[0] = new Departamento(1, "Recursos Humanos");
        aDepartamento[1] = new Departamento(2, "Compras");
        aDepartamento[2] = new Departamento(3, "Producción");
        aDepartamento[3] = new Departamento(4, "Control de gestión");
        aDepartamento[4] = new Departamento(5, "Marketing");
        aDepartamento[5] = new Departamento(6, "Ventas");
        aDepartamento[6] = new Departamento(7, "Administración");
        aDepartamento[7] = new Departamento(8, "Finanzas");
        aDepartamento[8] = new Departamento(9, "Dirección");

    }
    
   /* public static boolean altaPersona(String dni, String nss, String nombreApellido, String direccion, String telefono, String sexo, String estadoCivil, String contrato, String departamento, Date fechaAlta, int numeroEmpleado){
        try{
            listaPersona.add(new Persona(dni, nss, nombreApellido, direccion, telefono, sexo, estadoCivil, contrato, departamento, fechaAlta, 0));
            return true;
            
        }
        catch(Exception e){
            return false;
        }
    }
    */
    /*
    public static String generarListado(){
        String datos="";
        for(int x = 0; x < listaPersona.size(); x++)
        {
            datos += listaPersona.get(x).getDni()+ "  \n" + listaPersona.get(x).getNss()+ "  \n" + listaPersona.get(x).getNombreApellido()
                    + "  \n" + listaPersona.get(x).getDireccion()+ "  \n" + listaPersona.get(x).getTelefono()
                    + "  \n" + listaPersona.get(x).getSexo()+ "  \n" + listaPersona.get(x).getEstadoCivil()
                    + "  \n" + listaPersona.get(x).getContrato()+ "  \n" + listaPersona.get(x).getDepartamento()
                    + "  \n" + listaPersona.get(x).getFechaAlta()+ "  \n" + listaPersona.get(x).getNumeroEmpleado();
        
            JOptionPane.showMessageDialog(null, datos);
        }
        if (datos.compareTo("")== 0)
            datos = "No hay datos que mostrar";
        return datos;
    }    
    */
    
    
    
    
    public static String sysdate(){
    
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Calendar cal = Calendar.getInstance();
    System.out.println(dateFormat.format(cal.getTime()));
    
    String fecha = dateFormat.format(cal.getTime());
    
    return fecha;
    }
}
