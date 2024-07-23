def accept(pathname):
    if pathname.is_dir():
        for file in pathname.iterdir():
            accept(file)
        pathname.rmdir()
    else:
        pathname.unlink()
    return False