/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Convertir monedas
*/
import javax.swing.JOptionPane;
public class ConvertirMonedas{
	public static void main(String[] args) {
		String[] options={"Terminar","Dolar","Euro","Yen","Dlr HK"};
		String entrada,mesaje,moneda="",texto;
		int pesos, i;
		double convertido=0;
		entrada = JOptionPane.showInputDialog("Ingrese cuantos pesos desea cambiar");
		pesos = Integer.parseInt(entrada);
		texto = "Ingrese la moneda a la cual desea convertir sus pesos";
		i = JOptionPane.showOptionDialog(null,texto, "Monedas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		switch(i)
		{
			case 1:
			convertido = pesos*1.0f/18;
			moneda = " Dolares";
			break;
			case 2:
			convertido = pesos*1.0f/22.22;
			moneda = " Euros";
			break;
			case 3:
			convertido = pesos*1.0f*5.94;
			moneda=" Yens";
			break;
			case 4:
			convertido = pesos*1.0f/2.44;
			moneda = " Dolares de Honk Kong";
			break;
			default:
			JOptionPane.showMessageDialog(null,"El programa ha finalizado");
		}
		JOptionPane.showMessageDialog(null,"Usted Cuenta con: "+convertido + moneda);
	}//Fin del metodo main
}//Fin de la clase