
package MisClases;


public class Clientes extends Personas{
 
    private String telefono_de_contacto;

    public Clientes() {
    }

    public Clientes(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public Clientes(String telefono_de_contacto, String nombre, int edad) {
        super(nombre, edad);
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }
    
    public void mostrar(){}
    
}
