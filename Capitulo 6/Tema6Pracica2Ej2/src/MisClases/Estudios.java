
package MisClases;

import java.util.ArrayList;
import java.util.Date;

public class Estudios {
    
    private String nombre;
    private String ciudad;
    private String direccion;
    private String dirweb;
    private Date fecha_fundacion;
    private String pais;
    private String telefono;
    
    private ArrayList<Peliculas> pelicula;

    public Estudios() {
    }

    public Estudios(String nombre, String ciudad, String direccion, String dirweb, Date fecha_fundacion, String pais, String telefono, ArrayList<Peliculas> pelicula) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dirweb = dirweb;
        this.fecha_fundacion = fecha_fundacion;
        this.pais = pais;
        this.telefono = telefono;
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirweb() {
        return dirweb;
    }

    public void setDirweb(String dirweb) {
        this.dirweb = dirweb;
    }

    public Date getFecha_fundacion() {
        return fecha_fundacion;
    }

    public void setFecha_fundacion(Date fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Peliculas> getPelicula() {
        return pelicula;
    }

    public void setPelicula(ArrayList<Peliculas> pelicula) {
        this.pelicula = pelicula;
    }
    
    public void nuevoEstudio(){
    }
    public void modificarEstudio(){
    }
    public void cierraEstudio(){
    }
    public void despliegueEstudio(){
    }
    
    
}
