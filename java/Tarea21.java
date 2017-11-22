/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: En un arreglo unidimensional de tipo real se tienen almacenadas las toneladas
mensuales de cereales cosechadas durante el año anterior en una estancia de la 
pampa Argentina. Escribe un programa que calcule e imprima lo siguiente:
a)El promedio anual de toneladas cosechadas
b)Cuantos meses tuvieron una cosecha superior al promedio anual?
c)En que mes se produjo el mayor numero de toneladas? Cuantas fueron?
*/
import javax.swing.JOptionPane;
public class Tarea21{
	public static void main(String[] args) {
		int i,n=12, idMax=0,coseSup=0;
		float promedio=0,max=0;
		String entrada,cartel="";
		float[] cereales = new float [n];
		for(i=0;i<n;i++){
			entrada = JOptionPane.showInputDialog("Introduzca la cosecha del mes #"+(i+1));
			cereales[i] = Float.parseFloat(entrada);
			promedio = promedio + cereales[i];
		}
		promedio = promedio/n;
		for (i=0;i<n;i++) {
			cartel = cartel + "mes #" + (i+1) + ": " + cereales[i]+" toneladas\n";
			if (cereales[i]>promedio) {
				coseSup++;
				if(cereales[i]>max){
					max = cereales[i];
					idMax=i;
				}
			}
		}
		JOptionPane.showMessageDialog(null,cartel);
		JOptionPane.showMessageDialog(null,"El promedio anual fue de "+promedio+" toneladas");
		JOptionPane.showMessageDialog(null,"El promedio mensual se supero en "+coseSup+" veces");
		JOptionPane.showMessageDialog(null,"En el mes #"+(idMax+1)+" se produjo la mayor cosecha, la cual fue de "+cereales[idMax]+" toneladas");
	}//Fin del metodo main
}//Fin de la clase