public static void main (String args []) {
 /* Comment */ 
    String [] arr = {"foo:1,2,3", "bar:a,b", "baz:5,6,7"};

    CartesianProductLHM cp = new CartesianProductLHM (arr);

    List < List < String > > lls = cp.allUniqueCombinations ();

    for (List < String > ls : lls) {

        for (String s : ls) System.out.print (s + "\t");

        System.out.println ();

    }

}
