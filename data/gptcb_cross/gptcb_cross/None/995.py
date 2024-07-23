def get_protocol(file):
    try:
        result = file.toURI().toURL().getProtocol()
    except:
        result = 'unknown'
    return result