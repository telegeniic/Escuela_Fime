print("Seleccione la opcion a convertir:
1) Centigrados a Farenheit
2) Farenheit a Centigrados\n")
op = gets().to_i
case op
when 1
	print("Cuantos grados Centigrados va a convertir: ")
	cent = gets().to_f
	fare = cent * 1.8 + 32
	print("#{cent} Centigrados equivalen a #{fare} Farenheit")
when 2
	print("Cuantos grados Farenheit va a convertir: ")	
	fare = gets().to_f
	cent = (fare - 32) / 1.8
	print("#{fare} Farenheit equivalen a #{cent} Centigrados")
else
	print("opcion invalida")
end