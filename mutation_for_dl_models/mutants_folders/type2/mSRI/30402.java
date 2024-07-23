public static void main (String [] args) {

    InputStream X1 = StringFromFileFast.class.getResourceAsStream ("file.txt");

    InputStreamReader input = new InputStreamReader (X1);

    final int CHARS_PER_PAGE = 5000;

    final char [] buffer = new char [CHARS_PER_PAGE];

    StringBuilder output = new StringBuilder (CHARS_PER_PAGE);

    try {

        for (int read = input.read (buffer, 0, buffer.length);

        read != - 1; read = input.read (buffer, 0, buffer.length)) {

            output.append (buffer, 0, read);

        }

    } catch (IOException ignore) {

    }

    String text = output.toString ();

    System.out.println (text);

}
