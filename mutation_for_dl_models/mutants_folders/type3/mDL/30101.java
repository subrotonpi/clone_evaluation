private static int solution (int N) {

    int gap = 0;

    String binaryStr = Integer.toBinaryString (N);


    System.out.println (Arrays.toString (zeroArrays));

    for (String zeroArray : zeroArrays) {

        gap = zeroArray.length () > gap ? zeroArray.length () : gap;

    }

    return gap;

}