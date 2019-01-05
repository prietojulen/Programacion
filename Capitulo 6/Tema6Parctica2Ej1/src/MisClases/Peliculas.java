
package MisClases;

import java.util.ArrayList;

public class Peliculas {
    
    private String titulo;
    private String año;
    private float duracion;
    private String tipo;
    
    private ArrayList<Estudios> arryEstudios; 

    public Peliculas() {
        this.arryEstudios = new ArrayList();
    }

    public Peliculas(String titulo, String año, float duracion, String tipo) {
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
        
        this.arryEstudios = new ArrayList();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Estudios> getEstudios() {
        return arryEstudios;
    }

    public void setEstudios(ArrayList<Estudios> estudios) {
        this.arryEstudios = estudios;
    }
    
    //Añade un objeto Estudio al array que contiene todos los Estudios de la correspondiente película.
    public void addEstudio(Estudios estudio){
        this.arryEstudios.add(estudio);
    }
        
    public void modificarPelicula(){
    }
    public void desplieguePelicula(){
    }
    public void eliminarPelicula(){
    }
    
    
}
