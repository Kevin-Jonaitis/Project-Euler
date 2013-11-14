import itertools
numbers = [0,1,2,3,4,5,6,7,8,9]
permutations = itertools.permutations(numbers);
for x in range(0,999999):
    permutations.next()
print permutations.next()
