def put(self, key, val):
    while self.currentSize >= self.maxSize:
        self.freeSpace()

    if key in self.map:
        self.get(key)
        return

    ln = self.queue.add(key)
    rv = ValueHolder(val, ln)
    self.map[key] = rv
    self.currentSize += 1