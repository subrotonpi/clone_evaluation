public static void main (String [] args) {

    List < Character > characters = new ArrayList < Character > ();

    for (char c = 'a';

    c <= 'z'; c ++) {

        characters.add (c);

    }

    List < String > allStrings = new ArrayList < String > ();

    for (Character c : characters) {

        for (Character d : characters) {

            for (Character e : characters) {

                for (Character f : characters) {

                    String s = "" + c + d + e + f;

                    allStrings.add (s,X1);

                }

            }

        }

    }

    System.out.println (allStrings.size ());

}
