def run():
      next = sequencer.getAndIncrement()
      integers[next-1]+=1