/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros con potencias dinamicas
*/
import javax.swing.JOptionPane;
public class NumPotencias{
	public static void main(String[] args) {
		String entrada, numeros="La serie quedo: ";
		int i, l, n ;
		double pot=1,valor;
		entrada = JOptionPane.showInputDialog("Introduzca la cantidad a numeros a mostrar");
		n = Integer.parseInt(entrada);
		for (i=1;i<n+1;i++)
		{
			valor = i;
			for(l=1;l<pot+1;l++)
			{
				valor=valor*valor;
			}
			pot=pot+2;
			numeros = numeros + valor+" ";
		}
		JOptionPane.showMessageDialog(null,numeros);
	}//Fin del metodo main
}//Fin de la clase