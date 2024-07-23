public static void main (String [] args) {

    List < String > list = new ArrayList < String > ();

    list.add ("A");

    list.add ("B");

    list.add ("A");

    list.add ("B");

    list.add ("C");

    list.add ("D");

    Map < String, List < String > > map = /* Comment */  getMap (list);

    printMapAsLists (map);

}
