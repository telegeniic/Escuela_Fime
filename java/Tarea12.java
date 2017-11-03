/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros nones
*/
import javax.swing.JOptionPane;
public class Tarea12{
	public static void main(String[] args) {
		int i,n,l,veces=3;
		String entrada,cartel="Los numeros quedaron: ";
		entrada = JOptionPane.showInputDialog("Ingrese los numeros a mostrar");
		n=Integer.parseInt(entrada);
		for(i=1;i<n+1;i++)
		{
			if(i%2==0)
			{
				for(l=1;l<veces;l++)
				{
					cartel = cartel+i+" ";
					
				}
				veces++;
			}
			else
			{
				cartel=cartel+(i*-1)+" ";
				
			}
		}
		JOptionPane.showMessageDialog(null,cartel);
	}//Fin del metodo main
}//Fin de la clase