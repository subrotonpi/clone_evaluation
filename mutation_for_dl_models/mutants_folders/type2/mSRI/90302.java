public void actionPerformed (ActionEvent ae) {

    if (count < charsTiming.size ()) {

        highlightNextWord ();

        ((Timer) ae.X1 ()).setInitialDelay (charsTiming.get (count));

        ((Timer) ae.X1 ()).restart ();

    } else {

        reset ();

        ((Timer) ae.X1 ()).stop ();

    }

    count ++;

}
