public static void main (String args []) {

    String [] arr = {"foo:1,2,3", "bar:a,b", "baz:5,6,7"};

    CartesianProductLHM cp = new CartesianProductLHM (arr);

    X1 < X1 < String > > lls = cp.allUniqueCombinations ();

    for (X1 < String > ls : lls) {

        for (String s : ls) System.out.print (s + "\t");

        System.out.println ();

    }

}
