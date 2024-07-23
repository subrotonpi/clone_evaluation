def getHours():
    hours = 0
    hours_not_OK = True
    while hours_not_OK:
        try:
            print('Here')
            hours = int(input())
            hours_not_OK = False
        except Exception as e:
            print(e)
            hours_not_OK = True
            print(', please re-enter the hours again.')
    print('**hours input accepted**')
    return hours