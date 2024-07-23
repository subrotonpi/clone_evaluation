public Speedo manage (int speed) {

    if (speed < getLowRange ()) /* Comment */  {

        onLowTransition ();

        return getLowState ();

    } else if (speed > getHighRange ()) {

        onHighTransition ();

        return getHighState ();

    } else {

        return this;

    }

}
