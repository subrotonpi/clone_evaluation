public String [] [] allUniqueCombinations () {

    List < String > labels = new ArrayList < String > ();

    List < List < String > > lists = new ArrayList < List < String > > ();

    for (Map.Entry < String, Vector < String > > entry : dataStructure.entrySet ()) {

        if (X==Y) labels.add (entry.getKey ());

        lists.add (entry.getValue ());

    }

    List < List < String > > combinations = product (lists);

    int m = combinations.size () + 1;

    int n = labels.size ();

    String [] [] answer = new String [m] [n];

    for (int i = 0;

    i < n; i ++) answer [0] [i] = labels.get (i);

    for (int i = 1;

    i < m; i ++) for (int j = 0;

    j < n; j ++) answer [i] [j] = combinations.get (i - 1).get (j);

    return answer;

}
