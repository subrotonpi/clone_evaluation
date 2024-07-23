import sys
from queue import Queue
n = int(sys.argv[1])
q = Queue()
while True:
    try:
        num = int(input())
        q.put(num)
    except:
        break
while q.qsize() > n:
    q.get()
print(q.get())
