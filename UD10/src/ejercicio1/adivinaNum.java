package ejercicio1;
import javax.swing.JOptionPane;

public class adivinaNum {

	int aleatorio = (int) (Math.floor(Math.random()*(500-1+1)+1));
	int contador = 1;
	
	adivinaNum n1 = new adivinaNum();
	
	public static void main(String[] args) {

		
		do {
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Adivina el número entre 500. Pon alguno: "));
		}while(n1 != aleatorio) {

		}
	try {	
		if (n1 == aleatorio) {
			System.out.println("¡Enhorabuena! Acertaste el número =) ");
		}else if (n1 < aleatorio){
			System.out.println("Tu número "+n1+ " es menor, prueba otra vez.");
		}else if (n1 > aleatorio) {
			System.out.println("Tu número "+n1+ " es mayor, prueba otra vez.");
		}while(n1 != aleatorio) {
			}
	
		}
	}
	
	}
}
