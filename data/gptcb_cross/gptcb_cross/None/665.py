def deleteRecursive(path):
    for file in os.listdir(path):
        file_path = os.path.join(path, file)
        print("Cleaning out folder: "+path.toString())
        try:
            if os.path.isfile(file_path):
                os.unlink(file_path)
            elif os.path.isdir(file_path): 
                deleteRecursive(file_path)
                os.removedirs(file_path)
        except Exception as e:
            print(e)
    os.removedirs(path)