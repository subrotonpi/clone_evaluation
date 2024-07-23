@Override

public void dispatchEvent (Event X1) {

    checkNotNull (X1);

    CancellableEvent cancellableEvent = null;

    boolean cancellable;

    if (cancellable = X1 instanceof CancellableEvent) {

        cancellableEvent = (CancellableEvent) X1;

        checkArgument (cancellableEvent.isCancelled ());

    }

    fireEvents (false, X1, cancellableEvent, cancellable);

    fireEvents (true, X1, cancellableEvent, cancellable);

}
