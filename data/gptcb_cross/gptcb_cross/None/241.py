def countLines(is):
  try:
    lnr = LineNumberReader(InputStreamReader(is))
    buf = [0] * 8192
    previousN = -1
    while (n := lnr.read(buf)) != -1:
      previousN = n
    ln = lnr.getLineNumber()
    if previousN == -1:
      return 0
    else:
      lastChar = buf[previousN - 1]
      if lastChar == "\n" or lastChar == "\r":
        return ln
    return ln + 1
  finally:
    is.close()