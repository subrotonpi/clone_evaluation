def count_by_char(s):
    letter_count_map = {}
    for c in s:
        if c in letter_count_map:
            letter_count_map[c] += 1
        else:
            letter_count_map[c] = 1
    for key, value in letter_count_map.items():
        print(value, "( for ", key, ")")