/*
Jesus Martin Guajardo Olivo
1838264 N2
Descripcion: Programa que calcula si el numero es par o impar
*/
import javax.swing.JOptionPane;
public class ParImpar
{
	public static void main(String[] args)
	{
		String entrada;
		int x;
		entrada = JOptionPane.showInputDialog("Ingrese el numero a comparar");
		x = Integer.parseInt(entrada);
		if (x%2==0)
		{
			JOptionPane.showMessageDialog(null, "El numero "+x+" es par");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "El numero "+x+" es impar");
		}
	}//FIN MAIN
}//