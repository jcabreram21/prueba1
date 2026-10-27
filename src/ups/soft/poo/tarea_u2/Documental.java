/**
 * Class Documental
 */
package ups.soft.poo.tarea_u2;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador;
    
    // Se crea el constructor
    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, Investigador investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador = investigador;
    }

    // Se cresn los metodos getters y setters
    public Investigador getInvestigador() {
		return investigador;
	}

	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    // Se configura el metodo mostrar detalles que usara polimorfismo
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println();
        if (investigador != null) {
            System.out.println("Indormacion del investigador principal:");
            investigador.mostrarInvestigador();
    
        }
    }
}