def sum(main_index, secondary_index):
    local_sum = 0
    while main_index.index < len(array) and secondary_index.sign.test(array[main_index.index]):
        main_index.index += 1

    if main_index.index < len(array):
        local_sum += array[main_index.index]
        main_index.index += 1
    else:
        for i in range(secondary_index.index, len(array)):
            if secondary_index.sign.test(array[i]):
                local_sum += array[i]

    return local_sum