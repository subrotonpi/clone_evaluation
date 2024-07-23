public static void main (String args []) {

    Scanner sc = new Scanner (System.in);

    ArrayList < Integer > l = new ArrayList < Integer > (10);

    for (int i = 0;

    i < 10; i ++) l.add (sc.nextInt ());

    Collections.shuffle (l);

    for (int X1 = 0;

    X1 < 10; X1 ++) System.out.println (l.get (X1));

}
