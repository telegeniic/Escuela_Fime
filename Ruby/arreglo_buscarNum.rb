print("ingrese el total de numeros: ")
n = gets().to_i
a = Array.new(n)
for i in (0...n)
	print("Ingrese un numero: ")
	a[i]=gets().to_i
end
print("Que numero desea buscar? ")
x = gets().to_i
for i in (0...n)
	if x==a[i]
		print("Si se encontro\n")
	end
end
letrero = "A=["
for i in (0...n-1)
	letrero = letrero + a[i].to_s + ","
end
letrero = letrero + a[-1].to_s + "]"
print(letrero)