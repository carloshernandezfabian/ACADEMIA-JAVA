package CursoJava;

public class UpperLowerCase {
	public static void main(String[] args) {

		String a = "Adrian y Ana";
		String b = "adrian y ana";

		System.out.println("\n");
		System.out.println("Original: " + a);

		System.out.println("Mayusculas: " + a.toUpperCase());
		System.out.println("Minusculas: " + a.toLowerCase() + "\n");

		System.out.println("Original: " + a);
		System.out.println("Comparacion: " + b);
		System.out.println("\n");

		/*
		 * Compara cadenas de texto. Devolverá true si las cadenas comparadas son
		 * iguales. En caso contrario devolverá false.
		 * 
		 */

		if (a.equals(b)) {
			System.out.println(" equal() regresa TRUE ");
		} else {
			System.out.println("equal() regresa FALSE");
		}

		/*
		 * Compara la cadena de texto mayúsculas y minúsculas. Devolverá true si las
		 * cadenas comparadas son iguales. En caso contrario devolverá false.
		 */
		if (a.equalsIgnoreCase(b)) {
			System.out.println(" equalIgnoreCase () regresa TRUE ");
		} else {
			System.out.println(" equalIgnoreCase () regresa FALSE ");
		}
	}
}
