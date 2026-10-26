package uni1a;
import java.util.ArrayList;
public class VideoMusical extends ContenidoAudiovisual {
	private String artista;
	private String compositor;
	private String fechaLanzamiento;
	private ArrayList<Actor> actoresVidMus;
	// Se crea el método de la clase
	public VideoMusical(String titulo, int duracionEnMinutos, String genero, String artista ) {
		super(titulo, duracionEnMinutos, genero);
		this.artista = artista;
		this.actoresVidMus = new ArrayList<>();
	}

    public void agregarActores(Actor... actores) {
        for (Actor actor : actores) {
            this.actoresVidMus.add(actor);}
    }
	
	public ArrayList<Actor> getActoresVidMus() {
		return actoresVidMus;
	}

	public void setActoresVidMus(ArrayList<Actor> actoresVidMus) {
		this.actoresVidMus = actoresVidMus;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getCompositor() {
		return compositor;
	}

	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}

	public String getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(String fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("---------- DETALLE DEL VIDEOCLIP ----------\n" +
                "Título: " + getTitulo() + "\n Duración: " + getDuracionEnMinutos() + " min\n" + "Género: " + getGenero() + "\n" +
                "Artista: " + artista + "\n" + "Compositor: " + compositor + "\n" + "Fecha de lanzamiento: " + fechaLanzamiento);
	
		if (!actoresVidMus.isEmpty()) {
		    System.out.println("Actores: ");
		    for (Actor actor : actoresVidMus) {
		        actor.mostrarDetalles();
		    }
		}	
	}

}
