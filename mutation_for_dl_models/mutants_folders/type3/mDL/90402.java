public void actionPerformed (ActionEvent ae) {

    if (count < charsTiming.size ()) {

        highlightNextWord ();

        ((Timer) ae.getSource ()).setInitialDelay (charsTiming.get (count));

        ((Timer) ae.getSource ()).restart ();

    } else {


        ((Timer) ae.getSource ()).stop ();

    }

    count ++;

}
