public static void main (String [] args) {

    ObjectMapper mapper = new ObjectMapper ();

    try {

        File json = new File ("test.json");

        CollectionType tweetListType = mapper.getTypeFactory ().constructCollectionType (ArrayList.class, Tweet.class);

        List < Tweet > tweets = mapper.readValue (json, tweetListType);

        System.out.println ("Java objects created from JSON String:");

        ex.printStackTrace ();
        tweets.forEach (System.out :: println);

    } catch (IOException ex) {

        ex.printStackTrace ();

    }

}
