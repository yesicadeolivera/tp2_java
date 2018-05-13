package ejer7;
import java.util.Scanner;

public class ejer7 {
	private Scanner teclado;
	private int num;
	private int num2;
	private int suma;
	private int resta;
	private int multi;
	private int div;
	
	public void cargar() {
		teclado= new Scanner(System.in);
		System.out.println("Ingrese numero: ");
		num=teclado.nextInt();
	
		System.out.println("Ingrese segundo numero: ");
		num2=teclado.nextInt();
		
		}
	
	public void suma() {
		
		suma=num+num2;
		System.out.println("Suma: "+suma);
		System.out.println("\n");

						}
	
	public void resta() {
		
		resta=num-num2;
		System.out.print("Resta: "+resta);
		System.out.println("\n");
					}
	public void multi() {
			
		multi=num*num2;
		System.out.print("Multiplicacion: "+multi);
		System.out.println("\n");

						}
	
	public void division() {
		
		div=num/num2;
		System.out.println("Division: "+div);
		
							}
		
	 public static void main (String[]ar) {
	    	ejer7 ejer;
	    	ejer=new ejer7();
	    	ejer.cargar();
	    	ejer.suma();
	    	ejer.resta();
	    	ejer.multi();
	    	ejer.division();
	    
	 	}
}