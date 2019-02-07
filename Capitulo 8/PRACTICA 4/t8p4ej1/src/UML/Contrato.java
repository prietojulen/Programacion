
package UML;


public class Contrato {
    
    private int idContrato;
    private String tipoContrato;

    public Contrato() {
    }

    public Contrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public Contrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    
    
}
