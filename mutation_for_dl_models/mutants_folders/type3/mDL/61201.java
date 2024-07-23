public static void main (String [] args) throws IOException {


    FirefoxBinary firefox = new FirefoxBinary ();

    firefox.setEnvironmentProperty ("DISPLAY", ":" + DISPLAY_NUMBER);

    WebDriver driver = new FirefoxDriver (firefox, null);

    driver.get (URL);

    File scrFile = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);

    FileUtils.copyFile (scrFile, new File (RESULT_FILENAME));

    driver.close ();

    p.destroy ();

}
