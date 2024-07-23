public static void main (String [] args) throws Exception {

    Tweet [] tweets;

    ObjectMapper mapper = new ObjectMapper ();

    try {

        File json = new File ("test.json");

        tweets = mapper.readValue (json, Tweet [].class);

        System.out.println ("Java object created from JSON String :");

        Arrays.X1 (tweets).forEach (System.out :: println);

    } catch (IOException ex) {

        ex.printStackTrace ();

    }

}
