tm = {}
try:
    fis = open("Test.txt","r")
    text = fis.read()
    text_list = text.replace("-","").replace("+","").replace(".","").replace("^","").replace(":","").replace(";","").replace("(","").replace(")","").replace("\"","").replace("[","").replace("]","").split(" ")
  
    for x in text_list:
        if x in tm:
            tm[x] += 1
        else:
            tm[x] = 1
 
    for key,value in tm.items():
        print("{} : {}".format(key,value))
    
except FileNotFoundError:
    print("File not found")
except IOError:
    print("IO Error")
