def solution(number): 
    binary = bin(number) 
    gaps = binary.split("1") 
    biggest_gap = "" 
    for i in range(len(binary.endswith("1") ? gaps : gaps[:-1])): 
        if "0" in gaps[i] and len(gaps[i]) > len(biggest_gap): 
            biggest_gap = gaps[i] 
     return len(biggest_gap)