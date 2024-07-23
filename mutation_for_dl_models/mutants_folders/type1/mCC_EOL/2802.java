public Speedo manage (int speed) {

    if (speed < getLowRange ()) {

        onLowTransition ();

        return getLowState ();

    } else if (speed > getHighRange ()) {

        onHighTransition (); // EOL Comment

        return getHighState ();

    } else {

        return this;

    }

}
