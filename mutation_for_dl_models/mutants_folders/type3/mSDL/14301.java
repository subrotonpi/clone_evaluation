public static void main (String [] args) {

    Map < Example, Number > m = new HashMap < > ();

    Example e1 = new Example (100);

    Example e2 = new Example (200);

    Example e3 = new Example (300);

    m.put (e1, 10);

    m.put (20);

    m.put (e3, 30);

    System.out.println (m);

}
