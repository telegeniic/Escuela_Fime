/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Uso de interfaz grafica para el usuario (GUI)
*/
import javax.swing.JOptionPane;
public class UsoDeGUI{
	public static void main(String[] args) {
		String entrada;
		String nombre;
		entrada = JOptionPane.showInputDialog("Ingresa Tu Nombre: ");
		nombre = entrada;
		JOptionPane.showMessageDialog(null, "Hola, "+nombre);
		int n;
		entrada = JOptionPane.showInputDialog("Ingresa un numero entero");
		n = Integer.parseInt(entrada);
		JOptionPane.showMessageDialog(null, "El numero fue: "+n);
	}//Fin del metodo main
}//Fin de la clase