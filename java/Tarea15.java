/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Construte un diagrama de flujo y el correspondiente programa que calcule
e imprima la productoria de los n primeros numeros naturales
*/
import javax.swing.JOptionPane;
public class Tarea15{
	public static void main(String[] args) {
		int i,n;
		float  factorial;
		String entrada,cartel="";
		entrada = JOptionPane.showInputDialog("Introduce hasta que numero quieres el factorial");
		n = Integer.parseInt(entrada);
		factorial = (n*(n+1*1.0f))/2;
		JOptionPane.showMessageDialog(null,"El factorial del numero "+n+" Es "+factorial);
	}//Fin del metodo main
}//Fin de la clase