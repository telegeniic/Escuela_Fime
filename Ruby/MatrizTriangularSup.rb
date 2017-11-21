begin 
	print("Introduce la cantidad de filas: ")
	n = gets().to_i
	print("Introduce la cantidad de columnas: ")
	m = gets().to_i
	if (n!=m)
		puts("La matriz tiene que ser cuadrada")
		error =1
	else
		error = 0
	end
end while error==1
a = Array.new(n){Array.new(m)}
for i in (0...n)
	for j in (0...m)
		print("Ingresa un numero posicion #{i} #{j}: ")
		a[i][j]=gets().to_i
	end
end

letrero = ""
for i in (0...n)
	for j in (0...m)
		letrero=letrero + a[i][j].to_s + " "
		if i>j
			if a[i][j]!=0
				falla = 1
			end
		end
	end
	letrero = letrero + "\n"
end
if falla == 1
	print("No es Triangular\n")
else
	print("Si es Triangular\n")
end
puts(letrero)
	