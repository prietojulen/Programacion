
package UML;

import java.util.ArrayList;


public class Departamento {
    
    private int idDepartamento;
    private String nombre;

    //bidirecional Persona
    private ArrayList<Persona> listaPersonas;
    
    public Departamento() {
    }

    public Departamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public Departamento(int idDepartamento, String nombre) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
