print("Introduzca hasta que numero quiere imprimir la serie: ")
n = gets().to_i

for i in (1..(n-1)).step 3
  print("#{i},")
end
print("#{n}.")
