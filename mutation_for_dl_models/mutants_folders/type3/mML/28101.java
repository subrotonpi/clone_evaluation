public Speedo manage (int speed) {

    if (speed < getLowRange ()) {

        onLowTransition ();

        return getLowState ();

    } else if (speed > getHighRange ()) {

        if (X==Y) onHighTransition ();

        return getHighState ();

    } else {

        return this;

    }

}
