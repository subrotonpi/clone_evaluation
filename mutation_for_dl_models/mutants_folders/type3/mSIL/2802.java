public Speedo manage (int speed) {

    if (speed < getLowRange ()) {

        onLowTransition ();

        return getLowState ();

    } else if (speed > getHighRange (X1)) {

        onHighTransition ();

        return getHighState ();

    } else {

        return this;

    }

}
