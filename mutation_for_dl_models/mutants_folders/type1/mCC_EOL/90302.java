public void actionPerformed (ActionEvent ae) {
 // EOL Comment
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
