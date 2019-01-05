
package MisClases;


public class Personas {
    
    
    private String nombre;
    private String dNacimiento;
    private String mNacimineto;
    private String aNacimiento;
    private String direccion;
    private String cp;
    private String ciudad;

    public Personas() {
    }

    public Personas(String nombre, String dNacimiento, String mNacimineto, String aNacimiento, String direccion, String cp, String ciudad) {
        this.nombre = nombre;
        this.dNacimiento = dNacimiento;
        this.mNacimineto = mNacimineto;
        this.aNacimiento = aNacimiento;
        this.direccion = direccion;
        this.cp = cp;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(String dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public String getmNacimineto() {
        return mNacimineto;
    }

    public void setmNacimineto(String mNacimineto) {
        this.mNacimineto = mNacimineto;
    }

    public String getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(String aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
