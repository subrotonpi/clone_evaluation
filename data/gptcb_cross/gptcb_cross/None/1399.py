def run ():
    try:
        for i in range (2):
            print ("tac")
    except Exception as e:
        print (e .__stacktrace__)