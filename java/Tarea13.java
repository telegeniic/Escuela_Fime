/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros nones
*/
import javax.swing.JOptionPane;
public class Tarea13{
	public static void main(String[] args) {
		int i,l=2,n,op=1,par_max=1,j=-3;
		int cont_non=1,cont_par=1;
		String entrada, cartel="La serie es: ";
		entrada = JOptionPane.showInputDialog("Ingrese la cantidad de numeros de la serie a mostrar");
		n = Integer.parseInt(entrada);
		for(i=0;i<n;i++)
		{
			if(cont_non>3)
			{
				op=1;
				cont_non = 1;
			}
			if(cont_par>par_max)
			{
				op=2;
				cont_par=1;
				par_max++;
			}
			if(op==1)
			{
				cartel = cartel + l+", ";
				l=l+2;
				cont_par++;
			}
			else
			{
				cartel = cartel + j+", ";
				j=j-2;
				cont_non++;
			}
			
			

		}
		JOptionPane.showMessageDialog(null,cartel);

	}//Fin del metodo main
}//Fin de la clase