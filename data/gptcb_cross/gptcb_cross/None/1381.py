def head(node, depth):
    if isinstance(node, Comment):
        return FilterResult.REMOVE
    return FilterResult.CONTINUE