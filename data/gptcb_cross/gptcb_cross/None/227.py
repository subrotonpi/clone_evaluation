def copyFolder(src, dest):
    try:
        for item in os.listdir(src):
            s = os.path.join(src, item)
            d = os.path.join(dest, item)            
            if os.path.isdir(s):
                shutil.copytree(s, d)
            else:
                shutil.copy2(s, d)
    except (IOError) as e:
        print("I/O error: " + e)