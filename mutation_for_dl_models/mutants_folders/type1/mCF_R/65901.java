public static void main (String [] args) {

    List < char [] > list = new ArrayList < char [] > ();

    list.add ("hello".toCharArray ());

    list.add ("world !".toCharArray ());

    char [] [] xss = list.toArray (new char [0] [0]);
     for (char [] xs : xss) {

        System.out.println (Arrays.toString (xs));

    }

}
