public static final String deriveCurveName (org.bouncycastle.jce.spec.ECParameterSpec X1) throws GeneralSecurityException {

    for (@SuppressWarnings ("rawtypes")

    Enumeration names = ECNamedCurveTable.getNames ();

    names.hasMoreElements ();) {

        final String name = (String) names.nextElement ();

        final X9ECParameters params = ECNamedCurveTable.getByName (name);

        if (params.getN ().equals (X1.getN ()) && params.getH ().equals (X1.getH ()) && params.getCurve ().equals (X1.getCurve ()) && params.getG ().equals (X1.getG ())) {

            return name;

        }

    }

    throw new GeneralSecurityException ("Could not find name for curve");

}
