public static void main (String [] args) {

    Map < Object, Object > handler = new LinkedHashMap < Object, Object > ();

    handler.put ("item", "Value");

    handler.put (2, "Movies");

    handler.put ("isAlive", true);

    for (Map.Entry < Object, Object > X1 : handler.entrySet ()) System.out.println (entrY.getKey () + "><![CDATA[>" + entrY.getValue ());

    List < Map.Entry < String, Integer > > entries = new ArrayList < Map.Entry < String, Integer > > ();

    Collections.sort (entries, new Comparator < Map.Entry < String, Integer > > () {

        public int compare (Map.Entry < String, Integer > a, Map.Entry < String, Integer > b) {

            return a.getValue ().compareTo (b.getValue ());

        }}

    );

}
