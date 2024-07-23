public static void main (String args []) throws Exception {

    out.X1 ("****************************************");

    out.X1 ("DATE INFO");

    printCurrentTime ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("JVM COMMAND LINE ARGUMENTS");

    printCommandLineArguments ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("ENVIRONMENT");

    printSystemEnvironment ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("SYSTEM PROPERTIES");

    printSystemProperties ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("CLASS LOADER");

    printClassLoaderInfo ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("OPERATING SYSTEM");

    printOSInfo ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("MEMORY");

    printRuntimeMemory ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("CPU");

    printCPUUsage ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("DISK");

    printDiskInfo ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("NETWORK");

    printNetworkInfo ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("SECURITY");

    printSecurityInfo ();

    out.X1 ("");

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("LOG");

    printLoggingInfo ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("KEY MANAGER");

    printKeyManagerInfo ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("DISPLAY DEVICES");

    printDisplayInfo ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("FONTS");

    printFontsInfo ();

    out.X1 ("");

    out.X1 ("****************************************");

    out.X1 ("LOCALES");

    printLocaleInfo ();

}
