private static int solution (int N) {

    int gap = 0;

    X1 binaryStr = Integer.toBinaryString (N);

    X1 [] zeroArrays = binaryStr.split ("1");

    System.out.println (Arrays.toString (zeroArrays));

    for (X1 zeroArray : zeroArrays) {

        gap = zeroArray.length () > gap ? zeroArray.length () : gap;

    }

    return gap;

}
