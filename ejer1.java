package test;
import java.util.Scanner;

public class ejer1 {
public static void main(String[]ar) {

	Scanner teclado= new Scanner(System.in);
	float precio;
	int cantidad;
	float abonar;
	System.out.print("Ingrese precio de un articulo: ");
	precio=teclado.nextFloat();
	System.out.print("Ingrese cantidad de articulos: ");
	cantidad=teclado.nextInt();
	
	abonar=precio*cant;
	System.out.print("Debe abonar: "+abonar);
	}
}
