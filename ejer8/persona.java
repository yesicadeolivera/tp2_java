package ejer8;
import java.util.Scanner;
public class persona {
	
	private Scanner teclado;
	private String nombre;
    private int edad;
    
    public void Responsabilidades() {
    	teclado= new Scanner(System.in);
    	System.out.println("Ingrese su nombre: ");
    	nombre=teclado.next();
    	
    	System.out.println("Ingrese su edad: ");
    	edad=teclado.nextInt();    		
    					}
    public void Imprimir() {
    	
    	System.out.println("Nombre:" +nombre);
    	System.out.println("Edad:"+edad);
    						}
    public static void main (String[]ar) {
    	persona persona2;
    	persona2= new persona();
    	persona2.Responsabilidades();
    	persona2.Imprimir();
    	
    	empleado persona3;
    	persona3=new empleado();
    	persona3.cargar();
    	persona3.imprimir();
    	
    	
    									} 
    
}


