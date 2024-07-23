def run(self):
    if bar.isDisposed() or bar.getShell().isDisposed():
        return
    with lock:
        bar.getShell().pack(True)
        orgSize[0] = bar.getShell().getSize().y 
        currentSize[0] = orgSize[0]