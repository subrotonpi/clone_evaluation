words_dict = dict()
while True: 
    s = input()
    if s == '': 
        break
    words = s.replace('[^a-zA-Z ]', "").lower().split()
    no_duplicated = set(words)
    for w in no_duplicated:
        count = words.count(w)
        words_dict[w] = count
    
    for w in words_dict: 
        print(f"word count: → {w} {words_dict[w]}")
