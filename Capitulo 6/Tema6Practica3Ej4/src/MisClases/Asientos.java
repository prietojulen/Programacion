
package MisClases;


public class Asientos {
    
    private int numero_asiento;
    private String estado;
    private String compartimento;

    public Asientos() {
    }

    public Asientos(int numero_asiento, String estado, String compartimento) {
        this.numero_asiento = numero_asiento;
        this.estado = estado;
        this.compartimento = compartimento;
    }

    public int getNumero_asiento() {
        return numero_asiento;
    }

    public void setNumero_asiento(int numero_asiento) {
        this.numero_asiento = numero_asiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(String compartimento) {
        this.compartimento = compartimento;
    }
    
    public void reservar(){
    }
    public void comprar(){
    }
    public void mostrar_disponibilidad(){
    }
    public void desbloquear(){
    }
    
}
