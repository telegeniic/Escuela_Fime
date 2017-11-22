/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros nones
*/
import javax.swing.JOptionPane;
public class Tarea22{
	public static void main(String[] args) {
		int i,j,n,m,valor,veces=0;
		String entrada,letrero="";
		int[][] arreglo;
		entrada = JOptionPane.showInputDialog("Introduce la cantidad de filas del arreglo");
		n = Integer.parseInt(entrada);
		arreglo = new int[n];
		for (i=0;i<n;i++) {
				entrada = JOptionPane.showInputDialog("Introduce la posicion "+(i+1)+","+(j+1));
				arreglo[i] = Integer.parseInt(entrada);
		}
		entrada = JOptionPane.showInputDialog("Cual valor buscas en la matriz");
		valor = Integer.parseInt(entrada);
		for (i=0;i<n;i++) {
				if(arreglo[i]==valor){
					veces++;
			}
		}
		JOptionPane.showMessageDialog(null,"el valor "+valor+" se encontro "+veces+" veces");
		for(i=0;i<n;i++){
			letrero = letrero + arreglo[i] + " ";
		}
		JOptionPane.showMessageDialog(null,letrero);
	}//Fin del metodo main
}//Fin de la clase
