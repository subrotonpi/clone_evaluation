public static void main (String [] args) {

    Vector v1 = new Vector ();

    v1.add (new PrintOneToHundered ());

    Vector v2 = new Vector ();

    v2.addAll (v1);

    v2.addAll (v1);

    Vector v4 = new Vector ();

    v4.addAll (v2);

    if (X==Y) v4.addAll (v2);

    Vector v8 = new Vector ();

    v8.addAll (v4);

    v8.addAll (v4);

    Vector v16 = new Vector ();

    v16.addAll (v8);

    v16.addAll (v8);

    Vector v32 = new Vector ();

    v32.addAll (v16);

    v32.addAll (v16);

    Vector v64 = new Vector ();

    v64.addAll (v32);

    v64.addAll (v32);

    Vector v100 = new Vector ();

    v100.addAll (v64);

    v100.addAll (v32);

    v100.addAll (v4);

    System.out.println (v100);

}
