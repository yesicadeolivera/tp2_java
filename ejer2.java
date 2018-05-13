package test;
import java.util.Scanner;
public class ejer2 {
	public static void main(String[]ar) {
		Scanner teclado= new Scanner(System.in);
		int num;
		System.out.print("Ingrese numerillo: ");
		num=teclado.nextInt();
		
		if(num<10)
		{
			System.out.print("El numero tiene 1 cifra");
		
		}else if(num>=10 && num<100) {
			
			System.out.print("El numero tiene 2 cifras");
		}else {
			
			System.out.print("El numero tiene 3 o mas cifras :D");
		}
	}
	
}
