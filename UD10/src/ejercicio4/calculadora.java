package ejercicio4;

import javax.swing.JOptionPane;

public class calculadora {
	int num1;
	int num2;
	double suma;
	double resta;
	double por;
	double v2;
	double v3;
	double div;

	
	String [] eleccion = {"sumar", "restar", "multiplicar", " √2", "√3", "dividir"};
	String opcion;{

	opcion=(String)JOptionPane.showInputDialog(null, "Elige tu opción ", "Calculadora", JOptionPane.DEFAULT_OPTION, null, eleccion, "sumar");

	switch (opcion) {
	case "sumar":
		String sumaNum1=JOptionPane.showInputDialog("Introduce un número");
		String sumaNum2=JOptionPane.showInputDialog("Introduce el siguiente número");
		double suma1 = Double.parseDouble(sumaNum1);
		double suma2 = Double.parseDouble(sumaNum2);

		System.out.println(suma);		
	break;
	case "restar":
		String restaNum1=JOptionPane.showInputDialog("Introduce un número");
		String restaNum2=JOptionPane.showInputDialog("Introduce el siguiente número");
		double resta1 = Double.parseDouble(restaNum1);
		double resta2 = Double.parseDouble(restaNum2);

		System.out.println(resta);		
		break;
	case "multiplicar":
		String porNum1=JOptionPane.showInputDialog("Introduce un número");
		String porNum2=JOptionPane.showInputDialog("Introduce el siguiente número");
		double por1 = Double.parseDouble(porNum1);
		double por2 = Double.parseDouble(porNum2);

		System.out.println(por);		
		break;
	case "√2":
		String v2Num=JOptionPane.showInputDialog("Introduce un número");
		double numero2 = Double.parseDouble(v2Num);

		System.out.println(v2);		
	case "√3":
		String v3Num=JOptionPane.showInputDialog("Introduce un número");
		double numero3 = Double.parseDouble(v3Num);

		System.out.println(v3);		
	case "dividir":
		String divNum1=JOptionPane.showInputDialog("Introduce un número");
		String divNum2=JOptionPane.showInputDialog("Introduce el siguiente número");
		double div1 = Double.parseDouble(divNum1);
		double div2 = Double.parseDouble(divNum2);

		System.out.println(div);		
	default:
		break;
	}		

}

public calculadora

	
	
	
	
	
	
public calculadora(double num1, double num2) {

	try { 

		suma = num1 + num2;
		resta = num1 - num2;
		por = num1 * num2;
		v2 = Math.sqrt(num1);
		v3 = Math.cbrt(num1);
		div = num1/num2;

	} catch (ArithmeticException e) {
		if(num1==0) {
			System.out.println(e.getMessage()+" No se puede dividir por cero");
			System.out.println("El resultado de la suma: "+suma+"\n" + "El resultado de la resta: " +resta+"\n" + "El resultado de la multiplicación: "+por+"\n" +"El resultado de la raíz cuadrada: "+v2+"\n" +"El resultado de la raíz cúbica: "+ v3+"\n");		
		}
	}
}

@Override
public String toString() {
	return "calculadora [num1=" + num1 + ", suma=" + suma + ", resta=" + resta + ", por=" + por + ", v2=" + v2 + ", v3="
			+ v3 + ", div=" + div + "]";
}
}
