
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           // Existen 3 formaras de crear una instancia
		//1.- instancia de clases utilizando contructor vacio
		Auto newAuto= new Auto();
		newAuto.id=1;
		newAuto.marca="Nissan";
		newAuto.modelo="Sentra";
		newAuto.color="rojo";
		newAuto.numPuertas=4;
		newAuto.precio=30000000.50F;
		
		//imprimir
		System.out.println("ID: " +newAuto.id);
		System.out.println("Marca: " +newAuto.marca);
		System.out.println("Modelo: " + newAuto.modelo);
		System.out.println("Color: " + newAuto.color);
		System.out.println("Numero Puertas" + newAuto.numPuertas);
		System.out.println("precio: " + newAuto.precio);
		
	}

}
