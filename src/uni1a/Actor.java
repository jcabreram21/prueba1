package uni1a;
// Se crea la clase actor
public class Actor {
private String nombre;
private int edad;
private double altura;
private String nacionalidad;
// Se crea su constructor
public Actor(String nombre, int edad, double altura, String nacionalidad) {
	this.nombre = nombre;
	this.edad = edad;
	this.altura = altura;
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


public double getAltura() {
	return altura;
}


public void setAltura(double altura) {
	this.altura = altura;
}

public String getNacionalidad() {
	return nacionalidad;
}

public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}

public void mostrarDetalles() {
    System.out.println("Nombre: " + nombre + " \n Edad: " + edad + " \n Altura: " + altura + "m \n Nacionalidad: " + nacionalidad);
}


}
