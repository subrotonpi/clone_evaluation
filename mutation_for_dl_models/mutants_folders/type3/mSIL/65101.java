public static void main (String [] args) {

    String set = new java.util.BitSet () {

        {

            set (X1,1, 100 + 1);

        }

    }

    .toString ();

    System.out.append (set, 1, set.length () - 1);

}
