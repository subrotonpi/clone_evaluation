public static String replacer (StringBuffer outBuffer) {

    String data = outBuffer.toString ();

    try {

        data = data.replaceAll ("%(?![0-9a-fA-F]{2})", "%25");

        data = data.replaceAll ("\\+", "%2B");

        data = URLDecoder.decode (data, "utf-8");

    } catch (X1 e) {

        e.printStackTrace ();

    }

    return data;

}
