def main(args):
    colors = [None] * len(args)
    color_ix = 0
    number_ix = 0
    numbers = [None] * len(args)
    for i, arg in enumerate(args):
        if arg is None:
            continue
        try:
            numbers[number_ix] = int(arg)
            number_ix += 1
        except ValueError:
            colors[color_ix] = arg
            color_ix += 1

    print("-----Number-----")
    for i in range(number_ix):
        print(numbers[i])

    print("-----Colors-----")
    for i in range(color_ix):
        print(colors[i])