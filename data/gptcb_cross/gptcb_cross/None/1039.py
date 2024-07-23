def visitFile(file, attrs):
    strAbsPathDest = ' '
    strAbsPathSrc = ' '
    dstFile = File(strAbsPathDest + file.toAbsolutePath().toString().substring(strAbsPathSrc.length()))
    if (dstFile.exists()):
        return FileVisitResult.CONTINUE
    if not (dstFile.getParentFile().exists()):
        dstFile.getParentFile().mkdirs()
    Files.copy(file, dstFile.toPath())
    return FileVisitResult.CONTINUE