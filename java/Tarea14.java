/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros nones
*/
import javax.swing.JOptionPane;
public class Tarea14{
	public static void main(String[] args) {
		int i,n;
		float suma =1;
		String entrada,letrero="La serie quedo: 1";
		entrada = JOptionPane.showInputDialog("Introduzca la cantidad de numeros en la serie");
		n = Integer.parseInt(entrada);
		for(i=2;i<n+1;i++)
		{
			suma = suma + (1/(i*1.0f));
			letrero = letrero + " + 1/"+i;
		}
		letrero = letrero + " = "+suma;
		JOptionPane.showMessageDialog(null,letrero);

	}//Fin del metodo main
}//Fin de la clase
