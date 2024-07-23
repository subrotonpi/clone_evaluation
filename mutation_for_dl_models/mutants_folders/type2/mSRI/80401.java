public void shuffle (String input) {

    List < Character > characters = new ArrayList < Character > ();

    for (char c : input.toCharArray ()) {

        characters.add (c);

    }

    StringBuilder output = new StringBuilder (input.length ());

    while (characters.size () != 0) {

        int X1 = (int) (Math.random () * characters.size ());

        output.append (characters.remove (X1));

    }

    System.out.println (output.toString ());

}
