def tokenizer(value, delimeters):
    list = []
    for s in delimeters:
        if s in value:
            strArr = value.split(s)
            for str in strArr:
                list.append(str)
                if s not in list:
                    list.append(s)
    return list