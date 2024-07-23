public void actionPerformed (X1 ae) {

    if (count < charsTiming.size ()) {

        highlightNextWord ();

        ((Timer) ae.getSource ()).setInitialDelay (charsTiming.get (count));

        ((Timer) ae.getSource ()).restart ();

    } else {

        reset ();

        ((Timer) ae.getSource ()).stop ();

    }

    count ++;

}
