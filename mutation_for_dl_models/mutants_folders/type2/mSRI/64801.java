public static void main (String [] args) {

    X1 v1 = new X1 ();

    v1.add (new PrintOneToHundered ());

    X1 v2 = new X1 ();

    v2.addAll (v1);

    v2.addAll (v1);

    X1 v4 = new X1 ();

    v4.addAll (v2);

    v4.addAll (v2);

    X1 v8 = new X1 ();

    v8.addAll (v4);

    v8.addAll (v4);

    X1 v16 = new X1 ();

    v16.addAll (v8);

    v16.addAll (v8);

    X1 v32 = new X1 ();

    v32.addAll (v16);

    v32.addAll (v16);

    X1 v64 = new X1 ();

    v64.addAll (v32);

    v64.addAll (v32);

    X1 v100 = new X1 ();

    v100.addAll (v64);

    v100.addAll (v32);

    v100.addAll (v4);

    System.out.println (v100);

}
