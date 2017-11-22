print("Introduzca la cantidad de filas")
n = gets().to_i
arreglo = Array.new(n)
for i in (0...n)
	print("Introduzca el valor de la posicion #{i}")
	arreglo[i] = gets().to_i
end
print("La serie quedo asi: ")
for i in (0...n)
	if (arreglo[i]==0)
		cont_cero++
	end
	if (arreglo[i]>0)
		cont_pos++
	end
	if (arreglo[i]<0)
		cont_neg++
	end
	print("#{arreglo[i]} ")
end
print("En el arreglo se encontraron #{cont_pos} numeros positivos,
#{cont_neg} numeros negativos y #{cont_cero} nulos")