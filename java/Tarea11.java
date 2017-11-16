/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros nones
*/
import javax.swing.JOptionPane;
public class Tarea11{
	public static void main(String[] args) {
		int i,l,n,exp=1,valor;
		String entrada,cartel="La serie es: ";
		entrada=JOptionPane.showInputDialog("Introduce la cantidad de numeros de la serie");
		n = Integer.parseInt(entrada);
		for(i=1;i<n+1;i++)
		{
			valor = i;
			//System.out.println(valor);
			for (l=1;l<exp;l++)
			{
				valor = valor*i;
				//System.out.println(valor);
			}
			cartel = cartel + valor + ", ";
			exp = exp + 2;
		}
		JOptionPane.showMessageDialog(null,cartel);

	}//Fin del metodo main
}//Fin de la clase