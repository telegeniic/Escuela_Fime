/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros positivos y negativos
*/
import javax.swing.JOptionPane;
public class ListaPosNeg{
	public static void main(String[] args) {
		int i, n;
		String entrada, numeros = "Los numeros son: ";
		entrada = JOptionPane.showInputDialog("Cuantos numeros de la serie va a mostrar?");
		n= Integer.parseInt(entrada);
		for(i=1;i<n+1;i++)
		{
			if(i%2==0)
			{
				numeros = numeros + i+" ";
			}
			else
			{
				numeros = numeros + "-"+i+" ";
			}
		}
		JOptionPane.showMessageDialog(null,numeros);

	}//Fin del metodo main
}//Fin de la clase