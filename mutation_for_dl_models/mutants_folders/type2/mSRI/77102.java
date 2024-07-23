public static void main (String [] args) {

    Map < String, X1 > unSortedMap = new LinkedHashMap < String, X1 > ();

    unSortedMap.put ("A", 2);

    unSortedMap.put ("V", 1);

    unSortedMap.put ("G", 5);

    System.out.println ("Unsorted Map :\n");

    for (Map.Entry < String, X1 > entry : unSortedMap.entrySet ()) {

        System.out.println (entry.getKey () + "   " + entry.getValue ());

    }

    System.out.println ("\n");

    System.out.println ("Sorting Map Based on Keys :\n");

    Map < String, X1 > keySortedMap = new TreeMap < String, X1 > (unSortedMap);

    for (Map.Entry < String, X1 > entry : keySortedMap.entrySet ()) {

        System.out.println (entry.getKey () + "   " + entry.getValue ());

    }

    System.out.println ("\n");

    System.out.println ("Sorting Map Based on Values :\n");

    List < Entry < String, X1 > > entryList = new ArrayList < Entry < String, X1 > > (unSortedMap.entrySet ());

    Collections.sort (entryList, new Comparator < Entry < String, X1 > > () {

        @Override

        public int compare (Entry < String, X1 > obj1, Entry < String, X1 > obj2) {

            return obj1.getValue ().compareTo (obj2.getValue ());

        }}

    );

    unSortedMap.clear ();

    for (Entry < String, X1 > entry : entryList) {

        unSortedMap.put (entry.getKey (), entry.getValue ());

        System.out.println (entry.getKey () + "   " + entry.getValue ());

    }

}
