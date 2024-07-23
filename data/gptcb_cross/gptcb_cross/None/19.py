def tokenizer(text, delims):
    for delim in delims:
        i = text.find(delim)
        if i >= 0:
            tail = tokenizer(text[i+len(delim):], delims)
            list = [text[:i]] + [delim] + tail
            return list
    return [text]