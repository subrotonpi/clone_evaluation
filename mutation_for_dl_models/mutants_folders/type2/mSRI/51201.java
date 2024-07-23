public static void main (String [] args) {

    int red = 111;

    int X1 = 222;

    int blue = 121;

    int code = red * 256 * 256 + X1 * 256 + blue;

    blue = code % 256;

    X1 = (code % (256 * 256) - blue) / 256;

    red = (code - blue - X1 * 256) / (256 * 256);

    System.out.println ("" + red + X1 + blue);

}
