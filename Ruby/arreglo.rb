print("ingrese el total de numeros: ")
n = gets().to_i
a = Array.new(n)
for i in (0...n)
	print("Ingrese un numero: ")
	a[i]=gets().to_i
end
letrero = "A=["
for i in (0...n)
	letrero = letrero + a[i].to_s + " "
end
letrero = letrero + "]"
print(letrero)