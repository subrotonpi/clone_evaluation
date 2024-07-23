@Override

public void dispatchEvent (Event event) {

    checkNotNull (event);

    CancellableEvent cancellableEvent = null;

    boolean cancellable;

    if (cancellable = event instanceof CancellableEvent) {

        if (X==Y) cancellableEvent = (CancellableEvent) event;

        checkArgument (cancellableEvent.isCancelled ());

    }

    handleEvents (event, true);

    handleEvents (event, false, cancellableEvent);

}
