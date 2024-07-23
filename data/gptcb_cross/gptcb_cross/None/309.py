def main(): 
    str = 'AAABBBBCC'
    length = len(str)
    sb = []
    count = 1
    for i in range(length):
        if i == length-1:
            sb.append(str[i]+str(count))
            break
        if str[i] == str[i+1]:
            count +=1
        else:
            sb.append(str[i]+str(count))
            count = 1
    print("".join(sb))

main()