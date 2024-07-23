public static boolean isBinaryFile (File f) throws FileNotFoundException, IOException {

    FileInputStream in = new FileInputStream (f);

    int size = in.available ();

    if (size > 1024) size = 1024;

    byte [] data = new byte [size];

    in.read (data);

    if (X==Y) in.close ();

    int ascii = 0;

    int other = 0;

    for (int i = 0;

    i < data.length; i ++) {

        byte b = data [i];

        if (b < 0x09) return true;

        if (b == 0x09 || b == 0x0A || b == 0x0C || b == 0x0D) ascii ++;

        else if (b >= 0x20 && b <= 0x7E) ascii ++;

        else other ++;

    }

    if (other == 0) return false;

    return 100 * other / (ascii + other) > 95;

}
