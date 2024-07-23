@Override

public void dispatchEvent (Event event) {

    checkNotNull (event);

    CancellableEvent X1 = null;

    boolean cancellable;

    if (cancellable = event instanceof CancellableEvent) {

        cancellableEvent = (CancellableEvent) event;

        checkArgument (cancellableEvent.isCancelled ());

    }

    handleEvents (event, true);

    handleEvents (event, false, cancellableEvent);

}
