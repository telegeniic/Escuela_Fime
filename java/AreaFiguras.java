/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Hcaer un programa que calcule el area de diferentes figuras:
	Cuadrado
	Rectangular
	Triangulo
	Circulo
*/
import javax.swing.JOptionPane;
public class AreaFiguras{
	public static void main(String[] args) 
	{
		String[] options={"Terminar","Cuadrado","Rectangulo","Triangulo","Circulo"};
		String entrada;
		final double PI=3.1416;
		int i, n, v;
		double area, lado, altura;
		v=JOptionPane.showOptionDialog(null,"Seleccione la figura a medir", "Figuras", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		switch(v)
		{
			case 1:
			entrada = JOptionPane.showInputDialog("Introduce un lado del cuadrado");
			lado = Float.parseFloat(entrada);
			area = lado * lado;
			JOptionPane.showMessageDialog(null,"El area de tu cuadrado es: "+area);
			break;

			case 2:
			entrada=JOptionPane.showInputDialog("Introduce el alto del rectangulo");
			altura = Float.parseFloat(entrada);
			entrada = JOptionPane.showInputDialog("Introduce la base del rectangulo");
			lado = Float.parseFloat(entrada);
			area = altura*lado;
			JOptionPane.showMessageDialog(null,"El area del rectangulo es: "+area);
			break;

			case 3:
			entrada=JOptionPane.showInputDialog("Introduce la base del triangulo");
			lado=Float.parseFloat(entrada);
			entrada=JOptionPane.showInputDialog("Introduce la altura del triangulo");
			altura = Float.parseFloat(entrada);
			area = (lado*altura)/2;
			JOptionPane.showMessageDialog(null,"El area del triangulo es: "+area);
			break;

			case 4:
			entrada=JOptionPane.showInputDialog("Introduce el radio del circulo");
			lado = Float.parseFloat(entrada);
			area = PI * (lado*lado);
			JOptionPane.showMessageDialog(null,"El area del circulo es: "+area);
			break;

			default:
			JOptionPane.showMessageDialog(null, "Saliste del programa");


		}
	}//Fin del metodo main
}//Fin de la clase