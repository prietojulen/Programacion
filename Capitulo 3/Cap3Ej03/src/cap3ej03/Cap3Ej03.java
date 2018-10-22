package cap3ej03;



public class Cap3Ej03 {


    public static void main(String[] args) {
        // TODO code application logic here
        
         //método para calcular el número de veces que se repite un carácter en un String
        int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
}

        
        
    }
    
}
