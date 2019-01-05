
package tema6parctica2ej1;

import java.util.ArrayList;
import MisClases.Estudios;
import MisClases.Peliculas;

public class Tema6Parctica2Ej1 {


    public static void main(String[] args) {
        // TODO code application logic here
        
       ArrayList <Peliculas> arrPeliculas = new ArrayList();
        
       Estudios estudio = new Estudios();
       
       //arrPeliculas.add(new Peliculas("Et","1980",140.30f,"Infantil"));
       //Genero un objeto de la clase Película
       Peliculas pelicula = new Peliculas("Et","1980",140.30f,"Infantil");
       //Añado el estudio correspondiente a la película.
       pelicula.addEstudio(estudio);
       //Añado la película al array.
       arrPeliculas.add(pelicula);
               
       //Obtengo los estudios de la pelicula 0.
       arrPeliculas.get(0).getEstudios();
       
                
    }
    
}
