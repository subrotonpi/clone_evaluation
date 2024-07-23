def read_file_as_string(file_name, charset_name=None):
    with open(file_name, 'rb') as f:
        file_data = f.read()

    if charset_name is not None:
        return file_data.decode(charset_name)
    else:
        return file_data.decode()