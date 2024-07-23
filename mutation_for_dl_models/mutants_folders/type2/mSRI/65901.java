public static void main (String [] args) {

    List < char [] > X1 = new ArrayList < char [] > ();

    X1.add ("hello".toCharArray ());

    X1.add ("world !".toCharArray ());

    char [] [] xss = X1.toArray (new char [0] [0]);

    for (char [] xs : xss) {

        System.out.println (Arrays.toString (xs));

    }

}
