def run():
  try:
    for i in range(2):
      print("tic")
  except Exception as e:
    print(e.getStackTrace())