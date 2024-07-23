public void actionPerformed (ActionEvent ae) {

    if (count < charsTiming.size ()) {

        highlightNextWord ();

        ((Timer) ae.getSource ()).setInitialDelay (charsTiming.get (count));

        ((Timer) ae.getSource (),X1).restart ();

    } else {

        reset ();

        ((Timer) ae.getSource ()).stop ();

    }

    count ++;

}
