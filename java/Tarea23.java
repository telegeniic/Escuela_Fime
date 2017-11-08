/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros nones
*/
import javax.swing.JOptionPane;
public class Tarea23{
	public static void main(String[] args) {
		int i,j,n,m,p,q,error;
		String entrada,letrero="La suma de los arreglos fue: \n";
		int[][] arreglo1,arreglo2,suma;
		do{
			entrada = JOptionPane.showInputDialog("Introduce la cantidad de filas del primer arreglo");
			n = Integer.parseInt(entrada);
			entrada = JOptionPane.showInputDialog("Introduce la cantidad de columnas del primer arreglo");
			m = Integer.parseInt(entrada);
			entrada = JOptionPane.showInputDialog("Introduce la cantidad de filas del segundo arreglo");
			p = Integer.parseInt(entrada);
			entrada = JOptionPane.showInputDialog("Introduce la cantidad de columnas del segundo arreglo");
			q = Integer.parseInt(entrada);
			if(n==p&&m==q)
			{
				error = 0;
			}
			else
			{
				error =1;
				JOptionPane.showMessageDialog(null,"Los 2 arreglos deben tener las mismas dimensiones");
			}
		}while(error==1);
		arreglo1 = new int[n][m];
		arreglo2 = new int[p][q];
		suma = new int [n][m];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				entrada = JOptionPane.showInputDialog("Ingrese la posicion "+(i+1)+","+(j+1)+" del primer arreglo");
				arreglo1[i][j]=Integer.parseInt(entrada);
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				entrada = JOptionPane.showInputDialog("Ingrese la posicion "+(i+1)+","+(j+1)+" del segundo arreglo");
				arreglo2[i][j]=Integer.parseInt(entrada);
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				suma[i][j]=arreglo1[i][j]+arreglo2[i][j];
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				letrero = letrero + suma[i][j] + " ";
			}
			letrero = letrero + "\n";
		}
		JOptionPane.showMessageDialog(null,letrero);
	}//Fin del metodo main
}//Fin de la clase
