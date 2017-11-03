/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Suma factorial de los numeros naturales
*/
import javax.swing.JOptionPane;
public class Factorial{
	public static void main(String[] args) {
		String entrada, numeros="Los numeros son: ";
		int n,i,l=0;//l es una variable acumuladora
		entrada = JOptionPane.showInputDialog("Ingrese un numero entero");
		n = Integer.parseInt(entrada);
		for (i=1;i<n+1;i++) 
		{
			l=l+i ;	//aqui se utiliza "l"
		}
		JOptionPane.showMessageDialog(null, "La suma es: "+l);
	}//Fin del metodo main
}//Fin de la clase