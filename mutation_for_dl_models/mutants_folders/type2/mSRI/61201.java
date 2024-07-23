public static void main (String [] args) throws IOException {

    Process p = Runtime.getRuntime ().exec (XVFB_COMMAND);

    FirefoxBinary firefox = new FirefoxBinary ();

    firefox.setEnvironmentProperty ("DISPLAY", ":" + DISPLAY_NUMBER);

    WebDriver X1 = new FirefoxDriver (firefox, null);

    X1.get (URL);

    File scrFile = ((TakesScreenshot) X1).getScreenshotAs (OutputType.FILE);

    FileUtils.copyFile (scrFile, new File (RESULT_FILENAME));

    X1.close ();

    p.destroy ();

}
