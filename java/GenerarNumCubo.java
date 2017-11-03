/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros nones
*/
import javax.swing.JOptionPane;
public class GenerarNumCubo{
	public static void main(String[] args) {
		String entrada, numeros="La serie quedo:";
		int i,n,valor;
		entrada = JOptionPane.showInputDialog("Cuantos numeros quiere mostrar de la serie?");
		n = Integer.parseInt(entrada);
		for(i=1;i<n+1;i++)
		{
			valor = i*i*i;
			numeros = numeros+" "+valor;
		}
		JOptionPane.showMessageDialog(null, numeros);
	}//Fin del metodo main
}//Fin de la clase