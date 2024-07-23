def compressBad(str):
    compressed_string = ""
    if str is not None and len(str) > 0:
        count_consecutive = 1
        prev_char = str[0]
        for i in range(1, len(str)):
            if str[i] != prev_char:
                compressed_string += str(prev_char) + str(count_consecutive)
                prev_char = str[i]
                count_consecutive = 1
            else:
                count_consecutive += 1
        compressed_string += str(prev_char) + str(count_consecutive)
    return compressed_string