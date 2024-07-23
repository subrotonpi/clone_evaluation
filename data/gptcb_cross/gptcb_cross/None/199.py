def getTerminalGuis():
    comps = getComponents()
    list = []
    if comps is None:
        return None
    for c in comps:
        if isinstance(c, TerminalGui):
            list.append(c)
    return list