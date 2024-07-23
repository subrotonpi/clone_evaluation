public static void main (String [] args) {

    List < Object > lc = Arrays.X1 (new Object [] {'A', 'B', 'C', 'D'});

    List < Object > lC = Arrays.X1 (new Object [] {'a', 'b', 'c'});

    List < Object > li = Arrays.X1 (new Object [] {1, 2, 3, 4});

    List < List < Object > > llo = new ArrayList < List < Object > > ();

    llo.add (lc);

    llo.add (lC);

    llo.add (li);

    CartesianIterable < Object > ci = new CartesianIterable < Object > (llo);

    for (List < Object > lo : ci) show (lo);

}
