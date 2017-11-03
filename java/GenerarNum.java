/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros nones
*/
import javax.swing.JOptionPane;
public class GenerarNum{
	public static void main(String[] args) {
		String entrada, numeros="";
		int i,n;
		entrada = JOptionPane.showInputDialog("Cuantos numeros quiere mostrar de la serie?");
		n = Integer.parseInt(entrada);
		for(i=1;i<(n*2)+1;i=i+2)
		{
			numeros=numeros+i+",";
		}
		JOptionPane.showMessageDialog(null,"La serie quedo: "+numeros);

	}//Fin del metodo main
}//Fin de la clase