def filter(words, text):
    for i in range(len(words)):
        if text.lower().find(words[i].lower()) != -1:
            print(text)
            break