/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Escribe un programa, que al dar como dato un arreglo unidimensional
de numeros enteros, determine cuantos de ellso son positivos, cuantos negativos y
cuantos nulos 
*/
import javax.swing.JOptionPane;
public class Tarea18{
	public static void main(String[] args) {
		int i,n,cont_pos=0,cont_neg=0,cont_cero=0;
		String entrada,letrero=" ";
		int[] arreglo;
		entrada = JOptionPane.showInputDialog("Introduzca la cantidad de filas");
		n = Integer.parseInt(entrada);
		arreglo = new int[n];
		for (i=0;i<n;i++){
			entrada = JOptionPane.showInputDialog("Introduzca el valor de la posicion "+(i+1));
			arreglo[i] = Integer.parseInt(entrada);
		}
		for (i=0;i<n;i++) {
			if (arreglo[i] == 0) {
				cont_cero++;
			}
			if (arreglo[i]>0) {
				cont_pos++;
			}
			if (arreglo[i]<0) {
				cont_neg++;
			}
			letrero = letrero + arreglo[i]+" ";
		}
		JOptionPane.showMessageDialog(null,"La serie quedo asi: "+letrero);
		JOptionPane.showMessageDialog(null,"en el arreglo se encontraron "+cont_pos+" numeros positivos "
			+cont_neg+" numeros negativos "+cont_cero+" nulos");
	}//Fin del metodo main
}//Fin de la clase