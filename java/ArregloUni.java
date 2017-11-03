/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Uso de Vectores Unidimensionales
*/
import javax.swing.JOptionPane;
public class ArregloUni{
	public static void main(String[] args) {
		String entrada,cartel="A = [ ";
		int i,n;
		int[] A;
		entrada = JOptionPane.showInputDialog("Ingrese el numero total de numeros en el arreglo");
		n = Integer.parseInt(entrada);
		A = new int[n];
		for(i=0;i<n;i++)
		{
			entrada = JOptionPane.showInputDialog("Ingrese el valor numero "+(i+1));
			A[i]=Integer.parseInt(entrada);
		}
		for(i=0;i<n;i++)
		{
			cartel = cartel + A[i]+" ";
		}
		cartel = cartel +"]";
		JOptionPane.showMessageDialog(null,cartel);
	}//Fin del metodo main
}//Fin de la clase