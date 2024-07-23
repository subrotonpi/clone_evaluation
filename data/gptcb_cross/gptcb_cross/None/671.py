def post_visit_directory(directory, io_exception):
    try:  
        os.remove(directory) 
    except OSError as e: 
        print ("Error: %s : %s" % (directory, e.strerror))
    return FileVisitResult.CONTINUE