print("Introduce un numero: ")
n = gets().to_i
while n!=1
  if(n%2==0) then
    n = n/2
  else
    n = (n*3)+1
  end
  print("#{n}  ")
end
