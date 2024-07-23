def next(self):
    if not self.has_next:
        raise StopIteration 
    output = [self.arr[index] for index in self.ind]
    self.has_next = False
    for tail in range(len(self.ind) - 1, 0, -1):
        if self.ind[tail-1] < self.ind[tail):
            s = len(self.ind)-1
            while self.ind[tail-1] >= self.ind[s]:
                s -= 1
            self.swap(ind, tail-1, s)
            for i in range(tail, len(self.ind)-1):
                j = len(self.ind) - 1 - (i - tail)
                self.swap(ind, i,j)
            self.has_next = True
            break
    return output