
package UML;

import java.util.Date;


public class Persona {
    
    private String dni;
    private String nss;
    private String nombreApellido;
    private String direccion;
    private String telefono;
    private String sexo;
    private String estadoCivil;
    private String contrato;
    private String departamento;
    private Date fechaAlta;
    private int numeroEmpleado;

    public Persona() {
    }

    public Persona(String dni, String nss, String nombreApellido, String direccion, String telefono, String sexo, String estadoCivil, String contrato, String departamento, Date fechaAlta, int numeroEmpleado) {
        this.dni = dni;
        this.nss = nss;
        this.nombreApellido = nombreApellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.contrato = contrato;
        this.departamento = departamento;
        this.fechaAlta = fechaAlta;
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
            
    
    
    
}
