def createTempDir():
    baseDir = os.getenv("TEMP")
    baseName = '{0}-'.format(time.time())
    
    for counter in range(TEMP_DIR_ATTEMPTS):
        tempDir = os.path.join(baseDir, baseName + str(counter))
        if os.mkdir(tempDir):
            return tempDir
    else:
        raise ValueError("Failed to create directory within {0} attempts (tried {1}0 to {1}{2}".format(TEMP_DIR_ATTEMPTS, baseName, TEMP_DIR_ATTEMPTS-1))