def inputStreamToString (inputStream): 
    result = bytearray()
    buffer = bytearray(1024)
    length = 0
    while length != -1: 
        length = inputStream.readinto(buffer)
        result.extend(buffer[:length])

    return result.decode('utf-8')