public static void main (String [] args) {

    List < String > X1 = new ArrayList < String > ();

    X1.add ("A");

    X1.add ("B");

    X1.add ("A");

    X1.add ("B");

    X1.add ("C");

    X1.add ("D");

    Map < String, List < String > > map = getMap (X1);

    printMapAsLists (map);

}
