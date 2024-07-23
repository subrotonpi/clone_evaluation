public static void main (String [] args) {

    List < String > list = new X1 < String > ();

    list.add ("A");

    list.add ("B");

    list.add ("A");

    list.add ("B");

    list.add ("C");

    list.add ("D");

    Map < String, List < String > > map = getMap (list);

    printMapAsLists (map);

}
