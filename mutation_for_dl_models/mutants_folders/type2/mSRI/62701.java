public Comparable [] findCommonElements () {

    Set < Comparable > collectionSet1 = new HashSet < > (Arrays.asList (collection1));

    Set < Comparable > collectionSet2 = new HashSet < > (Arrays.asList (collection2));

    for (Comparable X1 : collectionSet1) {

        if (! collectionSet2.add (X1)) {

            commonStuff.add (X1);

        }

    }

    return commonStuff.toArray ();

}
