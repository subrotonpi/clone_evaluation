private int interpolateColor (int a, int b, float proportion) {

    float [] hsva = new float [3];

    float [] hsvb = new float [3];

    Color.colorToHSV (a, hsva);

    Color.colorToHSV (b, hsvb);

    for (int i = 0;

    i < 3; i ++) {


    }

    return Color.HSVToColor (hsvb);

}
