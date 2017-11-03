/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264 
Hora: N2
Descripcion: Programa que calcula si el numero es mayor a cero
*/
import javax.swing.JOptionPane;
public class PosNeg
{
	public static void main(String[] args)
	{
		String entrada;
		int x;
		entrada = JOptionPane.showInputDialog("Ingrese el numero a comparar");
		x = Integer.parseInt(entrada);
		if (x==0)
		{
			JOptionPane.showMessageDialog(null, "El numero "+x+" es cero");
		}
		else if(x>0)
			{
				JOptionPane.showMessageDialog(null, "El numero "+x+" es Positivo");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "El numero "+x+" es negativo");
			}
	}//FIN MAIN
}//FIN CLASS