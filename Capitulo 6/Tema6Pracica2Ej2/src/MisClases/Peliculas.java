
package MisClases;

import java.util.ArrayList;

public class Peliculas {
    
    private String titulo;
    private String año;
    private float duracion;
    private String tipo;
   
    private ArrayList<Estudios> estudio;

    public Peliculas() {
    }

    public Peliculas(String titulo, String año, float duracion, String tipo, ArrayList<Estudios> estudio) {
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
        this.estudio = estudio;
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

    public ArrayList<Estudios> getEstudio() {
        return estudio;
    }

    public void setEstudio(ArrayList<Estudios> estudio) {
        this.estudio = estudio;
    }
    
    public void nuevaPelicula(){
    }
    public void modificarPelicula(){
    }
    public void despliegaPelicula(){
    }
    public void eliminarPelicula(){
    }
    
}
