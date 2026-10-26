package uni1a;
// Se crea la clase
public class Investigador {
	private String nombre;
	private int edad;
	private String nacionalidad;
// Se crea su constructor	
public Investigador(String nombre,int edad, String nacionalidad) {
	this.nombre = nombre;
	this.edad = edad;
	this.nacionalidad = nacionalidad;
}

// Se crean los métodos getters y setters
public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public String getNacionalidad() {
	return nacionalidad;
}


public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}	

}
