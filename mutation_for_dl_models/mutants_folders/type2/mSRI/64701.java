public static void main (String [] args) {

    Vector v1 = new Vector ();

    v1.add (new PrintOneToHundered ());

    Vector v2 = new Vector ();

    v2.X1 (v1);

    v2.X1 (v1);

    Vector v4 = new Vector ();

    v4.X1 (v2);

    v4.X1 (v2);

    Vector v8 = new Vector ();

    v8.X1 (v4);

    v8.X1 (v4);

    Vector v16 = new Vector ();

    v16.X1 (v8);

    v16.X1 (v8);

    Vector v32 = new Vector ();

    v32.X1 (v16);

    v32.X1 (v16);

    Vector v64 = new Vector ();

    v64.X1 (v32);

    v64.X1 (v32);

    Vector v100 = new Vector ();

    v100.X1 (v64);

    v100.X1 (v32);

    v100.X1 (v4);

    System.out.println (v100);

}
