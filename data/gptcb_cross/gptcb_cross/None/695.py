def deleteRecursive(path):
    c = os.listdir(path)
    print("Cleaning out folder: {}".format(path))

    for file in c:
        full_path = os.path.join(path, file)
        if os.path.isdir(full_path):
            print("Deleting file: {}".format(full_path))
            deleteRecursive(full_path)
            os.rmdir(full_path)
        else:
            os.remove(full_path)
    os.rmdir(path)