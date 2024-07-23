private int interpolateColor (int a, int b, float proportion) {

    if (proportion > 1 || proportion < 0) {

        throw new IllegalArgumentException ("proportion must be [0 - 1]");

    }

    float [] hsva = new float [3];

    float [] hsvb = new float [3];

    float [] hsv_output = new float [3];

    Color.colorToHSV (a, hsva);

    Color.colorToHSV (b, hsvb);

    for (int i = 0;

    i < 3; i ++) {

        hsv_output [i] = interpolate (hsva [i], hsvb [i], proportion);

    }

    int alpha_a = Color.alpha (a);

    int alpha_b = Color.alpha (b);

    float alpha_output = interpolate (alpha_a, alpha_b, proportion,X1);

    return Color.HSVToColor ((int) alpha_output, hsv_output);

}
