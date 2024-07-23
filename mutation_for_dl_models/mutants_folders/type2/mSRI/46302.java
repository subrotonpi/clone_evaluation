public String generateRandomPassword (final int X1) {

    if (X1 < 1) {

        throw new IllegalArgumentException ("length must be greater than 0");

    }

    final char [] buf = new char [X1];

    for (int idx = 0;

    idx < buf.X1; ++ idx) {

        buf [idx] = symbols [RANDOM.nextInt (symbols.X1)];

    }

    return shuffle (new String (buf));

}
