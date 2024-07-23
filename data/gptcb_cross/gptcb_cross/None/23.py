MAX_VAL = 10000
linkedList = []
arrayList = []
#Initialize each list
for i in range(MAX_VAL):
    linkedList.append(i)
    arrayList.append(i)
#LL time
time = 0
start = time.perf_counter_ns()
for i in range(MAX_VAL):
    linkedList.insert(MAX_VAL//2, i)
print("LL time:", (time.perf_counter_ns() - start))
#AL time
start = time.perf_counter_ns()
for i in range(MAX_VAL):
    arrayList.insert(MAX_VAL//2, i)
print("AL time:", (time.perf_counter_ns() - start))
#LL iterator
start = time.perf_counter_ns()
li = linkedList.listIterator(MAX_VAL//2)
for i in range(MAX_VAL):
    li.add(i)
print("LL iterator:", (time.perf_counter_ns() - start))
#AL iterator
start = time.perf_counter_ns()
ali = arrayList.listIterator(MAX_VAL//2)
for i in range(MAX_VAL):
    ali.add(i)
print("AL iterator:", (time.perf_counter_ns() - start))
