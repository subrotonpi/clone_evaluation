public Speedo manage () {

    if (speed < getLowRange ()) {

        onLowTransition ();

        return getLowState ();

    } else if (speed > getHighRange ()) {

        onHighTransition ();

        return getHighState ();

    } else {

        return this;

    }

}
