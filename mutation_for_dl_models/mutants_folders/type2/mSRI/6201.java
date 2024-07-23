public static void main (String [] args) {

    Integer [] X1 = new Integer [1000];

    for (int i = 0;

    i < X1.length; i ++) {

        X1 [i] = i;

    }

    Collections.shuffle (Arrays.asList (X1));

    System.out.println (Arrays.toString (X1));

}
