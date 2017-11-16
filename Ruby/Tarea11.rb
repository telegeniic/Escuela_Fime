print("Introduce la cantidad de numeros a mostrar de la serie: ")
n = gets().to_i
exp = 1
for i in (1..n)
	valor = i
	for l in (1...exp)
		valor = valor * i
	end
	exp = exp + 2
	print("#{valor} ")
end
