print("Los primeros 100 numeros fibonacci son \n")
n=100
arreglo = Array.new(n)
arreglo[0] = 0
arreglo[1] = 1
for i in (2...n)
	arreglo[i]=arreglo[i-1]+arreglo[i-2]
end
for i in (0...n)
	print("#{arreglo} ")
end
