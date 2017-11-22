begin 
	print("Introduce la cantidad de filas de la primera matriz: ")
	n = gets().to_i
	print("Introduce la cantidad de columnas de la primera matriz: ")
	m = gets().to_i
	print("Introduce la cantidad de filas de la segunda matriz: ")
	q = gets().to_i
	print("Introduce la cantidad de columnas de la segunda matriz: ")
	o = gets().to_i
	if (n!=q&&m!=o)
		puts("Las matrices tienen que ser iguales")
		error =1
	else
		error = 0
	end
end while error==1
arreglo1 = Array.new(n) {Array.new(m) }
arreglo2 = Array.new(q) {Array.new(o) }
suma = Array.new(n) {Array.new(m) }
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
print("La suma quedo: ")
for i in (0...n)
	for j in (0...m)
		suma[i][j] = arreglo1[i][j]+arreglo2[i][j]
		print("#{suma[i][j]}")
	end
end