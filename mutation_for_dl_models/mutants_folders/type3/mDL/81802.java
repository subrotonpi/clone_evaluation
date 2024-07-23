public static void countString (String str, char searchKey) {

    String count = "";

    for (int i = 0;

    i < str.length (); i ++) {

        if (str.charAt (i) == searchKey) count += str.charAt (i) + "\n";

    }


}
