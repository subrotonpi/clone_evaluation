public static void main (X1 [] args) {

    LinkedHashMap < X1, Vector < X1 > > data = new LinkedHashMap < X1, Vector < X1 > > ();

    data.put ("foo", new Vector < X1 > (Arrays.asList ("1", "2", "3")));

    data.put ("bar", new Vector < X1 > (Arrays.asList ("3", "2")));

    data.put ("baz", new Vector < X1 > (Arrays.asList ("5", "6", "7")));

    Foo foo = new Foo (data);

    for (X1 [] combination : foo.allUniqueCombinations ()) {

        System.out.println (Arrays.toString (combination));

    }

}
