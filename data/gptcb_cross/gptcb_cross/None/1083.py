def main(aArgs=[]):
    print("Generating 10 random integers in range 1..10.")
    START = 1
    END = 10
    randomGenerator = random.Random()
    for idx in range(1, 11):
        showRandomInteger(START, END, randomGenerator)
    print("Done")