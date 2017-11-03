/*
Jesus Martin Guajardo Olivo
1838264 N2
Descripcion: Programa que calcula el perimetro de un cuadrado
*/
import javax.swing.JOptionPane;
public class Cuadrado{
	public static void main(String[] args){
		String entrada;
		int x,p;
		entrada = JOptionPane.showInputDialog("Ingrese la longitud del lado");
		x = Integer.parseInt(entrada);
		p = 4*x;
		JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: "+p);
	}//FIN MAIN
}//