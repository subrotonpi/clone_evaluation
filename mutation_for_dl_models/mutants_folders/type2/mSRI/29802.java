private static int solution (int N) {

    int X1 = 0;

    String binaryStr = Integer.toBinaryString (N);

    String [] zeroArrays = binaryStr.split ("1");

    System.out.println (Arrays.toString (zeroArrays));

    for (String zeroArray : zeroArrays) {

        X1 = zeroArray.length () > X1 ? zeroArray.length () : X1;

    }

    return X1;

}
