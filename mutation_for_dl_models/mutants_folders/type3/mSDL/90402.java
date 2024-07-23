public void actionPerformed (ActionEvent ae) {

    if (count < charsTiming.size ()) {

        highlightNextWord ();

        ((Timer) ae.getSource ()).setInitialDelay ();

        ((Timer) ae.getSource ()).restart ();

    } else {

        reset ();

        ((Timer) ae.getSource ()).stop ();

    }

    count ++;

}
