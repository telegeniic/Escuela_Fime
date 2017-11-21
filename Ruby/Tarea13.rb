print("Ingrese la cantidad de numeros a mostrar")
n = gets().to_i
cont_non=1
cont_par=1
par_max=1
j=-3
l=2
op=1
for i in (0...n)
	if(cont_non>3)
		op=1
		cont_non = 1
	end
	if (cont_par > par_max)
		op=2
		cont_par=1
		par_max++
	end
	if(op==1)
		print("#{l} ")
		l = l+2
		cont_par++
	else
		print("#{j}" )
		j = j-2
		cont_non++
	end
end