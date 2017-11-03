/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Esqueleto
*/
import javax.swing.JOptionPane;
public class CicloFor{
	public static void main(String[] args) {
		String entrada, numeros="Los numeros son: ";
		int n,i;
		entrada = JOptionPane.showInputDialog("Ingrese un numero entero");
		n = Integer.parseInt(entrada);
		for (i=1;i<n;i++) 
		{
			numeros=numeros + i+"," ;	
		}
		numeros = numeros + i +".";
		JOptionPane.showMessageDialog(null, numeros);
	}//Fin del metodo main
}//Fin de la clase