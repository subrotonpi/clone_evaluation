def visit_file(file, attrs):
    str_abs_path_dest = '...' # replace ... with destination
    str_abs_path_src = '...' # replace ... with source
    
    dst_file = File(str_abs_path_dest + file.to_absolute_path().string_substring(str_abs_path_src.length()))
    
    if dst_file.exists():
        return FileVisitResult.CONTINUE
    else:
        if not dst_file.get_parent_file().exists():
            dst_file.get_parent_file().mkdirs()

        Files.copy(file, dst_file.to_path())
        return FileVisitResult.CONTINUE