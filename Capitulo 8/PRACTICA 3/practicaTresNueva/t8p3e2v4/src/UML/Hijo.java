
package UML;

import java.time.LocalDate;

public class Hijo {
    private String nombre;
    private LocalDate fecha;
      
    public Hijo(String nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
