def read_data(f, start_byte, chunk_size):
  try:
    with open(f, 'rb' ) as raf:
        raf.seek(start_byte)
        data = bytearray(chunk_size)
        read = raf.readinto(data)
        if read == chunk_size:
            return data
        else:
            return data[:read]
  except Exception as e:
        raise e