
package MisClases;


public class Circunferencia { 
    
    private double radio;
    
    private double longitud;
    private double area;
    private double volumen;

    public Circunferencia() {
    }
    
    public Circunferencia(double radio) {
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


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    
    public void calcularLongitud(){
        double aux = 2 * Math.PI * this.getRadio();
        
        //aux = Math.round(aux);
        
        this.setLongitud(aux);
    }
    
        public void calcularArea(){
        double aux = Math.PI * this.getRadio() * this.getRadio();
        
        //aux = Math.round(aux);
        
        this.setArea(aux);
    }
        
        public void calcularVolumen(){
        double aux = 4 * Math.PI * this.getRadio() * this.getRadio() * this.getRadio() /3;
        
        //aux = Math.round(aux);
        
        this.setVolumen(aux);
    }


}
