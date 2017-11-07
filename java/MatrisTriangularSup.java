/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Contruya un programa que determine si una matriz dada es de tipo
triangular
*/
import javax.swing.JOptionPane;
public class MatrisTriangularSup{
	public static void main(String[] args) {
		String entrada,letrero="";
		int i,j,n,m,MA;
		int[][] a;
		do {
			entrada = JOptionPane.showInputDialog("Cuantas filas tendra el arreglo?");
			n = Integer.parseInt(entrada);
			entrada = JOptionPane.showInputDialog("Cuantas columnas tendra el arreglo?");
			m = Integer.parseInt(entrada);
			a = new int[n][m];//N es de filas, M es de columnas	(primero filas luego columnas)
			if(n!=m){
				error =1;
				JOptionPane.showMessageDialog("Tiene que ser una matriz cuadrada (Filas y columnas iguales)");
			}
			else
			{
				error = 0;
			}
		} while (error==1);

		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				entrada = JOptionPane.showInputDialog("Ingrese la posicion "+(i+1)+","+(j+1));
				a[i][j]=Integer.parseInt(entrada);
			}
		}
		MA = 0
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if(i>j)
				{
					if (a[i][j]!=0) {
						MA = 1;
					}
				}
			}
		}
		if(MA==0){
			JOptionPane.showMessageDialog(null,"La matriz si es triangular");
		}
		else {
			JOptionPane.showMessageDialog(null,"La matriz no es triangular");
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
