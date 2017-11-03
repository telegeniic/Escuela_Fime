/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros nones
*/
import javax.swing.JOptionPane;
public class SerieULAM{
	public static void main(String[] args) {
		int i, n;
		String entrada,cartel="";
		entrada = JOptionPane.showInputDialog("Ingrese un numero entero");
		n = Integer.parseInt(entrada);
		cartel = cartel + n+" ";
		while(n!=1){
			if(n%2==0)
			{
				n=n/2;
			}
			else
			{
				n=n*3+1;
			}
			cartel = cartel + n+" ";
		}
		JOptionPane.showMessageDialog(null,"La serie quedo: "+cartel);

	}//Fin del metodo main
}//Fin de la clase