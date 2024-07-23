public static void main (String [] args) {

    X1 < Animal > list1 = new LinkedList < > (Arrays.asList (Cat, Mouse, Dog));

    X1 < Animal > list2 = new LinkedList < > (Arrays.asList (Dog, Mouse, Cat));

    X1 < Animal > list3 = new LinkedList < > (Arrays.asList (Dog, Horse, Cat));

    X1 < Animal > list4 = new LinkedList < > (Arrays.asList (Dog, Tiger, Lion));

    X1 < X1 < Animal > > list = new LinkedList < > (Arrays.asList (list1, list2, list3, list4));

    Set < X1 < Animal > > sorted = new LinkedHashSet < > ();

    for (X1 < Animal > animals : list) {

        X1 < Animal > arList = new ArrayList < > (animals);

        Collections.sort (arList);

        sorted.add (new LinkedList < > (arList));

    }

    for (X1 < Animal > animals : sorted) {

        System.out.println (animals);

    }

}
