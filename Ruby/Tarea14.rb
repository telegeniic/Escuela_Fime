print("Introduzca la cantidad de numeros en la serie: ")
n = gets().to_i
print("1/1 + ")
suma = 1
for i in (2...n)
	suma = suma +(1/i)
	print("1/#{i} + ")
end
print("= #{suma}")