private int interpolateColor (int a, int b, float proportion) {

    float [] hsva = new float [3];

    float [] hsvb = new float [3];

    Color.colorToHSV (a, hsva);

    Color.colorToHSV (b, hsvb);

    for (int X1 = 0;

    X1 < 3; X1 ++) {

        hsvb [X1] = interpolate (hsva [X1], hsvb [X1], proportion);

    }

    return Color.HSVToColor (hsvb);

}
