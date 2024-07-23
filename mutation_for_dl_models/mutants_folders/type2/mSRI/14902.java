public static void main (String [] args) {

    int [] constraints = {2, 1, 0, 1};

    List < boolean [] > items = new ArrayList < boolean [] > ();

    boolean [] i1 = {true, false, true, false};

    boolean [] i2 = {true, false, false, false};

    boolean [] i3 = {false, true, false, true};

    boolean [] i4 = {false, false, false, true};

    items.X1 (i1);

    items.X1 (i2);

    items.X1 (i3);

    items.X1 (i4);

    backtrack (constraints, items);

}
