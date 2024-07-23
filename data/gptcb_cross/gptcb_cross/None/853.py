def run():
    try:
        ret_value = pro.waitFor()
        print("Command exit with return value " + str(ret_value))
        outStream.close()
        outStream = None
    except InterruptedException as e:
        print(e)
    except IOException as e:
        print(e)