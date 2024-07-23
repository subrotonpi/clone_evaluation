public static final String deriveCurveName (PrivateKey privateKey) throws GeneralSecurityException {

    if (privateKey instanceof java.security.interfaces.ECPrivateKey) {

        final java.security.interfaces.ECPrivateKey X1 = (java.security.interfaces.ECPrivateKey) privateKey;

        final ECParameterSpec params = X1.getParams ();

        return deriveCurveName (EC5Util.convertSpec (params, false));

    } else if (privateKey instanceof org.bouncycastle.jce.interfaces.ECPrivateKey) {

        final org.bouncycastle.jce.interfaces.ECPrivateKey X1 = (org.bouncycastle.jce.interfaces.ECPrivateKey) privateKey;

        return deriveCurveName (X1.getParameters ());

    } else throw new IllegalArgumentException ("Can only be used with instances of ECPrivateKey (either jce or bc implementation)");

}
