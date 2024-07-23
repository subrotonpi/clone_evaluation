public static void main (String args []) {
 // EOL Comment
    String s1 = "a b c";

    int s1_length = s1.length ();

    System.out.println (s1_length);

    String s2 = s1.replace (" ", "");

    int s2_length = s2.length ();

    System.out.println (s2_length);

    System.out.println ("No of spaces = " + (s1_length - s2_length));

}
