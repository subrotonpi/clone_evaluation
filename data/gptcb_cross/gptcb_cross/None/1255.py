def join(delimiter, *parts):
    builder = []
    for part in parts:
        if part:
            if len(builder) > 0:
                builder.append(delimiter)
            builder.append(part)
    return ''.join(builder)