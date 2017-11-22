begin 
	print("Introduce la cantidad de filas de la primera matriz: ")
	q = gets().to_i
	print("Introduce la cantidad de columnas de la primera matriz: ")
	p = gets().to_i
	print("Introduce la cantidad de filas de la segunda matriz: ")
	n = gets().to_i
	print("Introduce la cantidad de columnas de la segunda matriz: ")
	m = gets().to_i
	if (n==p)
		puts("Las columnas del primero tienen que ser iguales a las filas del segundo")
		error =1
	else
		error = 0
	end
end while error==1
arreglo1 = Array.new(q) {Array.new(p) }
arreglo2 = Array.new(n) {Array.new(m) }
multiplicacion = Array.new(q) {Array.new(m) }
for i in (0...n)
	for j in (0...m)
		print("Introduzca la posicion #{i+1},#{j+1} del primer arreglo")
		arreglo1[i][j] = gets().to_i
	end
end
for i in (0...n)
	for j in (0...m)
		print("Introduzca la posicion #{i+1},#{j+1} del segundo arreglo")
		arreglo2[i][j] = gets().to_i
	end
end
if (q>m)
	for l in (0...q)
		for j in (0...m)
			for i in (0...n)
				suma = suma + (arreglo1[l][i]*arreglo2[i][j])
			end
			multiplicacion[l][j] = suma
			suma = 0
		end
	end
else
	for l in (0...m)
		for j in (0...q)
			for i in (0...n)
				suma = suma + (arreglo1[j][i]*arreglo2[i][l])
			end
			multiplicacion[j][l] = suma
			suma = 0
		end
	end
end
print("El resultado es: \n")
for i in (0...n)
	for j in (0...n)
		print("#{multiplicacion[i][j]} ")
	end
	print("\n")
end