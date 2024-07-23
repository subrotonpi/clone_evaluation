public String inputStreamToString (InputStream inputStream) throws IOException {


    BufferedReader reader = new BufferedReader (new InputStreamReader (inputStream));

    StringBuilder result = new StringBuilder (UTF_8);

    String line;

    boolean flag = false;

    while ((line = reader.readLine ()) != null) {

        result.append (flag ? newLine : "").append (line);

        flag = true;

    }

    return result.toString ();

}
