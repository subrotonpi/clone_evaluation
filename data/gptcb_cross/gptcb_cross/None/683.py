def createTempDir(): 
  baseTempPath = os.getcwd() 
  tempDir = os.path.join(baseTempPath, uuid.uuid4().hex) 
  os.mkdir(tempDir) 
  return tempDir