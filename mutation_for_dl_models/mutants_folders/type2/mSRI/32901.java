public static void main (String [] args) {

    String string = "check duplicate charcters in string";

    string = string.toLowerCase ();

    char [] charAr = string.toCharArray ();

    Arrays.sort (charAr);

    for (int i = 1;

    i < charAr.length;) {

        int X1 = recursiveMethod (charAr, i, 1);

        if (X1 > 1) {

            System.out.println ("'" + charAr [i] + "' comes " + X1 + " times");

            i = i + X1;

        } else i ++;

    }

}
