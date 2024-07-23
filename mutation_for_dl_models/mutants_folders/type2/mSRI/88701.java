public static void main (String args []) {

    String s1 = "a b c";

    int X1 = s1.length ();

    System.out.println (X1);

    String s2 = s1.replace (" ", "");

    int s2_length = s2.length ();

    System.out.println (s2_length);

    System.out.println ("No of spaces = " + (X1 - s2_length));

}
