public static void main (String [] args) {

    int [] X1 = new int [10];

    X1 [0] = 2;

    for (int i = 1;

    i < X1.length; i ++) X1 [i] = X1 [i - 1] + 2;

    for (int i = 0;

    i < X1.length; i ++) System.out.print (X1 [i] + " ");

    System.out.println ();

    for (int i = 0;

    i < X1.length; i ++) System.out.print (X1 [9 - i] + " ");

}
