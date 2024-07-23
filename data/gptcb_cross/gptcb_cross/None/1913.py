def main():
	first = int(input('Enter the first integer: '))
	second = int(input('Enter the second integer: '))

	print('You have keyed in {0} and {1}'.format(first, second))

	import random
	num = random.randint(first, second)

	print('Random number: ', num if num > first else first + num)