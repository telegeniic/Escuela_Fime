/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Uso De Gui2 hue :v
*/
import javax.swing.JOptionPane;
public class UsoDeGUI2{
	public static void main(String[] args) {
		String[] options={"Terminar","1","2","3","4","5","6"};
		int v=JOptionPane.showOptionDialog(null,"Ingresa un numero entero del 1 al 5", "Numeros", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[3]);
		JOptionPane.showMessageDialog(null, "El Numero fue: "+v);
	}//Fin del metodo main
}//Fin de la clase