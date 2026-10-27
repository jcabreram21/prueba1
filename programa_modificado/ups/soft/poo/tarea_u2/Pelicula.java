/**
 * Class Pelicula
 */
package ups.soft.poo.tarea_u2;
import java.util.ArrayList;
// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Actor> actores;
    
    // Se crea el constructor con una arraylist
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }
    // Se crea un metodo para añadir elementos a la arraylist
    public void agregarActores(Actor... actores) {
        for (Actor actor : actores) {
            this.actores.add(actor);}}
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    // Se configura el metodo para mostrar detalles y que usara polimorfismo
    @Override
    public void mostrarDetalles() {
        System.out.println("\nDetalles de la película:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("\nActores principales:");
      
        for (Actor actor : actores) {
	        actor.mostrarDetalles();
        }
    }
}