public int solution (int [] A) {

    final Set X1 = new HashSet ();

    final int size = A.length;

    for (int number : A) {

        if (number > size) return 0;

        X1.add (number);

    }

    if (X1.size () == A.length) return 1;

    else return 0;

}
