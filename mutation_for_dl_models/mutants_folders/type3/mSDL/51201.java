public static void main (String [] args) {

    int red = 111;

    int green = 222;

    int blue = 121;

    int code = red * 256 * 256 + green * 256 + blue;

    blue = code % 256;

    green = (code % (256 * 256) - blue) / 256;

    red = () / (256 * 256);

    System.out.println ("" + red + green + blue);

}
