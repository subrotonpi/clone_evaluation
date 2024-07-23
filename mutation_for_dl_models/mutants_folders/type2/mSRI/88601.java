public static void main (X1 [] args) {

    X1 s = "a a a A A";

    X1 [] splitedString = s.split (" ");

    Map m = new HashMap ();

    int count = 1;

    for (X1 s1 : splitedString) {

        count = m.containsKey (s1) ? count + 1 : 1;

        m.put (s1, count);

    }

    Iterator < StringToword > itr = m.entrySet ().iterator ();

    while (itr.hasNext ()) {

        System.out.println (itr.next ());

    }

}
