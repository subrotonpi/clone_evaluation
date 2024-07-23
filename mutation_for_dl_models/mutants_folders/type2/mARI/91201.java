public static final String deriveCurveName (org.bouncycastle.jce.spec.ECParameterSpec ecParameterSpec) throws GeneralSecurityException {

    for (@SuppressWarnings ("rawtypes")

    Enumeration X1 = ECNamedCurveTable.getNames ();

    names.hasMoreElements ();) {

        final String name = (String) names.nextElement ();

        final X9ECParameters params = ECNamedCurveTable.getByName (name);

        if (params.getN ().equals (ecParameterSpec.getN ()) && params.getH ().equals (ecParameterSpec.getH ()) && params.getCurve ().equals (ecParameterSpec.getCurve ()) && params.getG ().equals (ecParameterSpec.getG ())) {

            return name;

        }

    }

    throw new GeneralSecurityException ("Could not find name for curve");

}
