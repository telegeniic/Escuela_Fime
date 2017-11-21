print("Ingrese el total de filas: ")
n = gets().to_i
print("Ingrese el total de columnas: ")
m = gets().to_i
a = Array.new(n){Array.new(m)}
for i in (0...n)
	for j in (0...m)
		print("Ingresa un numero: ")
		a[i][j]=gets().to_i
	end
end
letrero = ""
for i in (0...n)
	for j in (0...m)
		letrero=letrero + a[i][j].to_s + " "
	end
	letrero = letrero + "\n"
end
puts(letrero)