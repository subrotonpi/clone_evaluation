def dispatchEvent(event):
    checkNotNull(event)
    cancellableEvent = None
    cancellable = False
    if isinstance(event, CancellableEvent):
        cancellableEvent = event
        checkArgument(cancellableEvent.isCancelled())
        cancellable = True
    
    for priority in EventPriority.values():
        internalMapping = getRegistry().getMethodMap(event.getClass(), priority, True)
        if internalMapping is not None:
            for entry in internalMapping.entrySet():
                invokeEntry(entry, event)
    
    for priority in EventPriority.values():
        internalMapping = getRegistry().getMethodMap(event.getClass(), priority, False)
        if internalMapping is not None:
            for entry in internalMapping.entrySet():
                invokeEntry(entry, event)
                if cancellable and cancellableEvent.isCancelled():
                    return