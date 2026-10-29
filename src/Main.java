
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
		
		//2 instancia de clases con constructor con parametros 
		Auto newAuto1= new Auto(2, "Chevrolet", "Aveo", "verde", 4 , 400000.00F);
         System.out.println("Auto: " + newAuto1);
         
         //3.- instancia de lcases utilizando encapsulamiento
         Auto newAuto2 = new Auto();
         //Set envio nuevos valores
         newAuto2.setId(3);
         newAuto2.setMarca("Ford");
         newAuto2.setModelo("f150");
         newAuto2.setColor("azul");
         newAuto2.setNumPuertas(4);
         newAuto2.setPrecio(5000000.00F);
         
         //GET obtenemos
         System.out.println("ID:" + newAuto2.getId());
         System.out.println("Marca: " + newAuto2.getMarca());
         System.out.println("Modelo: "+ newAuto2.getModelo());
         System.out.println("color: " + newAuto2.getColor());
         System.out.println("Numero de puertas: " + newAuto2.getNumPuertas());
         System.out.println("Precio: " + newAuto2.getPrecio());
         
	}

}
