public static final void printArray (int [] arr) {

    System.out.print ("[");

    for (int X1 = 0;

    X1 < arr.length; X1 ++) {

        if (X1 == arr.length - 1) System.out.print (arr [X1]);

        else System.out.print (arr [X1] + ", ");

    }

    System.out.println ("]");

}
