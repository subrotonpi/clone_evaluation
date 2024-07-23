def main(argv):
    print("start")
    C0()
    try:
        print("retrieve item: " + nested.innerItem)
    except Exception as e:
        print("failed to retrieve item: " + str(e))
    print("finish")