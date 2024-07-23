def filter(words, text):
    for word in words:
        if word.lower() in text.lower():
            print(text)
            break