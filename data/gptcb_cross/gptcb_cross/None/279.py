def inputStreamToString(inputStream):
    newLine = sys.getProperty('line.separator')
    reader = BufferedReader(InputStreamReader(inputStream, UTF_8))
    result = []
    line = reader.readLine()
    while line:
        result.append(line)
        line = reader.readLine()
    return line.join(result)