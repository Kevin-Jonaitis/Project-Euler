import math

abundent_numbers = {}

##finds the abundent_numbers
for x in range(1,28123):
    sum = 0;
    current = 2;
    while(current < math.sqrt(x)): #Run up to the square root
        if (x % current == 0):
            sum = sum + current # Print the divisible number
            sum = sum + (x/current) # Print the number divided by the divisible number(to find the number on the other side of the square root)
        current = current + 1;
    # Edge cases
    sum = sum + 1
    if (current * current == x): #print the square root
        sum = sum + current
    if (sum > x):
        abundent_numbers[x] = True


winning_numbers = []

#The trick here is the hash. When you are searching for a number to see if you can represent it with the a series of 2 numbers, you take that number, here as x,
## and go through all the other numbers in the abundent list and do x - y. If that hashes to another number in your abundent list, then you have a match. If not, you keep trying the next number
##This runs in O(n) time, for each number, and O(n^2) for all the numbers. Not the most plesent solution, but better than O(n^3) for complete brute-force.
def check_for_number(x):
    for y in abundent_numbers:
        if (x > y):
            if((x - y) in abundent_numbers):
                winning_numbers.append(x);
                return #we already found that this number works, so don't try to re-calculate it with other x and (x - y)
        else:
            break;

for x in range (0,28123):
    check_for_number(x);


sumNumbersInList = 0;
sumNumbers = 0;
##Find the difference between what the sum of all the numbers are, and the sum of the numbers in the list. That should equal the sum of the numbers NOT represented by abundent numbers.
for x in range (0,28123):
    sumNumbers = sumNumbers + x;
for number in winning_numbers:
    sumNumbersInList = sumNumbersInList + number;

print "Difference: " + str(sumNumbers - sumNumbersInList)

   
    
