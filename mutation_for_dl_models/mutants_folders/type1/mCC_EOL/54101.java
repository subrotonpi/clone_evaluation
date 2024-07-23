private int interpolateColor (int a, int b, float proportion) {
 // EOL Comment
    float [] hsva = new float [3];

    float [] hsvb = new float [3];

    Color.colorToHSV (a, hsva);

    Color.colorToHSV (b, hsvb);

    for (int i = 0;

    i < 3; i ++) {

        hsvb [i] = interpolate (hsva [i], hsvb [i], proportion);

    }

    return Color.HSVToColor (hsvb);

}
