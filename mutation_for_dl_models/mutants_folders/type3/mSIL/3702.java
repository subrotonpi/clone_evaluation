public static void main (String args [],X1) {

    Scanner sc = new Scanner (System.in);

    ArrayList < Integer > l = new ArrayList < Integer > (10);

    for (int i = 0;

    i < 10; i ++) l.add (sc.nextInt ());

    Collections.shuffle (l);

    for (int j = 0;

    j < 10; j ++) System.out.println (l.get (j));

}
