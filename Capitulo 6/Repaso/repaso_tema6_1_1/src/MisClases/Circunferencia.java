
package MisClases;

public class Circunferencia {
    
private double radio;

private double longitud;
private double area;
private double volumen;

    //Constructor vacio -- Constructor lleno -- Getters & Setters

    public Circunferencia() {
    }

    public Circunferencia(double radio, double longitud, double area, double volumen) {
        this.radio = radio;
        this.longitud = longitud;
        this.area = area;
        this.volumen = volumen;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    
    //Codigo extra
    
    public void calcularLongitud(){
        double aux = 2 * Math.PI * this.getRadio();
        
        //aux = Math.round(aux);
        
        this.setLongitud(aux);
    }
    
    public void calcularArea(){
        double aux = Math.PI * radio * radio;
    
        this.setArea(aux);
    }
    
    public void calcularVolumen(){
        double aux = 4 * Math.PI * radio * radio * radio/3; 
    
        this.setVolumen(aux);
    }
    
}
