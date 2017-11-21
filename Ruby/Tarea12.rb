print("Ingrese la cantidad de numeros a mostrar")
n = gets().to_i
cartel = ""
veces = 2
for i in (1...n)
	if (i%2==0)
		for i in (1...veces)
			cartel = cartel + i.to_s+" "
		end
		veces++
	if (i%2!=0)
		j = i*-1
		cartel = cartel + j.to_s+" "
	end
end
end
print("#{carte}")
