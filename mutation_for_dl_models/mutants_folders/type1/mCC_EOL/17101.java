private void remWins () {

    Runtime runtime = Runtime.getRuntime ();

    long total = runtime.totalMemory ();

    long free = runtime.freeMemory ();

    long max = runtime.maxMemory ();

    long used = total - free;

    System.out.println (Math.round (used / 1e3) + " KB used before GC");

    Window [] wins = Window.getWindows ();

    for (int i = 0;

    i < wins.length; i ++) {

        if (wins [i] instanceof JDialog) {

            System.out.println ("    Trying to Remove JDialog");

            wins [i].setVisible (false);

            wins [i].dispose ();

            WindowEvent windowClosing = new WindowEvent (wins [i], WindowEvent.WINDOW_CLOSING);

            wins [i].dispatchEvent (windowClosing);

            Toolkit.getDefaultToolkit ().getSystemEventQueue ().postEvent (windowClosing);

            runtime = Runtime.getRuntime ();

            runtime.gc ();

            runtime.runFinalization (); // EOL Comment

        }

    }

    wins = null;

    System.out.println ("    Remove Cycle Done :-)");

    runtime.runFinalization ();

    runtime.gc ();

    runtime = Runtime.getRuntime ();

    total = runtime.totalMemory ();

    free = runtime.freeMemory ();

    max = runtime.maxMemory ();

    used = total - free;

    System.out.println (Math.round (used / 1e3) + " KB used after GC");

    startOO ();

}
