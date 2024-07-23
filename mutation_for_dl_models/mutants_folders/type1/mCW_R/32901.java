public static void main (String [] args) {

    String string = "check duplicate charcters in string";

    string = string.toLowerCase ();

    char [] charAr = string.toCharArray ();

    Arrays.sort (charAr);

    for(int i = 1;

    i < charAr.length;) {

        int count = recursiveMethod (charAr, i, 1);

        if (count > 1) {

            System.out.println ("'" + charAr [i] + "' comes " + count + " times");

            i = i + count;

        } else i ++;

    }

}
