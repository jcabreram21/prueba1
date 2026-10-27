package poo;
import uni1a.*;
import java.util.Scanner;
import java.util.ArrayList;
public class PruebaAudioVisual {
	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner(System.in);
		
		 // Se crean las listas para cada subclase.
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        ArrayList<SerieDeTV> listaSeries = new ArrayList<>();
        ArrayList<Documental> listaDocumentales = new ArrayList<>();
        ArrayList<VideoMusical> listaVideosMusicales = new ArrayList<>();
		ArrayList<Podcast>listaPodcasts = new ArrayList<>();
		


        // Instancias de la subclase pelicula y actor.
      Pelicula peliculaThMa = new Pelicula("The Matrix", 136, "Ciencia Ficcion", "Warner Bros");
      Actor keanuReeves = new Actor("Keanu Reeves", 62, 1.86, "Canadiense");
      Actor carrieAnneMoss = new Actor("Carrie Anne Moss", 56, 1.70, "Canadiense");
      Actor laurenceFishburne = new Actor("Laurence Fishburne", 64, 1.84, "Estadounidense");
      peliculaThMa.agregarActores(keanuReeves, carrieAnneMoss, laurenceFishburne);
      listaPeliculas.add(peliculaThMa);
      
      Pelicula peliculaThDaKn = new Pelicula("The Dark Night", 152, "Accion", "Warner Bros");
      Actor christianBale = new Actor("Christian Bale", 52, 1.83, "Britanica");
      Actor cillianMurphy = new Actor("Cillian Murphy", 50, 1.75, "Irlandesa");
      Actor morganFreeman = new Actor("Morgan Freeman", 89, 1.88, "Estadounidense");
      peliculaThDaKn.agregarActores(christianBale, cillianMurphy, morganFreeman);
      listaPeliculas.add(peliculaThDaKn);
 
     
     
        // Instancias de subclase Serie De Tv y temporada
        SerieDeTV serieThBrBa = new SerieDeTV("The Breaking Bad", 540, "Drama", 5);
      serieThBrBa.agregarTemporada(new Temporada(1, 7)); 
      serieThBrBa.agregarTemporada(new Temporada(2, 13)); 
      serieThBrBa.agregarTemporada(new Temporada(3, 13)); 
      serieThBrBa.agregarTemporada(new Temporada(4, 13)); 
      serieThBrBa.agregarTemporada(new Temporada(5, 16));
      listaSeries.add(serieThBrBa);
       
        SerieDeTV serieStTh = new SerieDeTV("Stranger Things", 480, "Ciencia Ficción", 4);
      serieStTh.agregarTemporada(new Temporada(1, 8));
      serieStTh.agregarTemporada(new Temporada(2, 9));
      serieStTh.agregarTemporada(new Temporada(3, 8));
      serieStTh.agregarTemporada(new Temporada(4, 9));
      listaSeries.add(serieStTh);
      
      
    
        //Instancias de subclases Invetigar y Documental 
      Investigador investigadorTrHa = new Investigador("Tristan Harris", 41, "Estadounidense");
      Documental documentalElDi = new Documental("El dilema de las redes sociales", 94, "Documental", "Ética en la tecnología y redes sociales", investigadorTrHa);
      listaDocumentales.add(documentalElDi);
      
      Investigador investigadorRiVe = new Investigador("Richard Vevers", 48, "Británico");
      Documental documentalEnBu = new Documental("En busca del coral", 89, "Documental", "Blanqueamiento de corales", investigadorRiVe);
      listaDocumentales.add(documentalEnBu);
      
      
        
        // Instancias de subclases Video Musical y Actores
      
      VideoMusical videoMRuRu = new VideoMusical("Rush Rush", 4, "Pop", "Paula Abdul");
      videoMRuRu.agregarActores(keanuReeves);
      listaVideosMusicales.add(videoMRuRu);

      VideoMusical videoMThWa = new VideoMusical("The Water", 15, "Indie", "Feist");
      videoMThWa.agregarActores(cillianMurphy);
      listaVideosMusicales.add(videoMThWa);
      
      
      
        // Instancias de subclase Podcasts e Investigadores
      
      Podcast podcastLaEt = new Podcast("La ética de la tecnología y la atención humana", 45,"Tecnología",1 ,1, investigadorTrHa); 
    	listaPodcasts.add(podcastLaEt);	  
      
      Podcast podcastLaCo = new Podcast("La conservación de los océanos y el impacto visual", 50, "Ciencia y Ambiente", 1, 2, investigadorRiVe);
    	listaPodcasts.add(podcastLaCo);	 

    	
    	
    	// Se crea la interfaz
      System.out.println("======== PRUEBA DE FUNCIONAMIENTO ========");
      System.out.println("Hola, puedes elegir entre Peliculas, Series, Documentales, Videos Musicales o Podcasts.\n");
      System.out.println("Menu de eleccion:\n1. Peliculas.\n2. Series.\n3. Documentales.\n4. Videos Musicales.\n5. Podcasts.\n6. Salir");
      int eleccion = validacionIngresos(entrada);
      boolean validacion = true;
      
      while (eleccion < 1 || eleccion > 6) {
    	    System.out.println("Ingrese un valor correcto!");
    	    System.out.print("Elige una opcion valida: ");
    	    eleccion = validacionIngresos(entrada);
    	    validacion = false;
      }
      
      if (eleccion == 6) {
      		System.out.println("Adios, vuelve pronto!");
      }
          if(validacion == true || eleccion != 6); {
      	
      		  switch (eleccion) {
      		  case 1:
      		      System.out.println("\nLista de Peliculas:");
      		          for (int i = 0; i < listaPeliculas.size(); i++) {
      		              System.out.println((i + 1) + ". " + listaPeliculas.get(i).getTitulo());
      	              }
      		    
      		              System.out.print("Elige el número de la película que deseas ver: ");
      		              int seleccionPel = validacionIngresos(entrada);
      		    
      		   
      		    	      while (seleccionPel < 1 || seleccionPel > listaPeliculas.size()) {
      		    		      System.out.println("Error! Valor ingresado erroneo, elige un número de la lista:");
      		    		      seleccionPel = validacionIngresos(entrada);
      		       
      		              }
      		                  Pelicula pelElegida = listaPeliculas.get(seleccionPel - 1);
                              pelElegida.mostrarDetalles();
             
      		    break;
      			
      		  case 2:
      		      System.out.println("\nLista de Series:");
  		              for (int i = 0; i < listaSeries.size(); i++) {
  		                  System.out.println((i + 1) + ". " + listaSeries.get(i).getTitulo());
  	              }
  		    
  		                  System.out.print("Elige el número de la serie que deseas ver: ");
  		                  int seleccionSerie = validacionIngresos(entrada);
  		    
  		   
  		    	          while (seleccionSerie < 1 || seleccionSerie > listaSeries.size()) {
  		    		      System.out.println("Error! Valor ingresado erroneo, elige un número de la lista:");
  		    		      seleccionSerie = validacionIngresos(entrada);
  		       
  		              }
  		                  SerieDeTV serieElegida = listaSeries.get(seleccionSerie - 1);
                          serieElegida.mostrarDetalles();
         
         
      			break;
      			
      		  case 3:
      			  System.out.println("\nLista de Series:");
		              for (int i = 0; i < listaDocumentales.size(); i++) {
		                  System.out.println((i + 1) + ". " + listaDocumentales.get(i).getTitulo());
	              }
		    
		                  System.out.print("Elige el número de la serie que deseas ver: ");
		                  int seleccionDoc = validacionIngresos(entrada);
		    
		   
		    	          while (seleccionDoc < 1 || seleccionDoc > listaDocumentales.size()) {
		    		      System.out.println("Error! Valor ingresado erroneo, elige un número de la lista:");
		    		      seleccionDoc = validacionIngresos(entrada);
		       
		              }
		                  Documental docElegido = listaDocumentales.get(seleccionDoc - 1);
                          docElegido.mostrarDetalles();
      			break;
      		case 4:
      			for (int i = 0; i < listaVideosMusicales.size(); i++) {
      				System.out.println((i + 1) + "." +  listaVideosMusicales.get(i).getTitulo());
      			}
      			break;
      		case 5:
      			for (int i = 0; i < listaPodcasts.size(); i++) {
      				System.out.println((i + 1) + "." +  listaPodcasts.get(i).getTitulo());
      			}
      			break;
      	
      		}
      
      	}
      
      
      
    
      
      
      
		
      
      
      
      /* ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy",null);

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }*/
    }
		// Se crea un metodo para validar los ingresos de datos desde el usuario
		public static int validacionIngresos(Scanner scanner) {
		    int numero = 0;
		    boolean entradaValida = false;
		    
		    while (entradaValida == false) {
		        try {
		            numero = scanner.nextInt();
		            entradaValida = true;       
		        } catch (java.util.InputMismatchException e) {
		            System.out.println("Error! Debes ingresar un valor correcto");
		            System.out.print("Escribe un numero para elegir la opcion correcta: ");
		            scanner.next();
		        }
		    }
		    return numero;
		}	
}