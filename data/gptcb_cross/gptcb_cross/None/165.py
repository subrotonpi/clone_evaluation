def countLines(input):
    with open(input) as is_:
        count = 1
        while True:
            aChar = is_.read(1)
            if aChar == '':
               break
            count += 1 if aChar == '\n' else 0
        return count