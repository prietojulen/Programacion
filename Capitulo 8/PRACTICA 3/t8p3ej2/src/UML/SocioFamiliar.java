
package UML;

import java.util.ArrayList;


public class SocioFamiliar extends Persona {
    
    public ArrayList<Hijo> ArrayList;

    public SocioFamiliar() {
    }

    public SocioFamiliar(ArrayList<Hijo> ArrayList) {
        this.ArrayList = ArrayList;
    }

    public SocioFamiliar(ArrayList<Hijo> ArrayList, String nombre, String apellidos, String telefono, String email) {
        super(nombre, apellidos, telefono, email);
        this.ArrayList = ArrayList;
    }

    public ArrayList<Hijo> getArrayList() {
        return ArrayList;
    }

    public void setArrayList(ArrayList<Hijo> ArrayList) {
        this.ArrayList = ArrayList;
    }
    
    
    
}
