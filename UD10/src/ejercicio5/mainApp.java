package ejercicio5;

import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {

		//Primera parte del ejercicio de generar solo una contraseña por teclado
		Password pass1 = new Password();

		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una longitud para generar una contraseña: ");
		int number = sc.nextInt();
		//Al pasar a int el num introducido, llamamos al método de generar el pass aleatoriamente
		pass1.generarPassword(number);
		/*Imprime con el get de Contraseña porque si no, saldría el apuntador y también imprimimos 
		 * con el metodo boolean para saber si es fuerte o no la contraseña
		 */
		System.out.println(pass1.getContraseña());
		System.out.println(pass1.esFuerte());

		//Segunda parte del ejercicio con las arrays
		System.out.println("Introduce un número para la array de contraseñas: ");
		int num = sc.nextInt();
		//Una vez pedido el tamaño del array, pedimos el tamaño de caracteres de la contraseña	
		System.out.println("Introduce una longitud para generar una contraseña: ");
		int numero = sc.nextInt();
		/*Creación de arrays  llamando a la clase Password y después uno de tipo booleano para que diga T o F
		*con el tamaño que han pedido por teclado, pondremos el mismo numero*/
		Password[] arrayPasswords = new Password[num];
		boolean[] debooleanos = new boolean[num];
		//Bucle for para que vaya generando uno tras otro las contraseñas
		for (int i = 0; i < arrayPasswords.length; i++) {
			arrayPasswords[i] = new Password(numero);
			debooleanos[i]=(arrayPasswords[i]).esFuerte();
			/*Si escribimos delante la array booleano, guardaremos el resultado del método esFuerte del 
			 * arrayPasswords;
			 * Y aquí otra manera de hacerla más complicada:

				if(arrayPasswords[i].esFuerte()){
					debooleanos[i] = true;
				}else{
				debooleanos[i] = false;
				}*/

			System.out.println(debooleanos[i]+"  "+arrayPasswords[i].getContraseña());
		}		sc.close();

	}

}
