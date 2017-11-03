/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Suma factorial de los numeros naturales
*/
import javax.swing.JOptionPane;
public class UsoDeSwitch{
	public static void main(String[] args) {
		String entrada, numeros="Los numeros son: ";
		int n,i,l=0,opcion, error=0;//l es una variable acumuladora
		entrada = JOptionPane.showInputDialog("Ingrese un numero entero");
		n = Integer.parseInt(entrada);
		do{
		String letrero="";
		letrero = "Menu de opciones\n";
		letrero = letrero+"1.-Lista de numeros naturales\n";
		letrero = letrero+"2.-Suma de numeros naturales\n";
		entrada = JOptionPane.showInputDialog(letrero + "Selecciona una opcion: ");
		opcion = Integer.parseInt(entrada);
		switch(opcion)
		{
			case 1:
			
				for (i=1;i<n;i++) 
				{
					numeros=numeros + i+"," ;	
				}
				numeros = numeros + i +".";
				JOptionPane.showMessageDialog(null,numeros);
				error=0;
				break;//Fin caso 1
			
			case 2:
			
				for (i=1;i<n+1;i++) 
				{
					l=l+i ;	//aqui se utiliza "l"
				}
				JOptionPane.showMessageDialog(null,"La suma es: "+l);
				error=0;
				break;//Fin caso 2

			default:
			
				JOptionPane.showMessageDialog(null,"Opcion no valida");
				error=1;
				//Fin default
		}//Fin switch
		}while(error==1);
	}//Fin del metodo main
}//Fin de la clase