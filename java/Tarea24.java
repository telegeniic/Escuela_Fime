/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros nones
*/
import javax.swing.JOptionPane;
public class Tarea24{
	public static void main(String[] args) {
		int i,j,n,l,m,p,q,error,suma=0;
		String entrada,letrero="";
		int[][] arreglo1,arreglo2,multiplicacion;
		do{
			entrada = JOptionPane.showInputDialog("Introduce la cantidad de filas del primer arreglo");
			q = Integer.parseInt(entrada);
			entrada = JOptionPane.showInputDialog("Introduce la cantidad de columnas del primer arreglo");
			p = Integer.parseInt(entrada);
			entrada = JOptionPane.showInputDialog("Introduce la cantidad de filas del segundo arreglo");
			n = Integer.parseInt(entrada);
			entrada = JOptionPane.showInputDialog("Introduce la cantidad de columnas del segundo arreglo");
			m = Integer.parseInt(entrada);
			if(n==p)
			{
				error = 0;
			}
			else
			{
				error =1;
				JOptionPane.showMessageDialog(null,"Las columnas del primero tiene que ser igual a las filas del segundo");
			}
		}while(error==1);
		arreglo1 = new int[q][p];
		arreglo2 = new int[n][m];
		multiplicacion = new int [q][m];
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
				do{
					entrada = JOptionPane.showInputDialog("Ingrese la posicion "+(i+1)+","+(j+1)+" del primer arreglo");
					if(entrada==""){
						JOptionPane.showMessageDialog(null,"No puede estar vacio el campo");
					}
				}while(entrada=="");
				
				arreglo1[i][j]=Integer.parseInt(entrada);
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				do{
					entrada = JOptionPane.showInputDialog("Ingrese la posicion "+(i+1)+","+(j+1)+" del segundo arreglo");
					if(entrada==""){
						JOptionPane.showMessageDialog(null,"No puede estar vacio el campo");
					}
				}while(entrada=="");
				arreglo2[i][j]=Integer.parseInt(entrada);
			}
		}
		if(q>m){
			for (l=0;l<q;l++) {
				for(j=0;j<m;j++){
					for(i=0;i<n;i++){
						suma = suma + (arreglo1[l][i]*arreglo2[i][j]);
					}
					multiplicacion[l][j] = suma;
					suma = 0;
				}
			}
		}
		else{
			for (l=0;l<m;l++) {
				for(j=0;j<q;j++){
					for(i=0;i<n;i++){
						suma = suma + (arreglo1[j][i]*arreglo2[i][l]);
					}
					multiplicacion[j][l] = suma;
					suma = 0;
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