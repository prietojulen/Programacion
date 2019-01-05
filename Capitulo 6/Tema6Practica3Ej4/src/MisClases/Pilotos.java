
package MisClases;

public class Pilotos {
    
    private int codigo_piloto;
    private String nombre;
    private String apellido;
    private int n_licencia;

    public Pilotos() {
    }

    public Pilotos(int codigo_piloto, String nombre, String apellido, int n_licencia) {
        this.codigo_piloto = codigo_piloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.n_licencia = n_licencia;
    }

    public int getCodigo_piloto() {
        return codigo_piloto;
    }

    public void setCodigo_piloto(int codigo_piloto) {
        this.codigo_piloto = codigo_piloto;
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

    public int getN_licencia() {
        return n_licencia;
    }

    public void setN_licencia(int n_licencia) {
        this.n_licencia = n_licencia;
    }
    
    public void agregar_nuevo(){
    }
    public void asignar_vuelo(){
    }
    public void cancelar_vuelo(){
    }
    public void modificar(){
    }
    public void buscar(){
    }
    
}
