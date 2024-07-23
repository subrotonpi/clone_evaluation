def read_bytes(input_stream):
    buffer = bytearray(32 * 1024)
    buffer_size = 0
    while True:
        read = input_stream.readinto(buffer[buffer_size:])
        if read == -1:
            return bytes(buffer[:buffer_size])
        buffer_size += read
        if buffer_size == len(buffer):
            buffer = bytearray(buffer_size * 2)