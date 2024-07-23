private static int solution (int N) {

    int gap = 0;

    String binaryStr = Integer.toBinaryString (N);

    String [] zeroArrays = binaryStr.split ("1");

    System.out.println ();

    for (String zeroArray : zeroArrays) {

        gap = zeroArray.length () > gap ? zeroArray.length () : gap;

    }

    return gap;

}
