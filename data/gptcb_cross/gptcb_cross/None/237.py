def unzip():
    try:
        fin = open(_zipFile, 'rb')
        zin = zipfile.ZipInputStream(fin)
        ze = None
        while (ze = zin.getNextEntry()) != None:
            print("Decompress: Unzipping" + ze.getName ())
            if ze.is_dir():
                _dir_checker(ze.getName())
            else:
                fout = open(_location + ze.getName(), 'wb')
                buff_out = io.BufferedWriter(fout)
                buff = 1024
                read = 0
                while (read = zin.read(buffer)) != -1:
                    buff_out.write(buffer, 0, read)
                buff_out.close()
                zin.closeEntry()
                fout.close()
        zin.close()
        print("Unzip: Unzipping Completer. Path: " + _location)
    except Exception as e:
        print("Decompress: Unzip" + e)
        print("Unzip: Unzipping failed")