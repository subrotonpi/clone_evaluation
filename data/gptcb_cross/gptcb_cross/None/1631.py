def parse(tokenizer):
    baseName = tokenizer.sval
    tokenizer.nextToken()
    params = []
    if tokenizer.ttype == '<':
        while True:
            tokenizer.nextToken()
            params.append(parse(tokenizer))
            if tokenizer.ttype != ',':
                break
        tokenizer.nextToken()
    return GenericType(baseName, params)