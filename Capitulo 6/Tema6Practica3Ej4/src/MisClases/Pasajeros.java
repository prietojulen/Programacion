
package MisClases;

public class Pasajeros {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private String sexo;
    private String edad;

    public Pasajeros() {
    }

    public Pasajeros(String cedula, String nombre, String apellido, String sexo, String edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public void agregar_nuevo(){
    }
    public void modificar(){
    }
    
    public void buscar(){
    }
}
