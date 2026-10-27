package ups.soft.poo.tarea_u2.prueba_audiovisual;
import java.util.Scanner;

import ups.soft.poo.tarea_u2.*;

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
      Actor carrieAnneMoss = new Actor("Carrie Anne Moss", 56, 1.71, "Canadiense");
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

    	
    	
    	// Se empieza a diseñar la interfaz
      System.out.println("======== PRUEBA DE FUNCIONAMIENTO ========");
      System.out.println("Hola, puedes elegir entre Peliculas, Series, Documentales, Videos Musicales o Podcasts.\n");
      System.out.println("Menu de eleccion:\n1. Peliculas.\n2. Series.\n3. Documentales.\n4. Videos Musicales.\n5. Podcasts.\n6. Salir");
      int eleccion = validacionIngresos(entrada);
      boolean validacion = true;
       
       // Se valida que el numero ingresado este dentro del rango.
      while (eleccion < 1 || eleccion > 6) {
    	    System.out.println("Ingrese un valor correcto!");
    	  
    	    eleccion = validacionIngresos(entrada);
    	    validacion = false;
      }
      // Se coloca la opcion para terminar el progrma.
      if (eleccion == 6) {
      		System.out.println("Adios, vuelve pronto!");
      }
          if(validacion == true || eleccion != 6); {
      	
        	  // Se muestran los menus disponibles y se muestran los detalles segun se elija la opcion, usando los respectivos métodos.
      		  switch (eleccion) {
      		  case 1:
      		      System.out.println("\nLista de Peliculas:");
      		          for (int i = 0; i < listaPeliculas.size(); i++) {
      		              System.out.println((i + 1) + ". " + listaPeliculas.get(i).getTitulo());
      	              }
      		    
      		              System.out.print("Elige el número de la película que deseas ver:\n ");
      		              int seleccionPel = validacionIngresos(entrada);
      		              if (seleccionPel == 6) {
		                	  System.out.println("Adios! Vuelve pronto");
		                      break;}
		                      
      		   
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
  		    
  		                  System.out.print("Elige el número de la serie que deseas ver:\n ");
  		                  int seleccionSerie = validacionIngresos(entrada);
  		                  if (seleccionSerie == 6) {
		                	  System.out.println("Adios! Vuelve pronto");
		                      break;}
		                      
  		   
  		    	              while (seleccionSerie < 1 || seleccionSerie > listaSeries.size()) {
  		    		              System.out.println("Error! Valor ingresado erroneo, elige un número de la lista:");
  		    		              seleccionSerie = validacionIngresos(entrada);
  		          
  		                      }
  		                          SerieDeTV serieElegida = listaSeries.get(seleccionSerie - 1);
                                  serieElegida.mostrarDetalles();
                break;
           
      		  case 3:
      			  System.out.println("\nLista de Documentales:\n");
		              for (int i = 0; i < listaDocumentales.size(); i++) {
		                  System.out.println((i + 1) + ". " + listaDocumentales.get(i).getTitulo());
	                  }
		    
		                  System.out.print("Elige el número del Documental que deseas ver:\n ");
		                  int seleccionDoc = validacionIngresos(entrada);
		                  if (seleccionDoc == 6) {
		                	  System.out.println("Adios! Vuelve pronto");
		                      break;}
		                      
		    	              while (seleccionDoc < 1 || seleccionDoc > listaDocumentales.size()) {
		    		              System.out.println("Error! Valor ingresado erroneo, elige un número de la lista:");
		    		              seleccionDoc = validacionIngresos(entrada);
		        
		                  }
		                          Documental docElegido = listaDocumentales.get(seleccionDoc - 1);
                                  docElegido.mostrarDetalles();
      			break;
      		
      		  case 4:
      		      System.out.println("\nLista de Videos Musicales:");
		              for (int i = 0; i < listaVideosMusicales.size(); i++) {
		                  System.out.println((i + 1) + ". " + listaVideosMusicales.get(i).getTitulo());
	                  }
		    
		                  System.out.print("Elige el número del video musical que deseas ver:\n ");
		                  int seleccionViMu = validacionIngresos(entrada);
		                  if (seleccionViMu == 6) {
		                	  System.out.println("Adios! Vuelve pronto");
		                      break;}
		                      
		   
		    	              while (seleccionViMu < 1 || seleccionViMu > listaVideosMusicales.size()) {
		    		              System.out.println("Error! Valor ingresado erroneo, elige un número de la lista:");
		    		              seleccionViMu = validacionIngresos(entrada);
		       
		                      }
		                          VideoMusical ViMuElegido = listaVideosMusicales.get(seleccionViMu - 1);
                                  ViMuElegido.mostrarDetalles();
      		    break;
      	    
      		  case 5:
     			  System.out.println("\nLista de Podcasts:\n");
	                  for (int i = 0; i < listaPodcasts.size(); i++) {
	                      System.out.println((i + 1) + ". " + listaPodcasts.get(i).getTitulo());
                    }
	    
	                      System.out.print("Elige el número del Podcast que deseas ver:\n ");
	                      int seleccionPod = validacionIngresos(entrada);
	                      if (seleccionPod == 6) {
		                	  System.out.println("Adios! Vuelve pronto");
		                      break;}
		                      
	   
	    	                  while (seleccionPod < 1 || seleccionPod > listaPodcasts.size()) {
	    		                  System.out.println("Error! Valor ingresado erroneo, elige un número de la lista:");
	    		                  seleccionPod = validacionIngresos(entrada);
	       
	                          }
	                              Podcast podElegido = listaPodcasts.get(seleccionPod - 1);
                                  podElegido.mostrarDetalles();
      		      
      		   
      		   break;
      	
      		}
      
      	}
      
    }
		// Se crea un metodo para validar que el dato ingresado sea un numero
		public static int validacionIngresos(Scanner scanner) {
		    int numero = 0;
		    boolean entradaValida = false;
		    
		    while (entradaValida == false) {
		        try {
		            numero = scanner.nextInt();
		            entradaValida = true;       
		        } catch (java.util.InputMismatchException e) {
		            System.out.println("Error! Debes elegir una opcion valida:");
		           
		            scanner.next();
		        }
		   
		    }
		    return numero;
		}	
}