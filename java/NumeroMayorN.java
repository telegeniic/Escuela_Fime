/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Construye un programa en java que identifique el numero mayor al recibir N cantidad de numeros
*/
import javax.swing.JOptionPane;
public class NumeroMayorN{
	public static void main(String[] args) {
		int n, i, num_mayor=0, pos_mayor=0, l, error=0,v;//l es una variable temporal
		String entrada;
		String[] options={"salir","seguir"}; 
		do{
			entrada = JOptionPane.showInputDialog("Cuantos numeros va a comparar?");
			n = Integer.parseInt(entrada);
			if(n>1)
			{
				error=0;
				for(i=1;i<n+1;i++)
				{
					entrada= JOptionPane.showInputDialog("Introduzca el numero a comparar");
					l=Integer.parseInt(entrada);
					if(l>num_mayor)
					{
						num_mayor = l;//num_mayor almacena el numero mas grande hasta el momento
						pos_mayor = i;//pos_mayor almacena la posicion cuando se introdujo el numero mas grande
					}
				}//Fin del if
				JOptionPane.showMessageDialog(null, "El numero mayor es: "+num_mayor+"\nLa posicion del numero mayor es: "+pos_mayor);
				v=JOptionPane.showOptionDialog(null,"Desea continuar?", "Numeros", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				if(v==1)
				{
					error=1;
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Opcion no valido, introduzca un numero mayor a 0");
				error=1;
			}
		}while(error==1);
	}//Fin del metodo main
}//Fin de la clase