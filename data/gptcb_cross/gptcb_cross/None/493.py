def countString(str, value):
    arr = str.split()
    temp_string = ''
    for s in arr:
        temp_string += s
        for ch in s:
            print('Number of Occurrence of {} is:'.format(ch), temp_string.count(ch))
    if value != '':
        temp_string2 = ''
        for s in arr:
            temp_string2 += s
            for ch in s:
                if ch == value:
                    print('Number of Occurrence of {} is:'.format(ch), temp_string2.count(ch))