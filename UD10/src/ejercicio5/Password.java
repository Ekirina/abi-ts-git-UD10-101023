package ejercicio5;

public class Password {
	protected int longitud;
	private String contraseña;
	
	protected final int LONGITUD = 8;
	protected final String CONTRASEÑA = "";
	
	public Password(){
		this.longitud = LONGITUD;
		this.contraseña = CONTRASEÑA;
	}
	
	public Password (int num) {
		this.longitud = (num);
		this.contraseña= "";
		generarPassword(num);
		}
	
	public void generarPassword(int num) {		
	String opciones = "abcdefghijklmnopqrstuvwyxz0123456789ABCDEFGHIJKLMNOPQRSTUVWYXZ0123456789";
	for(int i = 0; i<num; i++) {
        int contraseña = (int)(Math.random()*opciones.length()-1);
        char opcionesRandom = opciones.charAt(contraseña);
        this.contraseña += opcionesRandom;
  
		}
	}
	public boolean esFuerte() {
		int contMinus = 0;
		int contMayus = 0;
		int contDigit = 0;
	
		for (int i = 0; i < contraseña.length(); i++) {
			boolean minus = Character.isLowerCase(contraseña.charAt(i));
			if(minus) {
			contMinus++;
			}
			boolean mayus = Character.isUpperCase(contraseña.charAt(i));
			if (mayus) {
			contMayus++;
			}
			boolean digit = Character.isDigit(contraseña.charAt(i));
			if (digit) {
			contDigit++;
			}
		}
		
		return (contMinus>1 && contMayus>2 && contDigit>5);

}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}
}	
