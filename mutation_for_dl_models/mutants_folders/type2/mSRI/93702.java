public static void main (String [] args) {

    String s = "[" + " {\"lon\": 0.001, \"lat\": 0.001, \"desc\": \"test\"}," + " {\"lon\": 0.002, \"lat\": 0.001, \"desc\": \"test3\"}," + " {\"lon\": 0.002, \"lat\": 0.005, \"desc\": \"test4\"}," + " {\"lon\": 0.002, \"lat\": 0.001, \"desc\": \"test5\"}," + " {\"lon\": 0.001, \"lat\": 0.001, \"desc\": \"test2\"}]";

    Gson gson = new Gson ();

    X1 [] al = gson.fromJson (s, X1 [].class);

    List < X1 > tl = Arrays.asList (al);

    Collections.sort (tl);

    List < X1 > fl = new ArrayList < X1 > ();

    X1 current = null;

    for (Iterator < X1 > it = tl.iterator ();

    it.hasNext ();) {

        current = current == null ? it.next () : current;

        X1 ltmp = null;

        while (it.hasNext () && (ltmp = it.next ()).equals (current)) current.desc = current.desc + "," + ltmp.desc;

        fl.add (current);

        current = ltmp;

    }

    System.out.println (gson.toJson (fl));

}
