def shuffle (input):
    characters = list(input)
    output = ""
    while len(characters) != 0:
        rand_picker = int(random.random() * len(characters))
        output += characters.pop(rand_picker)
    print(output)