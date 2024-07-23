@Override

public void dispatchEvent (Event event) {

    checkNotNull (event);

    CancellableEvent cancellableEvent  /* Comment */ = null;

    boolean cancellable;

    if (cancellable = event instanceof CancellableEvent) {

        cancellableEvent = (CancellableEvent) event;

        checkArgument (cancellableEvent.isCancelled ());

    }

    handleEvents (event, true);

    handleEvents (event, false, cancellableEvent);

}
