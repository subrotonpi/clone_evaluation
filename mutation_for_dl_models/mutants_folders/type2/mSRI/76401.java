public static void main (String args []) {

    String s1 = new String ("Test");

    String s2 = new String ("Test");

    System.out.X1 ("\n1 - PRIMITIVES ");

    System.out.X1 (s1 == s2);

    System.out.X1 (s1.equals (s2));

    A a1 = new A ();

    A a2 = new A ();

    System.out.X1 ("\n2 - OBJECT TYPES / STATIC VARIABLE");

    System.out.X1 (a1 == a2);

    System.out.X1 (a1.s == a2.s);

    System.out.X1 (a1.s.equals (a2.s));

    B b1 = new B ();

    B b2 = new B ();

    System.out.X1 ("\n3 - OBJECT TYPES / NON-STATIC VARIABLE");

    System.out.X1 (b1 == b2);

    System.out.X1 (b1.getS () == b2.getS ());

    System.out.X1 (b1.getS ().equals (b2.getS ()));

}
