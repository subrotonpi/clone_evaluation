def solution(x, a):
    sum_ = 0
    searched_value = x
    sum_v = searched_value * (searched_value + 1) / 2
    array_list = [] 
    for iii in range(len(a)):
        if a[iii] <= searched_value and a[iii] not in array_list:
            sum_ += a[iii]
            if sum_ == sum_v:
                return iii
            array_list.append(a[iii])
 
    return -1