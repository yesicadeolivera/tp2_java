package ejer5;
import java.util.Scanner;

public class ejer5 {
	public static void main(String[]ar) {
	Scanner teclado= new Scanner(System.in);
	
	int num=0;
	int res=0;
	
	
	
	while(num!=9999)
	{
		System.out.print("Ingrese un numero: ");
		num=teclado.nextInt();
		
	if(num!=9999)
	{
		res=res+num;
		
	}else{
		System.out.print(res);	
		  }
	}
	
}
}
