def dispatchEvent (event):
    if (event == None):
        raise ValueError('Event cannot be null')

    cancellableEvent = None
    cancellable = False
    if (isinstance(event,CancellableEvent)):
        cancellableEvent = event
        if (not cancellableEvent.isCancelled()):
            raise ValueError('Event must have been cancelled prior to dispatching')

    fireEvents(False, event, cancellableEvent, cancellable)
    fireEvents(True, event, cancellableEvent, cancellable)