package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("======== PRUEBA DE FUNCIONAMIENTO ========");
        // Instancias de la subclase pelicula y actor.
      Pelicula peliculaThMa = new Pelicula("The Matrix", 136, "Ciencia Ficcion", "Warner Bros");
      Actor keanuReeves = new Actor("Keanu Reeves", 62, 1.86, "Canadiense");
      Actor carrieAnneMoss = new Actor("Carrie Anne Moss", 56, 1.70, "Canadiense");
      Actor laurenceFishburne = new Actor("Laurence Fishburne", 64, 1.84, "Estadounidense");
      peliculaThMa.agregarActores(keanuReeves, carrieAnneMoss, laurenceFishburne);
   
      
      Pelicula peliculaThDaKn = new Pelicula("The Dark Night", 152, "Accion", "Warner Bros");
      Actor christianBale = new Actor("Christian Bale", 52, 1.83, "Britanica");
      Actor cillianMurphy = new Actor("Cillian Murphy", 50, 1.75, "Irlandesa");
      Actor morganFreeman = new Actor("Morgan Freeman", 89, 1.88, "Estadounidense");
      peliculaThDaKn.agregarActores(christianBale, cillianMurphy, morganFreeman);
   
 
     
     
        // Instancias de subclase Serie De Tv y temporada
        SerieDeTV serieThBrBa = new SerieDeTV("The Breaking Bad", 540, "Drama", 5);
      serieThBrBa.agregarTemporada(new Temporada(1, 7)); 
      serieThBrBa.agregarTemporada(new Temporada(2, 13)); 
      serieThBrBa.agregarTemporada(new Temporada(3, 13)); 
      serieThBrBa.agregarTemporada(new Temporada(4, 13)); 
      serieThBrBa.agregarTemporada(new Temporada(5, 16));
       
        SerieDeTV serieStTh = new SerieDeTV("Stranger Things", 480, "Ciencia Ficción", 4);
      serieStTh.agregarTemporada(new Temporada(1, 8));
      serieStTh.agregarTemporada(new Temporada(2, 9));
      serieStTh.agregarTemporada(new Temporada(3, 8));
      serieStTh.agregarTemporada(new Temporada(4, 9));
      
      
      
    
        //Instancias de subclases Invetigar y Documental 
      Investigador investigadorTrHa = new Investigador("Tristan Harris", 41, "Estadounidense");
      Documental documental1 = new Documental("El dilema de las redes sociales", 94, "Documental", "Ética en la tecnología y redes sociales", investigadorTrHa);
      
      Investigador investigadorRiVe = new Investigador("Richard Vevers", 48, "Británico");
      Documental documental2 = new Documental("En busca del coral", 89, "Documental", "Blanqueamiento de corales", investigadorRiVe);
      
        
        // Instancias de subclases Video Musical y Actores
      
      VideoMusical video1 = new VideoMusical("Rush Rush", 4, "Pop", "Paula Abdul");
      video1.agregarActores(keanuReeves);

      VideoMusical video2 = new VideoMusical("The Water", 15, "Indie", "Feist");
      video2.agregarActores(cillianMurphy);
      
      
      
      
       
      System.out.println("Hola, puedes elegir entre Peliculas, Series, Documentales, Videos Musicales o Podcasts.\n");
      System.out.println("Menu de eleccion:\n1. Peliculas.\n2. Series.\n3. Documentales.\n4. Videos Musicales.\n5. Podcasts.\n.6 Salir");
      
      int eleccion;
      
      
      
      
      
    
      
      
      
      
      
      
      
      /* ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy",null);

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }*/
    }
}