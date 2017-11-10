/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros nones
*/
import javax.swing.JOptionPane;
public class Tarea24{
	public static void main(String[] args) {
		int i,j,n,m,p,q,error;
		String entrada,letrero="";
		int[][] arreglo1,arreglo2,multiplicacion;
		do{
			entrada = JOptionPane.showInputDialog("Introduce la cantidad de filas del primer arreglo");
			n = Integer.parseInt(entrada);
			entrada = JOptionPane.showInputDialog("Introduce la cantidad de columnas del primer arreglo");
			m = Integer.parseInt(entrada);
			if(n!=m)
			{
				error=1;
				JOptionPane.showMessageDialog(null,"La matriz debe ser cuadrada");
			}
			entrada = JOptionPane.showInputDialog("Introduce la cantidad de filas del segundo arreglo");
			p = Integer.parseInt(entrada);
			entrada = JOptionPane.showInputDialog("Introduce la cantidad de columnas del segundo arreglo");
			q = Integer.parseInt(entrada);
			if(p!=q)
			{
				error=1;
				JOptionPane.showMessageDialog(null,"La matriz debe ser cuadrada");
			}
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
		multiplicacion = new int [n][m];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				multiplicacion[i][j]=0;
			}
		}
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
		for (i=0;i<n;i++) {
			for (j=0;j<n;j++) {
				for (p=0;p<n;p++) {
					for(q=0;p<n;p++){
						multiplicacion[i][j]=multiplicacion[i][j]+(arreglo1[q][p]*arreglo2[q][p]);
					}
				}
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				letrero = letrero + multiplicacion[i][j] + " ";
			}
			letrero = letrero + "\n";
		}
		JOptionPane.showMessageDialog(null,letrero);
	}//Fin del metodo main
}//Fin de la clase
