print("Introduce la cantidad de filas del arreglo")
n = gets().to_i
print("Introduce la cantidad de columnas del arreglo")
m = gets().to_i
arreglo = Array.new(n) {Array.new(m) }
for i in (0...n)
	for j in (0...m)
		print("Introduzca la posicion #{i+1},#{j+1}")
		arreglo[i][j] = gets().to_i
	end
end
print("Cual valor va a buscar en la matriz")
valor=gets().to_i
print("En la matriz:\n")
for i in (0...n)
	for j in (0...m)
		print("#{arreglo[i][j]} ")
		if (arreglo[i][j]==valor)
			veces++
		end
	end
	print("\n")
end
print("El valor #{valor} ")
print("se encontro #{veces}")