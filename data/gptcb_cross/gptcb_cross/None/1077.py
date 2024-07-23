def main(args): 
    sc = input() 

    array = [['continents', 'Asia', 'Europe', 'Africa', 'Australia', 'South America', 'North America'], 
             ['profession', 'teacher', 'doctor', 'lawyer'], 
             ['brand', 'apple', 'samsung'], 
             ['name', 'lisa', 'peter', 'sam', 'jack'], 
             ['profession', 'engineer', 'Professor', 'Dentist', 'Driver'], 
             ['sex', 'value', 'male', 'female'], 
             ['exp', 'value', '1', '2', '3', '4']]
    
    index = int(sc)
    tempReference = array[index - 1]

    for i in range(index - 1, len(array) - 1):
        array[i] = array[i+1]

    array[len(array) - 1] = tempReference

    for tempArray in array:
        for s in tempArray:
            print(s + ' ', end='')
        print()