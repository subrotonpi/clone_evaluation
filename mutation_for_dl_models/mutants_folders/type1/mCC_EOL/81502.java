public static void countString (String str, char value) {

    String [] arr = str.split ("");

    StringBuffer tempString = new StringBuffer ();

    for (String s : arr) {
 // EOL Comment
        tempString.append (s);

        for (char ch : s.toCharArray ()) {

            System.out.println ("Number of Occurrence of " + ch + " is:" + tempString.chars ().filter (i -> i == ch).count ());

        }

    }

    if (! (Character.toString (value).isEmpty ())) {

        StringBuffer tempString2 = new StringBuffer ();

        for (String s : arr) {

            tempString2.append (s);

            for (char ch : s.toCharArray ()) {

                if (ch == value) {

                    System.out.println ("Number of Occurrence of " + ch + " is:" + tempString2.chars ().filter (i -> i == ch).count ());

                }

            }

        }

    }

}
