
package MisClases;

public class Empleados extends Personas{
    
     private Double sueldo_bruto;

    public Empleados() {
    }

    public Empleados(Double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public Empleados(Double sueldo_bruto, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    public Double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(Double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
     
    public void mostrar(){
    }
    public void calcular_sueldo_neto(){
    }
    
}
