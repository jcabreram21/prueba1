package uni1a;
import java.util.ArrayList;
// Se crea la clase
public class Temporada {
	private int numTemporada;
	private int numCapitulos;
	private ArrayList<Temporada> temporadas = new ArrayList<>();
// Se crea el constructor y metodo que se usarán posteriormente
public Temporada(int numTemporada, int numCapitulos ) {
	this.numTemporada = numTemporada;
	this.numCapitulos = numCapitulos;
	}


// Se crean los métodos getters y setters
public int getNumTemporada() {
	return numTemporada;
}

public void setNumTemporada(int numTemporada) {
	this.numTemporada = numTemporada;
}

public int getNumCapitulos() {
	return numCapitulos;
}

public void setNumCapitulos(int numCapitulos) {
	this.numCapitulos = numCapitulos;
}

}
