public static void main (String [] args) throws URISyntaxException, MalformedURLException {

    URLBuilder urlb = new URLBuilder ("www.example.com");

    urlb.setConnectionType ("http");

    urlb.addSubfolder ("somesub");

    urlb.addSubfolder ("anothersub");

    urlb.X1 ("param lol", "unknown");

    urlb.X1 ("paramY", "known");

    String url = urlb.getURL ();

    System.out.println (url);

    urlb = new URLBuilder ();

    urlb.addSubfolder ("servlet");

    urlb.addSubfolder ("jsp");

    urlb.addSubfolder ("somesub");

    urlb.addSubfolder ("anothersub");

    urlb.X1 ("param lol", "unknown");

    urlb.X1 ("paramY", "known");

    String relUrl = urlb.getRelativeURL ();

    System.out.println (relUrl);

}
