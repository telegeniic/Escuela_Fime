/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Convertir de grados Centigrados a Farenheit y viceverza
*/
import javax.swing.JOptionPane;
public class Tarea9{
	public static void main(String[] args) {
		String[] options={"Cancelar", "C->F","F->C"};
		String entrada;
		int f,c;
		double c_convertido,f_convertido;
		int v;
		v=JOptionPane.showOptionDialog(null,"Seleccione la opcion a convertir", "Figuras", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		switch(v)
		{\
			case 1:
			{
				entrada = JOptionPane.showInputDialog("Cuantos grados centigrados vas a convertir?");
				c=Integer.parseInt(entrada);
				f_convertido=c*1.8f+32;
				JOptionPane.showMessageDialog(null,"La temperatura es de: "+f_convertido+"Graddos Farenheit");
				break;
			}
			case 2:
			{
				entrada = JOptionPane.showInputDialog("Cuantos grados Farenheit vas a convertir?");
				f=Integer.parseInt(entrada);
				c_convertido=(f-32*1.0f)/1.8;
				JOptionPane.showMessageDialog(null,"La temperatura es de: "+c_convertido+"Graddos Centigrados");
				break;

			}
			default:
			{
				JOptionPane.showMessageDialog(null,"Opcion invalida");
			}
		}
	}//Fin del metodo main
}//Fin de la clase