print("Introduce la cantidad de filas del arreglo")
n = gets().to_i
arreglo = Array.new(n)
for i in (0...n)
	print("Introduce la posicion #{i}")
	arreglo[i] = gets().to_i
end
print("Cual valor busca en el arreglo?")
valor = gets().to_i
for i in (0...n)
	if arreglo[i]==valor
		veces++
	end
end
print("El valor #{valor} se encontro #{veces} veces en el arreglo")
for i in (0...n)
	print("#{arreglo[i]}")
end