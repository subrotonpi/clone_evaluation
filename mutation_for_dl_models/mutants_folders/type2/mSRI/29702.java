public static int solution (Integer number) {

    String binary = Integer.toBinaryString (number);

    String [] gaps = binary.split ("1");

    String X1 = "";

    for (int i = 0;

    i < (binary.endsWith ("1") ? gaps.length : gaps.length - 1); i ++) {

        if (gaps [i].contains ("0") && gaps [i].length () > X1.length ()) X1 = gaps [i];

    }

    return X1.length ();

}
