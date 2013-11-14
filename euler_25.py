n_1 = 1;
n_2 = 1;

currentNumber = 2;
while(len(str(n_2)) != 1000):
	temp = n_2;
	n_2 = n_1 + n_2;
	n_1 = temp;
	currentNumber = currentNumber + 1;
##	print "Number " + str(currentNumber) + " is " + str(n_2)
	
print currentNumber	

	
