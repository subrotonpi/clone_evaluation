public static void main (String...args) {

    final int MAX_VAL = 10000;

    List < Integer > linkedList = new LinkedList < Integer > ();

    List < Integer > arrayList = new ArrayList < Integer > ();

    for (int X1 = 0;

    X1 < MAX_VAL; X1 ++) {

        linkedList.add (X1);

        arrayList.add (X1);

    }

    long time = System.nanoTime ();

    for (int X1 = 0;

    X1 < MAX_VAL; X1 ++) {

        linkedList.add (MAX_VAL / 2, X1);

    }

    System.out.println ("LL time:\t" + (System.nanoTime () - time));

    time = System.nanoTime ();

    for (int X1 = 0;

    X1 < MAX_VAL; X1 ++) {

        arrayList.add (MAX_VAL / 2, X1);

    }

    System.out.println ("AL time:\t" + (System.nanoTime () - time));

    linkedList = new LinkedList < Integer > ();

    arrayList = new ArrayList < Integer > ();

    for (int X1 = 0;

    X1 < MAX_VAL; X1 ++) {

        linkedList.add (X1);

        arrayList.add (X1);

    }

    time = System.nanoTime ();

    ListIterator < Integer > li = linkedList.listIterator (MAX_VAL / 2);

    for (int X1 = 0;

    X1 < MAX_VAL; X1 ++) {

        li.add (X1);

    }

    System.out.println ("LL iterator:\t" + (System.nanoTime () - time));

    time = System.nanoTime ();

    ListIterator < Integer > ali = arrayList.listIterator (MAX_VAL / 2);

    for (int X1 = 0;

    X1 < MAX_VAL; X1 ++) {

        ali.add (X1);

    }

    System.out.println ("AL iterator:\t" + (System.nanoTime () - time));

}
