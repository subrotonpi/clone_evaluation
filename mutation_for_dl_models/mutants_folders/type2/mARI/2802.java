public Speedo X1 (int speed) {

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
