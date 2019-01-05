
package MisClases;

import java.util.ArrayList;


public class Directivos extends Empleados{
    
    private String categoria;

    private ArrayList<Empleados> subordinados = new ArrayList();
    
    
    public Directivos() {
    }

    public Directivos(String categoria) {
        this.categoria = categoria;
    }

    public Directivos(String categoria, ArrayList<Empleados> subordinados) {
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    public Directivos(String categoria, ArrayList<Empleados> subordinados, Double sueldo_bruto) {
        super(sueldo_bruto);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    public Directivos(String categoria, ArrayList<Empleados> subordinados, Double sueldo_bruto, String nombre, int edad) {
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }
    

    public Directivos(String categoria, Double sueldo_bruto) {
        super(sueldo_bruto);
        this.categoria = categoria;
    }

    public Directivos(String categoria, Double sueldo_bruto, String nombre, int edad) {
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void mostrar(){
    
    }
}
