package ups.soft.poo.tarea_u2;
import java.util.ArrayList;
public class VideoMusical extends ContenidoAudiovisual {
	private String artista;

	private String fechaLanzamiento;
	private ArrayList<Actor> actoresVidMus;
	// Se crea el método de la clase
	public VideoMusical(String titulo, int duracionEnMinutos, String genero, String artista) {
		super(titulo, duracionEnMinutos, genero);
		this.artista = artista;
		this.actoresVidMus = new ArrayList<>();
	}
    // Se crea un metodo para agregar actores
    public void agregarActores(Actor... actores) {
        for (Actor actor : actores) {
            this.actoresVidMus.add(actor);}
    }
	// Se crean metodos getters y setters
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

	public String getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(String fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
    // Se configura el metodo para mostrar detalles del video musical y del actor, y en este metodo se usa polimorfismo
	@Override
	public void mostrarDetalles() {
		System.out.println("Detalle del video musical:\n" +
                "Título: " + getTitulo() + "\nDuración: " + getDuracionEnMinutos() + " min\n" + "Género: " + getGenero() + "\n" +
                "Artista: " + artista + "\n");
	
		if (!actoresVidMus.isEmpty()) {
		    System.out.println("Actores Principales: ");
		    for (Actor actor : actoresVidMus) {
		        actor.mostrarDetalles();
		    }
		}	
	}

}
