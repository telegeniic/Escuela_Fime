Pi = 3.1416
print("Seleccione la figura a medir\n1)Cuadrado
2)Triangulo\n3)Rectangulo\n4)Circulo\n")
op = gets().to_i
case op
when 1
	print("Introduce el lado del Cuadrado: ")
	l = gets().to_i
	area = l*l
	print("El area del Cuadrado es: #{area}")
when 2
	print("Introduce el alto del Triangulo: ")
	h = gets().to_f
	print("Introduce la base del Triangulo: ")
	l = gets().to_f
	area = (h*l)/2
	print("El area del Triangulo es: #{area}")
when 3
	print("Introduce la base del Rectangulo: ")
	l = gets().to_i
	print("Introduce la altura del Rectangulo: ")
	h = gets().to_i
	area = l*h
	print("El area del Rectangulo es: #{area}")
when 4
	print("Introduce el radio del Circulo")
	l = gets().to_f
	area = Pi * (l*l)
	print("El area del Circulo es: #{area}")
else
	print("Opcion Incorrecta")
end