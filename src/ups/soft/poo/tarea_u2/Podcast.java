package ups.soft.poo.tarea_u2;



public class Podcast extends ContenidoAudiovisual {
	private int numTemporada;
	private int numEpisodio;
	private Investigador invitado;
	
	// Se crea el constructor de la clase
	public Podcast(String titulo, int duracionEnMinutos, String genero, int numTemporada, int numEpisodio, Investigador invitado) {
		super(titulo, duracionEnMinutos, genero);
		this.numTemporada = numTemporada;
		this.numEpisodio = numEpisodio;
		this.invitado = invitado;
		
	}
	// Se crean los métodos getters y setters
	public int getNumTemporada() {
		return numTemporada;
	}

	public void setNumTemporada(int numTemporada) {
		this.numTemporada = numTemporada;
	}

	public int getNumEpisodio() {
		return numEpisodio;
	}

	public void setNumEpisodio(int numEpisodio) {
		this.numEpisodio = numEpisodio;
	}

	public Investigador getInvitado() {
		return invitado;
	}

	public void setInvitado(Investigador invitado) {
		this.invitado = invitado;
	}
    // Se configura el metodo para mostrar detalles del podcast y del investigador invitado
	@Override
	public void mostrarDetalles() {
		System.out.println("Detalle del podcast:\n\n" + "Título: " + getTitulo() + "\n" +
				"Duración: " + getDuracionEnMinutos() + " min\n" + "Género: " + getGenero() + "\n" +
				"Temporada: " + numTemporada + "\n" + "Episodio: " + numEpisodio);
	    if(invitado != null) {
	    	
	    	System.out.println("Invitado: " + invitado.getNombre() + "   (Nacionalidad:" + invitado.getNacionalidad() + ", Edad:" + invitado.getEdad() + " años )");
                             }
	    }
	}


