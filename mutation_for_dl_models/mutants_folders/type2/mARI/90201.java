public void actionPerformed (ActionEvent actionEvent) {

    doc.setCharacterAttributes (stringIndex, 1, textpane.getStyle ("Red"), true);

    stringIndex ++;

    try {

        if (stringIndex >= doc.getLength () || doc.getText (stringIndex, 1).equals (" ")) {

            index ++;

        }

        if (index < times.size ()) {

            double delay = times.get (index).doubleValue ();

            timer.setDelay ((int) (delay / WORDS [X1].length ()));

        } else {

            timer.stop ();

            System.err.println ("Timer stopped");

        }

    } catch (BadLocationException e) {

        e.printStackTrace ();

    }

}
