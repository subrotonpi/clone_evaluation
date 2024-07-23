def main():
    map = {}
    map['A'] = "abc"
    map['A'] = "def"

    for i in range(len(map.items())):
        print("Bucket:{}, Entry:{}".format(i,str(map.items()[i])))