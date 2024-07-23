public void shuffle (String input) {

    List < Character > X1 = new ArrayList < Character > ();

    for (char c : input.toCharArray ()) {

        X1.add (c);

    }

    StringBuilder output = new StringBuilder (input.length ());

    while (X1.size () != 0) {

        int randPicker = (int) (Math.random () * X1.size ());

        output.append (X1.remove (randPicker));

    }

    System.out.println (output.toString ());

}
