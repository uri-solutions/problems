l =  raw_input().split(".")

x = 100*int(l[0]) + int(l[1])
num = x
cont = 0
while num % 36000 != 0:
	cont += 1
	num += x
print cont + 1
