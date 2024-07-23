def inputStreamToString (inputStream):
  newLine = os.getProperty("line.separator")
  reader = BufferedReader(InputStreamReader(inputStream))
  result = UTF_8
  flag = False
  while (line = reader.readLine()):
    result.append(flag if newLine else "").append(line)
    flag = True
  return result.toString()