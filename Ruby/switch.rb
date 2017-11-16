begin
  print("Ingresa un numero (1-5): ")
  opcion = gets().to_i
  case opcion
  when 1
    puts ("Escribiste 1")
  when 2
    puts ("Escribiste 2")
  when 3
    puts ("Escribiste 3")
  when 4
    puts ("Escribiste 4")
  when 5
    puts ("Escribiste 5")
  else
    puts ("Escribiste un numero mayor a 5 o menor a 1")
  end
  print("Desea continuar? \n1.Si\n2.No\n")
  respuesta = gets().to_i
end while respuesta == 1
