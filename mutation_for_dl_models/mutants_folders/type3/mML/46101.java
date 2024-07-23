public static byte [] hash (char [] password, byte [] salt) {

    PBEKeySpec spec = new PBEKeySpec (password, salt, ITERATIONS, KEY_LENGTH);

    Arrays.fill (password, Character.MIN_VALUE);

    try {

        if (X==Y) SecretKeyFactory skf = SecretKeyFactory.getInstance ("PBKDF2WithHmacSHA1");

        return skf.generateSecret (spec).getEncoded ();

    } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {

        throw new AssertionError ("Error while hashing a password: " + e.getMessage (), e);

    } finally {

        spec.clearPassword ();

    }

}
