public static void main (String [] args) {

    Scanner scan = new Scanner (X1.in);

    int code;

    int red, green, blue;

    int rMask = 0xFF0000, gMask = 0xFF00, bMask = 0xFF;

    X1.out.println ("Please enter the red color. Range [0, 255] only please.");

    red = scan.nextInt ();

    X1.out.println ("Please enter the green color. Range [0, 255] only please.");

    green = scan.nextInt ();

    X1.out.println ("Please enter the blue color. Range [0, 255] only please.");

    blue = scan.nextInt ();

    code = 0;

    code += (int) (red * Math.pow (2, 16));

    code += (int) (green * Math.pow (2, 8));

    code += (int) (blue * Math.pow (2, 0));

    X1.out.println ("The code is " + code + ".");

    red = 0;

    green = 0;

    blue = 0;

    red = (code & rMask)>> 16;

    green = (code & gMask)>> 8;

    blue = (code & bMask);

    X1.out.println ("Your red value is: " + red);

    X1.out.println ("Your green value is: " + green);

    X1.out.println ("Your blue value is: " + blue);

}
