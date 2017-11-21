/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Escribe un programa que almacene en un arreglo uniimensional
los primeros 100 numeros de fibonacci e imprima el arreglo correspondiendte
*/
import javax.swing.JOptionPane;
public class Tarea19{
	public static void main(String[] args) {
		int i,n;
		int[] arreglo;
		arreglo = new int[100];
		String entrada,cartel="los primeros 100 numeros fibonacci son:\n";
		arreglo[0]=0;
		arreglo[1]=1;
		for(i=2;i<100;i++)
		{
			arreglo[i]=arreglo[i-1]+arreglo[i-2];
		}
		for(i=0;i<100;i++)
		{
			cartel = cartel + arreglo[i] + " ";
			if(i%25==0)
			{
				cartel = cartel + "\n";
			}
		}
		JOptionPane.showMessageDialog(null,cartel);
	}//Fin del metodo main
}//Fin de la clase