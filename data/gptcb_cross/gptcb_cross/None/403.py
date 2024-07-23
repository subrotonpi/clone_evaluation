def run():
 try:
  for i in range(0,2):
   print('tic')
 except Exception as e:
  print(e.__traceback__)