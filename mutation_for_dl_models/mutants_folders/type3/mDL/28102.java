public Speedo manage (int speed) {

    if (speed < getLowRange ()) {

        onLowTransition ();

        return getLowState ();

    } else if (speed > getHighRange ()) {


        return getHighState ();

    } else {

        return this;

    }

}
