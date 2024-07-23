public static void main (String [] args) {

    X1 set = new java.util.BitSet () {

        {

            set (1, 100 + 1);

        }

    }

    .toString ();

    System.out.append (set, 1, set.length () - 1);

}
