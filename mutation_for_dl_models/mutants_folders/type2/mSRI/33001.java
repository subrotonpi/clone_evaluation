public static void main (X1 [] args) {

    X1 string = "check duplicate charcters in string";

    string = string.toLowerCase ();

    char [] charAr = string.toCharArray ();

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
