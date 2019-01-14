
package tema6parctica2ej1;

import java.util.ArrayList;
import MisClases.Estudios;
import MisClases.Peliculas;
import java.util.Date;
import javax.swing.JOptionPane;

public class Tema6Parctica2Ej1 {


    public static void main(String[] args) {
      //Añadir estudios
      Estudios e1 = new Estudios ("Pixar","LA","alli lejos","www.pixar.org",new Date(),"USA","888994433");
      Estudios e2 = new Estudios ("Marvel","La","aqui cerca","www.marvel.com",new Date(1976,5,19),"Usa","999887766");
      
      //añadir peliculas
      Peliculas p1 = new Peliculas ("HP1","2000",160.22f,"Gore");
      Peliculas p2 = new Peliculas ("Totoro","1980",79.55f,"infantil");
      Peliculas p3 = new Peliculas ("Pikemon","2002",200.55f,"Bebes");
        
       ArrayList <Peliculas> arrPeliculas = new ArrayList();
       
       //totoro es de pixar
       p2.addEstudio(e1);
       //totoro e de marvel
       //p2.addEstudio(e2);
       //pikemon es de pixar
       p3.addEstudio(e1);
       //hp1 es de marvel
       p1.addEstudio(e2);
       
       //guardar las pelis en el array
       arrPeliculas.add(p1);
       arrPeliculas.add(p2);
       arrPeliculas.add(p3);
           
       //pelicula mas larga
       
       float maximaDuracion = 0.0f;
       int posicion =0;
       for(int x=0;x < arrPeliculas.size()   ;x++){
           if(arrPeliculas.get(x).getDuracion() > maximaDuracion){
               maximaDuracion = arrPeliculas.get(x).getDuracion();
               
               posicion = x;
           }
       }
       JOptionPane.showMessageDialog(null,"La pelicula mas larga es " + arrPeliculas.get(posicion).getTitulo() + " con una duración de " + arrPeliculas.get(posicion).getDuracion());
       
       //nombre del estudio que peliculas ha producido
        int contadorMarvel = 0;
        
        
       
        
        for(int y=0; y < arrPeliculas.size(); y++){
            
            
          
          
          }
       
       
    }
    
 
    
}
