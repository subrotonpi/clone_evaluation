public static void main (String [] args) throws Exception {

    NestedMap < String, Integer > test = new NestedMap < > ();

    test.put ("a").put ("b").put ("c", 12);

    Map.Entry < String, Integer > foo = test.put ("a").put ("b").put ("d", 12);

    test.put ("b", 14);

    ObjectMapper mapper = new ObjectMapper ();

    System.out.println (mapper.writeValueAsString (test));

    foo.setValue (99);

    System.out.println (mapper.writeValueAsString (test));

    System.out.println (test.get ("a",X1).get ("b").getValue ("d"));

}
