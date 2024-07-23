def pack(source_dir_path, zip_file_path):
    with zipfile.ZipFile(zip_file_path, "w") as zipObj:
        for root, dirs, files in os.walk(source_dir_path):
            for file in files:
                zipObj.write(os.path.join(root, file))