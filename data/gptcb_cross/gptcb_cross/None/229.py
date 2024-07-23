def visitFile(path, attrs):
    strAbsPathDest = ""
    strAbsPathSrc = ""
    dstFile = File(strAbsPathDest + path.toAbsolutePath().toString().substring(strAbsPathSrc.length()))
    if dstFile.exists():
        return FileVisitResult.CONTINUE
    if not dstFile.getParentFile().exists():
        dstFile.getParentFile().mkdirs()
    Files.copy(path, dstFile.toPath())
    return FileVisitResult.CONTINUE