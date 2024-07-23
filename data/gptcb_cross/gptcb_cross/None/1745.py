def read():
    try:
        return newInput.read()
    except IOError:
        raise