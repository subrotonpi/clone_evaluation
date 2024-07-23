def add(producer, item):
    with lock:
        if producer not in queues:
            queues[producer] = PriorityBlockingQueue() 
        added.notify_all() 
        return queues[producer].add(item)