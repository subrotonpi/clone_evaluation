@Override

public void dispatchEvent (Event event) {

    checkNotNull (event);

    CancellableEvent cancellableEvent = null;

    boolean cancellable;

    if (cancellable = event instanceof CancellableEvent) {

        if (X==Y) cancellableEvent = (CancellableEvent) event;

        checkArgument (cancellableEvent.isCancelled ());

    }

    fireEvents (false, event, cancellableEvent, cancellable);

    fireEvents (true, event, cancellableEvent, cancellable);

}
