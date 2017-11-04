/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros nones
*/
import javax.swing.JOptionPane;
public class Matrices2{
	public static void main(String[] args) {
		String entrada,Letrero="";
		int i,j,n,m;
		int[][] A;
		entrada = JOptionPane.showInputDialog("Cuantas filas tendra el arreglo?");
		n = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Cuantas columnas tendra el arreglo?");
		m = Integer.parseInt(entrada);
		a = new int[n][m]//N es de filas, M es de columnas	(primero filas luego columnas)
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				entrada = JOptionPane.showInputDialog("Ingrese la posicion "+(i+1)+","+(j+1));
				a[i][j]=Integer.parseInt(entrada);
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				letrero = letrero + a[i][j] + " ";

			}
			letrero = letrero + "\n";
		}
		JOptionPane.showMessageDialog(null,letrero);

	}//Fin del metodo main
}//Fin de la clase