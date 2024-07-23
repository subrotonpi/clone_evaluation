public Comparable [] findCommonElements (){

    Set < Comparable > collectionSet1 = new HashSet < > (Arrays.asList (collection1));

    Set < Comparable > collectionSet2 = new HashSet < > (Arrays.asList (collection2));

    for (Comparable x : collectionSet1) {

        if (! collectionSet2.add (x)) {

            commonStuff.add (x);

        }

    }

    return commonStuff.toArray ();

}
