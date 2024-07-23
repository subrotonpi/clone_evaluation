public void shuffle (String input) {

    List < Character > characters = new ArrayList < Character > ();

    for (char c : input.toCharArray ()) {

        characters.add (c);

    }

    StringBuilder output = new StringBuilder (input.length ());

    while (characters.size () != 0) {

        int randPicker = (int) (Math.random () * characters.size ());

        output.append (characters.remove (randPicker));

    } // EOL Comment

    System.out.println (output.toString ());

}
