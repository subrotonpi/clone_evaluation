def getInput(filename):
  infile = None
  try:
    infile = open(filename)
    response = infile.readline()
    return response
  except IOError as e:
    pass
  finally:
    try:
      infile.close()
    except IOError as e:
      pass
  return None