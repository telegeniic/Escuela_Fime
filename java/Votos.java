/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: Generar numeros nones
*/
import javax.swing.JOptionPane;
public class Votos{
	public static void main(String[] args) {
		int i,vt=0,c1=0,c2=0,c3=0,c4=0,c5=0;
		float pc1=0,pc2=0,pc3=0,pc4=0,pc5=0;
		String entrada, letrero="";
		do{
			entrada = JOptionPane.showInputDialog("Ingrese el numero del candidato del voto (0 para salir)");
			i = Integer.parseInt(entrada);
			switch(i)
			{
				case 1:
				c1++;
				vt++;
				break;
				case 2:
				c2++;
				vt++;
				break;
				case 3:
				c3++;
				vt++;
				break;
				case 4:
				c4++;
				vt++;
				break;
				case 5:
				c5++;
				vt++;
				break;
				default:
				if(i>0)
				{
					JOptionPane.showMessageDialog(null,"Opcion no valida");
				}

			}
			

		}while (i!=0);
		pc1 = (c1*1.0f/vt)*100;
		pc2 = (c2*1.0f/vt)*100;
		pc3 = (c3*1.0f/vt)*100;
		pc4 = (c4*1.0f/vt)*100;
		pc5 = (c5*1.0f/vt)*100;
		letrero = letrero + "Votos totales: "+vt+"\n";
		letrero = letrero + "El primer candidato consiguio: "+c1+" votos con un promedio de: "+pc1+"%"+"\n";
		letrero = letrero + "El segundo candidato consiguio: "+c2+" votos con un promedio de: "+pc2+"%"+"\n";
		letrero = letrero + "El tercer candidato consiguio: "+c3+" votos con un promedio de: "+pc3+"%"+"\n";
		letrero = letrero + "El cuarto candidato consiguio: "+c4+" votos con un promedio de: "+pc4+"%"+"\n";
		letrero = letrero + "El quinto candidato consiguio: "+c5+" votos con un promedio de: "+pc5+"%"+"\n";
		JOptionPane.showMessageDialog(null,letrero);
	}//Fin del metodo main
}//Fin de la clase