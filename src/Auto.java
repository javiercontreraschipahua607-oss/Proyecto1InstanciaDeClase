
public class Auto {
// una clase es una plantilla donde estructuramos atributos y metodos de un objeto
	/*
	 * --POJOS son objetos simlres -->
	 * significa que no dependemos de ninguna API  es decir estamos 
	 * agregando manualmente atributos, contructor vacio, contructor con parametros ect a deifernecnai cuando se trabaja con un framework 
	 * aqui si dependemos de api's -- loombook etc.
	 *  
 * 
 */
	
	//1.- Atributos --> inicia con la primera letra en minuscula
	int id;
	String marca;
	String modelo;
	String color;
	int numPuertas;
	float precio;
	
	//2.- contructor vacio permite crear instancias de clases
	
	public Auto() {
		// TODO Auto-generated constructor stub
	}
	//3.-contructor con paramentros  -> inicar un objeto y sus valores 
	public Auto(int id, String marca, String modelo, String color, int numPuertas, float precio) {
		
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.numPuertas = numPuertas;
		this.precio = precio;
	}
	//4.-metodo toString ->convertir un objeto o cadena -> deserealizarlo
	
	@Override
	public String toString() {
		return "Auto [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", numPuertas="
				+ numPuertas + ", precio=" + precio + "]\n";
	}
	//5.- encapsulamiento -> esta conformado por funciones y procedimientos -->GET y SET
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
}
