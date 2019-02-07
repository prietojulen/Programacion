
package UML;

public class Empleados {
    
    private String nombreApellido;
    private String dni;
    
    private Usuario u;

    public Empleados() {
    }

    public Empleados(String nombreApellido, String dni) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
    }

    public Empleados(String nombreApellido, String dni, Usuario u) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.u = u;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
    
    
}
