public static void countString (String X1, char searchKey) {

    String count = "";

    for (int i = 0;

    i < X1.length (); i ++) {

        if (X1.charAt (i) == searchKey) count += X1.charAt (i) + "\n";

    }

    System.out.println (count + "\nNumber of Occurrence of " + searchKey + " is " + count.length () + " in string " + X1);

}
