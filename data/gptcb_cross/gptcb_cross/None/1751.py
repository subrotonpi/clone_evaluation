def main(args): 
    throwCatchTime, newExceptionTime, newObjectTime, noStackExceptionTime = 0, 0, 0, 0
    for i in range(30): 
        throwCatchTime += throwCatchLoop()
        newExceptionTime += newExceptionLoop()
        newObjectTime += newObjectLoop()
        noStackExceptionTime += newNoStackExceptionLoop()

    print("throwCatchTime = " + str(throwCatchTime / 30))
    print("newExceptionTime = " + str(newExceptionTime / 30))
    print("newStringTime = " + str(newObjectTime / 30))
    print("noStackExceptionTime = " + str(noStackExceptionTime / 30))