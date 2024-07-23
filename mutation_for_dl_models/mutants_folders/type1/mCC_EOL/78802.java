@Override

public void dispatchEvent (Event event) {

    checkNotNull (event);

    CancellableEvent cancellableEvent = null;

    boolean cancellable; // EOL Comment

    if (cancellable = event instanceof CancellableEvent) {

        cancellableEvent = (CancellableEvent) event;

        checkArgument (cancellableEvent.isCancelled ());

    }

    fireEvents (false, event, cancellableEvent, cancellable);

    fireEvents (true, event, cancellableEvent, cancellable);

}
