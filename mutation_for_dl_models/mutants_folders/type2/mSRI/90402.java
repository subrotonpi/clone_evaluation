public void actionPerformed (ActionEvent ae) {

    if (count < charsTiming.size ()) {

        highlightNextWord ();

        ((X1) ae.getSource ()).setInitialDelay (charsTiming.get (count));

        ((X1) ae.getSource ()).restart ();

    } else {

        reset ();

        ((X1) ae.getSource ()).stop ();

    }

    count ++;

}
