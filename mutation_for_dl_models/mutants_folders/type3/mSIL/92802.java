public static String replacer (StringBuffer outBuffer,X1) {

    String data = outBuffer.toString ();

    try {

        data = data.replaceAll ("%(?![0-9a-fA-F]{2})", "%25");

        data = data.replaceAll ("\\+", "%2B");

        data = URLDecoder.decode (data, "utf-8");

    } catch (Exception e) {

        e.printStackTrace ();

    }

    return data;

}
