package ejer3;
import java.util.Scanner;
public class ejer3 {
	public static void main(String[]ar) {
		Scanner teclado= new Scanner(System.in);
		int n=0;
		int num;
		int par=0;
		int impar=0;
		
		for(n=0; n<=10; n++)
		{
			System.out.print("Ingrese numero: ");
			num=teclado.nextInt();
			
			System.out.print(" num:" +num);
			System.out.print("\n");
		if(num%2==0)
			{
			par++;
		    System.out.print("Es par" );	
			}else{
			impar++;
			System.out.print("Es impar");
			}
		
		}
		System.out.print("Pares: "+par);
		System.out.print("Impar: "+impar);
	}
}	
