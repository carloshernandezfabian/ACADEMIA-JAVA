package CursoJava;

import java.util.Scanner;

public class EstructuraSwitch {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int opc = 0;

		System.out.println("Ingresa un numero ");
		opc = entrada.nextInt();
		
		

		switch (opc) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miercoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println(opc + " no es un numero valido");
			break;

		}
	}
}
