public static void main (String [] args) {

    String X1 = "check duplicate charcters in string";

    X1 = X1.toLowerCase ();

    char [] charAr = X1.toCharArray ();

    Arrays.sort (charAr);

    for (int i = 1;

    i < charAr.length;) {

        int count = recursiveMethod (charAr, i, 1);

        if (count > 1) {

            System.out.println ("'" + charAr [i] + "' comes " + count + " times");

            i = i + count;

        } else i ++;

    }

}
