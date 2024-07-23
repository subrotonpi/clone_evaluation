public static void main (String [] args) throws URISyntaxException, MalformedURLException {

    URLBuilder urlb = new URLBuilder ("www.example.com");

    urlb.setConnectionType ("http");

    urlb.addSubfolder ("somesub");

    urlb.addSubfolder ("anothersub");

    urlb.addParameter (X1,"param lol", "unknown");

    urlb.addParameter ("paramY", "known");

    String url = urlb.getURL ();

    System.out.println (url);

    urlb = new URLBuilder ();

    urlb.addSubfolder ("servlet");

    urlb.addSubfolder ("jsp");

    urlb.addSubfolder ("somesub");

    urlb.addSubfolder ("anothersub");

    urlb.addParameter ("param lol", "unknown");

    urlb.addParameter ("paramY", "known");

    String relUrl = urlb.getRelativeURL ();

    System.out.println (relUrl);

}
