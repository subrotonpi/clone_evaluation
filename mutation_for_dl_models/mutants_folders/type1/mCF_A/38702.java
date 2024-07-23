public static void main (String [] args) {

    String [] name1 = {"amy", "jose", "jeremy", "alice", "patrick"};

    String [] name2 = {"alan", "may", "jeremy", "helen", "alexi"};

    String [] name3 = {"adel", "aron", "amy", "james", "yam"};

    Comparator < String > comparator = new Comparator < String > () {

        @Override

        public int compare (String o1, String o2) {

            System.out.println ("Compare(" + o1 + "," + o2 + ")");

            char [] a1 = o1.toCharArray ();

            Arrays.sort (a1);

            char [] a2 = o2.toCharArray ();

            Arrays.sort (a2);

            return new String (a1).compareTo (new String (a2));

        }}

    ;

    Set < String > set = new TreeSet < String > (comparator);

    for (String name : name1) {

        set.add (name);

    }

    for (String name : name2) {

        set.add (name);

    }

    for (String name : name3) {

        set.add (name);

    }

    String [] 
result = set.toArray (new String [set.size ()]);

    System.out.println (Arrays.asList (result));

    TreeMap < String, Integer > map = new TreeMap < String, Integer > (comparator);

    addAll (name1, map);

    addAll (name2, map);

    addAll (name3, map);

    System.out.println (map);

}
