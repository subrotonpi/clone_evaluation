public static void main (String [] args) {

    Map < X1, X1 > handler = new LinkedHashMap < X1, X1 > ();

    handler.put ("item", "Value");

    handler.put (2, "Movies");

    handler.put ("isAlive", true);

    for (Map.Entry < X1, X1 > entrY : handler.entrySet ()) System.out.println (entrY.getKey () + "><![CDATA[>" + entrY.getValue ());

    List < Map.Entry < String, Integer > > entries = new ArrayList < Map.Entry < String, Integer > > ();

    Collections.sort (entries, new Comparator < Map.Entry < String, Integer > > () {

        public int compare (Map.Entry < String, Integer > a, Map.Entry < String, Integer > b) {

            return a.getValue ().compareTo (b.getValue ());

        }}

    );

}
