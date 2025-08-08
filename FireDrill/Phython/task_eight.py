sum = 0
for number in range(1,11):
	multiple = 1
	if number % 4 == 0 :
		for innernumber in range(1,6):
			multiple *= number
			sum += multiple
print(sum, end = " ")