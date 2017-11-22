cereales = Array.new(12)
for i in (0...12)
	print("Introduzca la cosecha del mes #{i+1} ")
	cereales[i]=gets().to_i
	promedio = promedio + cereales[i]
end
promedio = promedio/12
for i in (0...12)
	print("mes numero #{i+1}: #{cereales[i]} toneladas\n")
	if (cereales[i]>promedio)
		coseSup++
		if (cereales[i]>max)
			max = cereales[i]
			idMax = i
		end
	end
end
print("El promedio anual fue de #{promedio} toneladas\n")
print("El promedio mensual se supero #{coseSup} veces\n")
print("En el mes numero #{idMax+1} se produjo la mayor cosecha, la cual fue de #{cereales[idMax]} toneladas")
