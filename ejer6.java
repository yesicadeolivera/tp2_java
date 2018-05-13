package ejer6;
import java.util.Scanner;

public class ejer6 {
				
		private Scanner teclado;
		private String nombre;
	    private int sueldo;
										
	    public void inicializar() {
	 	   teclado= new Scanner(System.in);
	 	   System.out.print("Ingrese su nombre:");
	 	   nombre=teclado.next();
	 	   System.out.print("Ingrese su sueldo: ");
	 	   sueldo=teclado.nextInt();
								}
	    public void imprimir() {
	    	System.out.println("Su nombre:" +nombre);
	    	System.out.println("Su sueldo: "+sueldo);
		
							}
	
	    public void impuestos() {
	    	
	    	if(sueldo>=3000)
	    	{
	    	System.out.println("Debe paga impuestos.");
	    	}
	    }
	    
	    public static void main (String[]ar) {
	    	ejer6 ejer;
	    	ejer=new ejer6();
	    	ejer.inicializar();
	    	ejer.imprimir();
	    	ejer.impuestos();
	    	
	    }
	
			
}