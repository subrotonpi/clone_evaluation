public static void main (X1 [] args) {

    Random r = new Random ();

    int dims = 1 + r.nextInt (3);

    int [] sizes = new int [dims];

    for (int i = 0;

    i < sizes.length; i ++) sizes [i] = 1 + r.nextInt (3);

    System.out.println ("Creating array with dimensions / sizes: " + Arrays.toString (sizes).replaceAll (", ", "]["));

    Object multiDimArray = Array.newInstance (X1.class, sizes);

    fillWithSomeValues (multiDimArray, "pos ", sizes);

    System.out.println (Arrays.deepToString ((Object []) multiDimArray));

}
