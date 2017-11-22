/*
Nombre: Jesus Martin Guajardo Olivo
Matricula: 1838264
Hora: N2
Descripcion: En un arreglo unidimensional de ripo real se almacenan las calificaciones de un grupo
n de alumnos que presentaron un examen de admision a una universidad. Escribe un programa que calcule e imprima lo siguiente
a) El promedio general del grupo
b) El porcentaje de alumnos aprobados (todos aquellos alumnos cuyo puntaje supere los 1300 puntos)
c) El numero de alumnos cuya calificacion sea mayor o igual a 1500
*/
import javax.swing.JOptionPane;
public class Tarea20{
	public static void main(String[] args) {
		int i,n,sumaExc=0;
		float sumaProm=0,sumaPromApro=0,promedio=0,promApro=0;
		float[] alumnos;
		String entrada,cartel="";
		entrada = JOptionPane.showInputDialog("Cuantos alumnos se van a inscribir?");
		n=Integer.parseInt(entrada);
		alumnos = new float [n];
		for(i=0;i<n;i++)
		{
			entrada = JOptionPane.showInputDialog("Introduzca la calificacion del alumno #"+(i+1));
			alumnos[i] = Float.parseFloat(entrada);
		}
		for(i=0;i<n;i++)
		{
			cartel = cartel + "alumno #"+(i+1)+": "+alumnos[i]+"\n";
			sumaProm=sumaProm+alumnos[i];
			if(alumnos[i]>1299)
			{
				sumaPromApro++;
				if (alumnos[i]>1499) {
					sumaExc++;
				}
			}

		}
		promedio=sumaProm/n;
		promApro=(sumaPromApro/n)*100;
		JOptionPane.showMessageDialog(null,cartel);
		JOptionPane.showMessageDialog(null,"El promedio de aprobacion fue de: "+promApro+"%");
		JOptionPane.showMessageDialog(null,"El promedio total del grupo fue de: "+promedio);
		JOptionPane.showMessageDialog(null,"La cantidad de alumnos con excelencia son: "+sumaExc);

	}//Fin del metodo main
}//Fin de la clase