public static void main (String [] args) throws Exception {

    NestedMap < String, Integer > test = new NestedMap < > ();

    test.put ("a").put ("b").put ("c", 12);

    Map.Entry < String, Integer > foo = test.put ("a").put ("b").put ("d", 12);

    test.put ("b", 14);

    ObjectMapper X1 = new ObjectMapper ();

    System.out.println (X1.writeValueAsString (test));

    foo.setValue (99);

    System.out.println (X1.writeValueAsString (test));

    System.out.println (test.get ("a").get ("b").getValue ("d"));

}
