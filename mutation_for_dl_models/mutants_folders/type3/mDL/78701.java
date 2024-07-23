@Override

public void dispatchEvent (Event event) {

    checkNotNull (event);

    CancellableEvent cancellableEvent = null;

    boolean cancellable;

    if (cancellable = event instanceof CancellableEvent) {

        cancellableEvent = (CancellableEvent) event;

        checkArgument (cancellableEvent.isCancelled ());

    }

    handleEvents (event, true);


}
