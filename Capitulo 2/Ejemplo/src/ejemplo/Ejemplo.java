/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author PETO
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear variables en java
        // Variables numericas
        byte v1; //solo reserva espacio para 8bits (-127 a +128 -->255)(numero entero)
        short v2; //16bits para el numero (numero entero)
        v2 = 6;
        int v3; //32bits (numero entero)
        v3 =10;
        long v4; //64bits (numero entero)
        float v5; //32bits (numeros reales)
        v5 =3.14f;
        double v6; //64bits (numeros reales)
        v6 = 3.14;
        // Variables alfanuméricas
        char v7; // Solo un carácter
        v7 = 'a';
        String v8; // La primera en maysu! Cadena de caracteres
        v8 = "hola";
        // Variables booleanas
        boolean v9; // solo ocupan un bit 0/1 True/False
        v9 = false;
        
        String nombre = "peto";
        int nro = 78;
        int contador = 0;
        int n1,n2;
        int n3=9,n4=8,n5;
        
        // costantes
        final float PI = 3.14f;
        
        
        
        /* showInputDialog SIEMPRE SE CONSIDERA STRING */
        nombre = javax.swing.JOptionPane.showInputDialog("Dime tu nombre");
        
        /* Convertir un String a un byte , conversion o castings */
        String edad = javax.swing.JOptionPane.showInputDialog("Dime tu edad");
        byte edadNumerica = Byte.parseByte(edad);
        
        Integer nmro;
        
        
        
    }
    
}
