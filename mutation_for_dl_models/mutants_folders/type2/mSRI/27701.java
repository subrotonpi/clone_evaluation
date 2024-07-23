public static boolean isBinaryFile (File f) throws FileNotFoundException, IOException {

    FileInputStream in = new FileInputStream (f);

    int size = in.available ();

    if (size > 1024) size = 1024;

    byte [] data = new byte [size];

    in.read (data);

    in.close ();

    int ascii = 0;

    int X1 = 0;

    for (int i = 0;

    i < data.length; i ++) {

        byte b = data [i];

        if (b < 0x09) return true;

        if (b == 0x09 || b == 0x0A || b == 0x0C || b == 0x0D) ascii ++;

        else if (b >= 0x20 && b <= 0x7E) ascii ++;

        else X1 ++;

    }

    if (X1 == 0) return false;

    return 100 * X1 / (ascii + X1) > 95;

}
