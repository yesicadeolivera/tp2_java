package test;
import java.util.Scanner;
public class ejer3 {
	public static void main(String[]ar) {
		Scanner teclado= new Scanner(System.in);
		int n=0;
		int num;
		
		for(n=0;n<=10;n++)
		{
			System.out.print("Ingrese numero: ");
			num=teclado.nextInt();
			
			System.out.print("num: " +num);
		}
	}
}	
