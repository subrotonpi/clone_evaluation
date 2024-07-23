public static void main (String [] args) {

    for (int X1 = 1;

    X1 < 16; ++ X1) {

        if ((X1 & 1) > 0) System.out.print ("A");

        if ((X1 & 2) > 0) System.out.print ("B");

        if ((X1 & 4) > 0) System.out.print ("C");

        if ((X1 & 8) > 0) System.out.print ("D");

        System.out.println ("");

    }

}
