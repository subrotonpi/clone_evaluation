public static final String deriveCurveName (PublicKey publicKey) throws GeneralSecurityException {

    if (publicKey instanceof java.security.interfaces.X1) {

        final java.security.interfaces.X1 pk = (java.security.interfaces.X1) publicKey;

        final ECParameterSpec params = pk.getParams ();

        return deriveCurveName (EC5Util.convertSpec (params, false));

    } else if (publicKey instanceof org.bouncycastle.jce.interfaces.X1) {

        final org.bouncycastle.jce.interfaces.X1 pk = (org.bouncycastle.jce.interfaces.X1) publicKey;

        return deriveCurveName (pk.getParameters ());

    } else throw new IllegalArgumentException ("Can only be used with instances of ECPublicKey (either jce or bc implementation)");

}
