def run():
  try:
    retValue = pro.waitFor()
    print("Command exit with return value " + str(retValue))
    outStream.close()
    outStream = None
  except InterruptedException,e:
    print e
  except IOException,e:
    print e