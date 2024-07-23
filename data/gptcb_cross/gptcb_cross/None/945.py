def run ():
    with lock:
        if bar.isDisposed () or bar.getShell ().isDisposed ():
            return
        currentSize [0] = bar.getShell ().getSize ().y
        if currentSize [0] != orgSize [0]:
            return
        else:
            bar.getShell ().layout (True)
            bar.getShell ().pack (True)