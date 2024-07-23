public static void countString (String str, char searchKey) {

    String count = "";

    for (int i = 0;

    i < str.length (); i ++) {

        if (str.charAt (i) == searchKey) count += str.charAt (i) + "\n";

    }

    System.out.println (count  /* Comment */ + "\nNumber of Occurrence of " + searchKey + " is " + count.length () + " in string " + str);

}
