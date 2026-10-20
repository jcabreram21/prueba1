/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;
// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    
    private ArrayList<Temporada> temporadas;
    private int totalTemporadas;
    
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int totalTemporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>();
    
    }


    public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}


    public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}


	public int getTotalTemporadas() {
	return totalTemporadas;
}


	public void setTotalTemporadas(int totalTemporadas) {
	this.totalTemporadas = totalTemporadas;
}


	@Override
	public void mostrarDetalles() {
        System.out.println("Detalles de la Serie:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.totalTemporadas);
        System.out.println();
    }
}