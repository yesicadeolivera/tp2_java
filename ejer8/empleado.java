package ejer8;
import java.util.Scanner;
public class empleado extends persona {
	
	private Scanner teclado;
	private int sueldo;
	
	public void cargar() {
		teclado= new Scanner(System.in);
		System.out.print("Ingrese su sueldo: ");
		sueldo=teclado.nextInt();
		
						 }
	public void imprimir() {
		
		System.out.print("Su sueldo es: "+sueldo);
						   }
	
	public static void main(String[]ar) {
		
		empleado empleado1;
		empleado1=new empleado();
		empleado1.cargar();
		empleado1.imprimir();
		
	} 
	
}
