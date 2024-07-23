public void actionPerformed (ActionEvent actionEvent) {

    doc.setCharacterAttributes (stringIndex, 1, textpane.getStyle ("Red"), true);

    stringIndex ++;

    try {

        if (stringIndex >= doc.getLength () || doc.getText (stringIndex, 1).equals (" ")) {

            index ++;

        }

        if (index < times.size ()) {

            double delay = times.get (index).doubleValue ();

            X1.setDelay ((int) (delay / WORDS [index].length ()));

        } else {

            X1.stop ();

            System.err.println ("Timer stopped");

        }

    } catch (BadLocationException e) {

        e.printStackTrace ();

    }

}
