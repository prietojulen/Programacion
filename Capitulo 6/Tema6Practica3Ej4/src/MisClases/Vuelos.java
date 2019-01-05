
package MisClases;

import java.util.ArrayList;


public class Vuelos {
    
    private int numero_vuelo;
    private String hora_salida;
    private String hora_llegada;
    private String origen;
    private String destino;
    private String fecha_salida;
    private String fecha_regreso;
    private String tipo_vuelos;
    
    private ArrayList<Ciudades> ciudad;
    private ArrayList<Pasajeros> pasajero;
    private ArrayList<Aviones> avion;
    private ArrayList<Pilotos> piloto;

    public Vuelos() {
    }

    public Vuelos(int numero_vuelo, String hora_salida, String hora_llegada, String origen, String destino, String fecha_salida, String fecha_regreso, String tipo_vuelos) {
        this.numero_vuelo = numero_vuelo;
        this.hora_salida = hora_salida;
        this.hora_llegada = hora_llegada;
        this.origen = origen;
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.fecha_regreso = fecha_regreso;
        this.tipo_vuelos = tipo_vuelos;
    }

    public Vuelos(int numero_vuelo, String hora_salida, String hora_llegada, String origen, String destino, String fecha_salida, String fecha_regreso, String tipo_vuelos, ArrayList<Ciudades> ciudad, ArrayList<Pasajeros> pasajero, ArrayList<Aviones> avion, ArrayList<Pilotos> piloto) {
        this.numero_vuelo = numero_vuelo;
        this.hora_salida = hora_salida;
        this.hora_llegada = hora_llegada;
        this.origen = origen;
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.fecha_regreso = fecha_regreso;
        this.tipo_vuelos = tipo_vuelos;
        this.ciudad = ciudad;
        this.pasajero = pasajero;
        this.avion = avion;
        this.piloto = piloto;
    }
    
    

    public int getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(int numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getFecha_regreso() {
        return fecha_regreso;
    }

    public void setFecha_regreso(String fecha_regreso) {
        this.fecha_regreso = fecha_regreso;
    }

    public String getTipo_vuelos() {
        return tipo_vuelos;
    }

    public void setTipo_vuelos(String tipo_vuelos) {
        this.tipo_vuelos = tipo_vuelos;
    }

    public ArrayList<Ciudades> getCiudad() {
        return ciudad;
    }

    public void setCiudad(ArrayList<Ciudades> ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Pasajeros> getPasajero() {
        return pasajero;
    }

    public void setPasajero(ArrayList<Pasajeros> pasajero) {
        this.pasajero = pasajero;
    }

    public ArrayList<Aviones> getAvion() {
        return avion;
    }

    public void setAvion(ArrayList<Aviones> avion) {
        this.avion = avion;
    }

    public ArrayList<Pilotos> getPiloto() {
        return piloto;
    }

    public void setPiloto(ArrayList<Pilotos> piloto) {
        this.piloto = piloto;
    }
    
    
    
    public void reservar(){
    }
    public void modificar(){
    }
    public void eliminar(){
    }
    public void buscar(){
    }
    
}
