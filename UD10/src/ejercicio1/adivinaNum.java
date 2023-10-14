package ejercicio1;

import javax.swing.JOptionPane;

public class adivinaNum {

	public void esadivinaNum(){	

		int aleatorio = (int) (Math.floor(Math.random()*(500-1+1)+1));
		int contador = 1;	
		int num = 0;

		do {
			try{
				int n1=Integer.parseInt(JOptionPane.showInputDialog("Adivina el número entre 500. Pon alguno: "));
				num = n1;
				if (num != aleatorio && num < aleatorio) {
					System.out.println("Tu número "+num+ " es menor, prueba otra vez.");
					contador++;
				}else if (num != aleatorio && num > aleatorio) {
					System.out.println("Tu número "+num+ " es mayor, prueba otra vez.");
					contador++;
				}

			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Debe de poner un número. El error es el siguiente:\n"+ e);
				contador++;
			}
		}while(num != aleatorio);
		System.out.println("¡Enhorabuena! Acertaste el número y tus intentos son: "+contador);
		
	}	
}