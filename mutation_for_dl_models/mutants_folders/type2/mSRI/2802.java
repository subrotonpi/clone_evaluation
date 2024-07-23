public Speedo manage (int X1) {

    if (X1 < getLowRange ()) {

        onLowTransition ();

        return getLowState ();

    } else if (X1 > getHighRange ()) {

        onHighTransition ();

        return getHighState ();

    } else {

        return this;

    }

}
