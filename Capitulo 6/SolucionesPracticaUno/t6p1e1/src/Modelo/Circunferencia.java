
package Modelo;

public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getLongitud(){
        return 2 * Math.PI * radio;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(getRadio(),2);
    }
    
    public double getVolumen(){
        return 4 * Math.PI * Math.pow(radio, 3) / 3;
    }
}
