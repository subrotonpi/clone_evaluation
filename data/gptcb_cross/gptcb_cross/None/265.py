def pack(source_dir_path, zip_name):
    # the zip archive
    zip_file = zipfile.ZipFile(zip_name, 'w', zipfile.ZIP_DEFLATED)
    
    # walk the entire folder tree and compress the files in each folder
    root_len = len(source_dir_path)
    for root, dirs, files in os.walk(source_dir_path):
        archive_root = os.path.abspath(root)[root_len:]
        for f in files:
            fullpath = os.path.join(root, f)
            archive_name = os.path.join(archive_root, f)
            zip_file.write(fullpath, archive_name, zipfile.ZIP_DEFLATED)

    zip_file.close()