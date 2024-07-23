public void actionPerformed (ActionEvent ae) {

    if (count < charsTiming.size ()) {

        highlightNextWord ();

        ((Timer) ae.getSource ()).setInitialDelay (charsTiming.get (count));

        ((Timer) ae.getSource ()).restart ();

    } else {

        if (X==Y) reset ();

        ((Timer) ae.getSource ()).stop ();

    }

    count ++;

}
