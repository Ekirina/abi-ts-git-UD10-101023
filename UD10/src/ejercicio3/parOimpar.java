package ejercicio3;

import java.util.Random;

public class parOimpar {

	public void numAleatorio() {
		Random r = new Random();
		int num = r.nextInt(999);

		try {
			System.out.println("Generando número aleatorio...");
			System.out.println("El número aleatorio es "+num);
			if(num %2 == 0) {
				System.out.println("Es par");
			}else {
				System.out.println("Es impar");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}

}
