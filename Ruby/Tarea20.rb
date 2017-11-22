sumaExc=0
sumaProm=0
sumaPromApro=0
print("Cuantos alumnos se van a inscribir?")
n = gets().to_i
alumnos = Array.new(n)
for i in (0...n)
	print("Introduzca el puntaje del alumno #{i}")
	alumnos[i] = gets().to_i
end
for i in (0...n)
	print("Alumno #{i}: #{alumnos[i]}\n")
	sumaProm = sumaProm + alumnos[i]
	if (alumnos[i]>1299)
		sumaPromApro++
		if(alumnos[i]>1499)
			sumaExc++
		end
	end
end
promedio = sumaProm/n
promApro = (sumaPromApro/n)*100
print("El promedio de aprobacion fue de #{promApro}\nEl Promedio total del grupo fue de #{promedio}")
print("\nLa cantidad de alumnos con excelencia son: sumaExc")