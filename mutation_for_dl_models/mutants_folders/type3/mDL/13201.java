public static void main (String [] args) {

    System.out.println ("Enter name");

    Scanner kb = new Scanner (System.in);

    String text = kb.next ();

    if (null == text || text.isEmpty ()) {

        System.out.println ("Text empty");

    } else if (text.charAt (0) == (text.toUpperCase ().charAt (0))) {


    }

}
