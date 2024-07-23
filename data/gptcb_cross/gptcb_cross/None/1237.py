def main():
    scanner = input()
    line = scanner.split(" ")
    trys = int(line[0])
    for i in range(trys):
        probability = processTry(scanner)
        print(probability)