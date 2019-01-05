
package MisClases;


public class Aviones {
    
    private String aerolinea;
    private int codigo_avion;
    private int n_asientos;
    private String compartimentos;

    public Aviones() {
    }

    public Aviones(String aerolinea, int codigo_avion, int n_asientos, String compartimentos) {
        this.aerolinea = aerolinea;
        this.codigo_avion = codigo_avion;
        this.n_asientos = n_asientos;
        this.compartimentos = compartimentos;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getCodigo_avion() {
        return codigo_avion;
    }

    public void setCodigo_avion(int codigo_avion) {
        this.codigo_avion = codigo_avion;
    }

    public int getN_asientos() {
        return n_asientos;
    }

    public void setN_asientos(int n_asientos) {
        this.n_asientos = n_asientos;
    }

    public String getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(String compartimentos) {
        this.compartimentos = compartimentos;
    }
    
    public void asignar_vuelo(){
    }
    
    public void obtener(){
    }
    public void cancelar_vuelo(){
    }
    
}
