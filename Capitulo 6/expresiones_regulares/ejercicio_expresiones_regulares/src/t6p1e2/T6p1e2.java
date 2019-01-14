
package t6p1e2;

import Excepciones.*;
import Modelo.Alumno;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p1e2 {

    public static void main(String[] args) {
        try
        {
            ArrayList<Alumno> listaClase;
            listaClase = obtenerDatosAlumnos();
            buscarPorCodigo(listaClase);
        }
        catch(Exception e)
        {
            System.out.println("Problemas");
        }
    }
    
    
    public static void buscarPorCodigo(ArrayList<Alumno> lista) throws Exception{
        String codigo = JOptionPane.showInputDialog("Teclea el código del alumno");
        // Validar
        validarCodigo(codigo);
        // Buscar por código
        int x;
        for(x = 0; x < lista.size() && lista.get(x).getCodigo().equals(codigo)== false; x++){}
        if( x == lista.size())
            JOptionPane.showMessageDialog(null,"Alumno no encontrado");
        else
            JOptionPane.showMessageDialog(null,"Objeto alumno: " + lista.get(x) + "\n" + lista.get(x).toString());
            
    }
    
    public static ArrayList<Alumno> obtenerDatosAlumnos(){
        ArrayList<Alumno> lista = new ArrayList();
        do
        {
            try
            {
                String codigo = JOptionPane.showInputDialog("Teclea el código del alumno");
                validarCodigo(codigo);
                String nombre = JOptionPane.showInputDialog("Teclea el nombre del alumno");
                validarNombre(nombre);
                String domicilio = JOptionPane.showInputDialog("Teclea el domicilio del alumno");
                validarDomicilio(domicilio);
                String telefono = JOptionPane.showInputDialog("Teclea el teléfono del alumno");
                validarTelefono(telefono);
                int edad =  Integer.parseInt(JOptionPane.showInputDialog("Teclea el teléfono del alumno"));
                validarEdad(edad);
                //Date Fecha = 
                //validarFecha();
                String email = JOptionPane.showInputDialog("Teclea Email");
                validarEmail(email);
                String EstadoCivil = JOptionPane.showInputDialog("Soltero o casado?");
                validarEstadoCivil(EstadoCivil);
                
                
                Alumno a = new Alumno(codigo,nombre,domicilio,telefono);
                
                lista.add(a);
            }
            catch(DatoNoValido e){
              JOptionPane.showMessageDialog(null,"El dato introducido no es correcto");
            }
            catch(Exception e)
            {
                System.out.println("Problemas");
            }
        }
        while(JOptionPane.showConfirmDialog(null,"¿ Quieres continuar?")==0);
        return lista;
    }
    
    public static void validarCodigo(String codigo)throws Exception{
        // Cinco dígitos numéricos
        boolean error=false;
//        if (codigo.length()!= 5)
//            error = true;
//        else
//            for (int x = 0; x < codigo.length() && error == false;x++)
//                if (Character.isAlphabetic(codigo.charAt(x)))
//                    error = true;
//        if (error)
//            throw new DatoNoValido();
        
        
        Pattern pat_codigo = Pattern.compile("^[0-9]{5}$");
        Matcher mat_patron = pat_codigo.matcher(codigo);
        
        if (mat_patron.matches()){
            JOptionPane.showInputDialog("¡Codigo correcto!");
            error = true;
        }else{
            JOptionPane.showInputDialog("¡CODIGO ERRONEO! \n El codigo tiene que estar compuesto por 5 dígitos numéricos");
            throw new DatoNoValido();
        }
                    
    }
    
    public static void validarNombre(String nombre)throws Exception{
        
        boolean error=false;
        /*if (nombre.length()<= 2)
            error = true;
        else
            // Todo letras
            for (int x = 0; x < nombre.length() && error == false;x++)
                if (Character.isDigit(nombre.charAt(x)))
                    error = true;
        if (error)
            throw new DatoNoValido();
        */
        
        Pattern pat_nombre = Pattern.compile("^[A-Z]{3,}$");
        Matcher mat_patron = pat_nombre.matcher(nombre);
        
        if (mat_patron.matches()){
            JOptionPane.showInputDialog("¡Nombre correcto!");
            error = true;
        }else{
            JOptionPane.showInputDialog("¡NOMBRE INCORRECTO! \n El nombre tiene que estar por mínimo 3 letras MAYUSCULAS");
            throw new DatoNoValido();
        } 
           
    }
    
    public static void validarDomicilio(String domicilio)throws Exception{
        //if (domicilio.length()<= 10)
        //    throw new DatoNoValido();
        boolean error = false;
        
        Pattern pat_domicilio = Pattern.compile("^[A-Z],[a-zA-Z]{9,}$");
        Matcher mat_patron = pat_domicilio.matcher(domicilio);
        
        if (mat_patron.matches()){
            JOptionPane.showInputDialog("¡Dirección correcta!");
            error = true;
        }else{
            JOptionPane.showInputDialog("¡DIRECCIÓN ERRONEOA! \n La dirección está compuesta por 10 letras");
            throw new DatoNoValido();
        }
                    
    }
    
    public static void validarTelefono(String telefono) throws Exception{
        // 9 digitos numéricos empezando por 6, 7 , 8 o 9
        boolean error=false;
        /*if (telefono.length()!= 9)
            error = true;
        else
            if (telefono.charAt(0)!= '6' && telefono.charAt(0)!= '7' && telefono.charAt(0)!= '8' && telefono.charAt(0)!= '9' )
                error = true;
            else
                for (int x = 0; x < telefono.length() && error == false;x++)
                    if (Character.isAlphabetic(telefono.charAt(x)))
                        error = true;
        if (error)
            throw new DatoNoValido();*/
        Pattern pat_nombre = Pattern.compile("^[6789]+[0-9]{8}$");
        Matcher mat_patron = pat_nombre.matcher(telefono);
        
        if (mat_patron.matches()){
            JOptionPane.showInputDialog("¡Telefono correcto!");
            error = true;
        }else{
            JOptionPane.showInputDialog("¡TELEFONO INCORRECTO! \n "
                    + "El télefono tiene que empezar por 6 - 7 - 8 - 9 y tiene que tener 9 carácteres de longitud");
            throw new DatoNoValido();
        } 
    }
    public static void validarEdad(int edad) throws Exception{
        // edad ded 0 a 120
        boolean error=false;
        /*
        Pattern pat_edad = Pattern.compile("^[0-9]{1,2}$");
        Matcher mat_patron = pat_edad.matcher(edad);
        
        if (mat_patron.matches()){
            JOptionPane.showInputDialog("¡Telefono correcto!");
            error = true;
        }else{
            JOptionPane.showInputDialog("¡TELEFONO INCORRECTO! \n "
                    + "El télefono tiene que empezar por 6 - 7 - 8 - 9 y tiene que tener 9 carácteres de longitud");
            throw new DatoNoValido();
        } */
    }
    public static void validarFecha(Date fecha) throws Exception{
        // validar dia/mes/año
        boolean error=false;
        Pattern pat_email = Pattern.compile("ˆ\\\\d{1,2}/\\\\d{1,2}/\\\\d{4}$");
        Matcher mat_patron = pat_email.matcher((CharSequence) fecha);
        
        if (mat_patron.matches()){
            JOptionPane.showInputDialog("¡Fecha correcto!");
            error = true;
        }else{
            JOptionPane.showInputDialog("¡FECHA INCORRECTA! \n "
                    + "dd/MM/yyyy");
            throw new DatoNoValido();
        } 

    }
    public static void validarEmail(String email) throws Exception{
        // 
        boolean error=false;
        Pattern pat_email = Pattern.compile("ˆ[_a-z0-9-]+(\\\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\\\.[a-z0-9-]+)*(\\\\.[a-z]{2,4})$");
        Matcher mat_patron = pat_email.matcher(email);
        
        if (mat_patron.matches()){
            JOptionPane.showInputDialog("¡Mail correcto!");
            error = true;
        }else{
            JOptionPane.showInputDialog("¡Mail INCORRECTO! \n "
                    + "No contiene carácteres alfanumericos + @ + alfanumeriocs + . letras(min 2 max 4)");
            throw new DatoNoValido();
        } 

    }
    public static void validarEstadoCivil(String EstadoCivil) throws Exception{
        // 
        boolean error=false;
        Pattern pat_mail = Pattern.compile("^casado$ || ^solero$");
        Matcher mat_patron = pat_mail.matcher(EstadoCivil);
        
        if (mat_patron.matches()){
            JOptionPane.showInputDialog("¡Estado correcto!");
            error = true;
        }else{
            JOptionPane.showInputDialog("¡Estado INCORRECTO! \n "
                    + "soltero o casado)");
            throw new DatoNoValido();
        } 

    }
}
