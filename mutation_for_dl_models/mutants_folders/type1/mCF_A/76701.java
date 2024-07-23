public int solution (int [] A) {

 
   final Set perm = new HashSet ();

    final int size = A.length;

    for (int number : A) {

        if (number > size) return 0;

        perm.add (number);

    }

    if (perm.size () == A.length) return 1;

    else return 0;

}
