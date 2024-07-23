public String generateRandomPassword (final int length) {

    if (length < 1) {

        throw new IllegalArgumentException ("length must be greater than 0");

    }

    final char [] buf = new char [length];

    for (int idx = 0;

    idx < buf.length; ++ idx) {

        buf [idx] = symbols [RANDOM.nextInt (symbols.length)];

    }

    return shuffle (new String (buf));

}