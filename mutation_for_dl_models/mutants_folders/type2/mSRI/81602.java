public static void countString (String str, char searchKey) {

    String X1 = "";

    for (int i = 0;

    i < str.length (); i ++) {

        if (str.charAt (i) == searchKey) X1 += str.charAt (i) + "\n";

    }

    System.out.println (X1 + "\nNumber of Occurrence of " + searchKey + " is " + X1.length () + " in string " + str);

}
