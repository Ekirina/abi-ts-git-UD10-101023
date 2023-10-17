package ejercicio2;

public class Excepcion {

	public static void main(String[] args) {
		try {
			System.out.println("Un mensaje por pantalla");
			Exception e = new Exception("Esto es el objeto de la clase Exception");
			throw e;
		} catch (Exception excep) {
			System.out.println("Excepcion capturada con mensaje: " + excep.getMessage());
		}
	}
}


