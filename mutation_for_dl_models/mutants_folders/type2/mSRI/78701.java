@Override

public void dispatchEvent (Event event) {

    checkNotNull (event);

    CancellableEvent cancellableEvent = null;

    boolean X1;

    if (X1 = event instanceof CancellableEvent) {

        cancellableEvent = (CancellableEvent) event;

        checkArgument (cancellableEvent.isCancelled ());

    }

    handleEvents (event, true);

    handleEvents (event, false, cancellableEvent);

}
