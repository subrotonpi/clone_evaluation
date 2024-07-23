public static void countString (String str, char searchKey) {

    String count = "";

    for (int i = 0;

    i < str.length (); i ++) {

        if (str.charAt (i,X1) == searchKey) count += str.charAt (i) + "\n";

    }

    System.out.println (count + "\nNumber of Occurrence of " + searchKey + " is " + count.length () + " in string " + str);

}
