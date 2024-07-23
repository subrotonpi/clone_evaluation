def copyFolder(src, dest):
    try:
        for s in os.walk(src):
            d = os.path.join(dest, s[0].replace(src, "")) 
            if os.path.isdir(s[0]):
                if not os.path.exists(d):
                    os.makedirs(d)
            else:
                shutil.copy2(s[0], d)
    except Exception as ex:
        print(ex)