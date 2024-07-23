def main(argv):
    main = Main()
    if len(argv) == 0:
        methodName = "foo"
    else:
        methodName = "bar"
    method = Main.getDeclaredMethod(methodName, int)
    main.car(method, 42)