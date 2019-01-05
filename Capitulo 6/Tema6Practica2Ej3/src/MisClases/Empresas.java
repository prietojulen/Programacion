
package MisClases;

import java.util.ArrayList;


public class Empresas {
    
    private String nombre;
    private ArrayList<Empleados> emp = new ArrayList();
    private ArrayList<Clientes> cli = new ArrayList();
    
    public Empresas() {
    }

    public Empresas(String nombre, ArrayList<Empleados> emp, ArrayList<Clientes> cli) {
        this.nombre = nombre;
        this.emp = emp;
        this.cli = cli;
    }

    public Empresas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
