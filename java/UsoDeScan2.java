/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Usar el Scanner con numeros
*/
import java.util.Scanner;
public class UsoDeScan2{
	public static void main(String[] args) {
		Scanner lec = new Scanner(System.in);
		int x;
		float y;
		double z;
		byte w;
		System.out.print("Ingresa el numero entero ");
		x = lec.nextInt();
		System.out.println("X = " +x);
		System.out.print("Ingresa el numero float ");
		y = lec.nextFloat();
		System.out.println("Y = "+y);
		System.out.print("Ingresa el numero double ");
		z = lec.nextDouble();
		System.out.println("Z = "+z);
		System.out.print("Ingresa el numero byte ");
		w = lec.nextByte();
		System.out.print("W = "+w);
		double pesos = 8.9856;
		float cantidad = 3.45f;
		System.out.print(cantidad);
	}//Fin del metodo main
}//Fin de la clase