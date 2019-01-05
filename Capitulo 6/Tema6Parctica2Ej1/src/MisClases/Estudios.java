
package MisClases;

import java.util.Date;


public class Estudios{
    
    private String nombre;
    private String ciudad;
    private String direccion;
    private String dirWeb;
    private Date fechaFundacion;
    private String pais;
    private String telefonos;
    
    

    public Estudios() {
    }

    public Estudios(String nombre, String ciudad, String direccion, String dirWeb, Date fechaFundacion, String pais, String telefonos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dirWeb = dirWeb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
        this.telefonos = telefonos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirWeb() {
        return dirWeb;
    }

    public void setDirWeb(String dirWeb) {
        this.dirWeb = dirWeb;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }
    
   public void nuevoEstudio(){
   } 
   public void modificarEstudio(){
   }
   public void cierraEstudio(){
   }
   public void despliegaEstudio(){
   }
    
  
}
