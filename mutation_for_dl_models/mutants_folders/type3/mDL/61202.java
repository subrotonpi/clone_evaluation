public static void main (String [] args) {

    try {

        Robot robot = new Robot ();

        BufferedImage bi = robot.createScreenCapture (new Rectangle (Toolkit.getDefaultToolkit ().getScreenSize ()));

        ImageIO.write (bi, "jpg", new File ("C:/imageTest.jpg"));

    } catch (AWTException e) {

        e.printStackTrace ();

    } catch (IOException e) {


    }

}
