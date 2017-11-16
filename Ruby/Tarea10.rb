print("Ingrese la cantidad de pesos que desea cambiar: ")
dinero = gets().to_f
print("Ingrese a cual moneda desea convertir:
1) Dolar
2) Euro
3) Yen
4) Dolar de Hong Kong
op: ")
op = gets().to_i
case op
when 1
	cambio = dinero/18
	moneda = " Dolares"
when 2
	cambio = dinero/22.22
	moneda = " Euro"
when 3 
	cambio = dinero*5.94
	moneda = " Yens"
when 4
	cambio = dinero/2.44
	moneda = " Dolar de Hong Kong"
else
	print("Opcion no valida")
end
print("Usted cuenta con #{cambio}"+moneda)