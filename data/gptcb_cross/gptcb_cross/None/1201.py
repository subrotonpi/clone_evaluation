def print():
  try:
    waitForSemaphore.acquire()
    start = nextStartIdx
    for i in range(0, 5):
      print("{0} -- {1}".format(i + start, threading.current_thread().name))
    nextStartIdx += 5
    next.release()
  except InterruptedException as ie:
    threading.current_thread().interrupt()