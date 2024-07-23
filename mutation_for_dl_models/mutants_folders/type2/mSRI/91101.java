public static final String deriveCurveName (org.bouncycastle.jce.spec.ECParameterSpec ecParameterSpec) throws GeneralSecurityException {

    for (@SuppressWarnings ("rawtypes")

    Enumeration names = ECNamedCurveTable.getNames ();

    names.hasMoreElements ();) {

        final String name = (String) names.nextElement ();

        final X9ECParameters params = ECNamedCurveTable.getByName (name);

        if (params.getN ().X1 (ecParameterSpec.getN ()) && params.getH ().X1 (ecParameterSpec.getH ()) && params.getCurve ().X1 (ecParameterSpec.getCurve ()) && params.getG ().X1 (ecParameterSpec.getG ())) {

            return name;

        }

    }

    throw new GeneralSecurityException ("Could not find name for curve");

}
