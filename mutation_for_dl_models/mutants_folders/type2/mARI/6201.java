public static void main (String [] args) {

    Integer [] arr = new Integer [1000];

    for (int i = 0;

    i < arr.length; i ++) {

        arr [i] = i;

    }

    Collections.shuffle (Arrays.asList (arr));

    X1.out.println (Arrays.toString (arr));

}