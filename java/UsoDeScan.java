/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Usar el Scanner
*/
import java.util.Scanner;
public class UsoDeScan{
	public static void main(String[] args) {
		Scanner lec = new Scanner(System.in);
		String nombre;
		System.out.print("ingresa tu nombre ");
		nombre = lec.nextLine();
		System.out.println("Hola, "+nombre);
		String nom2;
		System.out.print("Ingresa tu nombre ");
		nom2 = lec.next();
		System.out.print("Hola, "+nom2);
	}//Fin del metodo main
}//Fin de la clase