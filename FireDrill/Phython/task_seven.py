for number in range(1,11):
	multiple = 1
	sum = 0
	if number % 4 == 0 :
		for innernumber in range(1,6):
			multiple *= number
			sum += multiple
		print(sum, end = " ")