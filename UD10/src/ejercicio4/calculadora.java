package ejercicio4;

import javax.swing.JOptionPane;

public class calculadora  {
	int num1;
	int num2;
	double suma;
	double resta;
	double por;
	double v2;
	double v3;
	double div;

	public void calcular(){
		String [] eleccion = {"sumar", "restar", "multiplicar", "√2", "√3", "dividir"};
		String opcion;{

			opcion=(String)JOptionPane.showInputDialog(null, "Elige tu opción ", "Calculadora", JOptionPane.DEFAULT_OPTION, null, eleccion, "sumar");

			switch (opcion) {
			case "sumar":
				String sumaNum1=JOptionPane.showInputDialog("Introduce un número");
				String sumaNum2=JOptionPane.showInputDialog("Introduce el siguiente número");
				double suma1 = Double.parseDouble(sumaNum1);
				double suma2 = Double.parseDouble(sumaNum2);
				sumar (suma1, suma2);
				break;
			case "restar":
				String restaNum1=JOptionPane.showInputDialog("Introduce un número");
				String restaNum2=JOptionPane.showInputDialog("Introduce el siguiente número");
				double resta1 = Double.parseDouble(restaNum1);
				double resta2 = Double.parseDouble(restaNum2);
				resta(resta1,resta2);
				break;
			case "multiplicar":
				String porNum1=JOptionPane.showInputDialog("Introduce un número");
				String porNum2=JOptionPane.showInputDialog("Introduce el siguiente número");
				double por1 = Double.parseDouble(porNum1);
				double por2 = Double.parseDouble(porNum2);
				multiplicar(por1, por2);
				break;
			case "√2":
				String v2Num=JOptionPane.showInputDialog("Introduce un número");
				double numero2 = Double.parseDouble(v2Num);
				raizCuadrada(numero2);
				break;
			case "√3":
				String v3Num=JOptionPane.showInputDialog("Introduce un número");
				double numero3 = Double.parseDouble(v3Num);
				raizCubica(numero3);
				break;
			case "dividir":
				String divNum1=JOptionPane.showInputDialog("Introduce un número");
				String divNum2=JOptionPane.showInputDialog("Introduce el siguiente número");
				double div1 = Double.parseDouble(divNum1);
				double div2 = Double.parseDouble(divNum2);
				division(div1,div2);
			default:
				break;
			}		
		}
	}

	public double sumar (double num1, double num2) {
		suma = num1 + num2;
		System.out.println(suma);		
		return suma;

	}
	public double resta (double num1, double num2) {
		resta = num1 - num2;
		System.out.println(resta);		
		return resta;
	}
	public double multiplicar (double num1, double num2) {
		por = num1 * num2;
		System.out.println(por);		
		return por;
	}
	public double raizCuadrada (double num1) {
		v2 = Math.sqrt(num1);
		System.out.println(v2);		
		return v2;
	}
	public double raizCubica (double num1) {
		v3 = Math.cbrt(num1);
		System.out.println(v3);		
		return v3;
	}
	public double division (double num1, double num2) {
		try {div = num1/num2;
			if(num2==0) {
			throw new ArithmeticException();}
		}catch (ArithmeticException e) {
				System.out.println(e.getMessage()+" No se puede dividir por cero");
		}
			System.out.println(div);
			return div;

	}
}
