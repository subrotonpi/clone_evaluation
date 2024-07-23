def replacer(outBuffer):
  data = outBuffer.toString()
  try:
    data = data.replace('%(?![0-9a-fA-F]{2})', '%25')
    data = data.replace('\\+', '%2B')
    data = urllib.parse.unquote(data, 'utf-8')
  except Exception as e:
    print(e)
  return data