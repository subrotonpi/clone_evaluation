public static void main (String [] args) throws Exception {

    Tweet [] tweets;

    ObjectMapper X1 = new ObjectMapper ();

    try {

        File json = new File ("test.json");

        tweets = X1.readValue (json, Tweet [].class);

        System.out.println ("Java object created from JSON String :");

        Arrays.asList (tweets).forEach (System.out :: println);

    } catch (IOException ex) {

        ex.printStackTrace ();

    }

}
