def addFolderToZip (path, srcFolder, zip): 
    folder = os.path.join(srcFolder) 
    if len(os.listdir(folder)) == 0: 
        addFileToZip(path, srcFolder, zip, True) 
    else: 
        for fileName in os.listdir(folder): 
            if path == "": 
                addFileToZip(os.path.basename(folder), os.path.join(srcFolder, fileName), zip, False) 
            else: 
                addFileToZip(os.path.join(path, os.path.basename(folder)), os.path.join(srcFolder, fileName), zip, False)