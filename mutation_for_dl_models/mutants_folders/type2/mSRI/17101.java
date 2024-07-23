private void remWins () {

    Runtime runtime = Runtime.getRuntime ();

    long total = runtime.totalMemory ();

    long free = runtime.freeMemory ();

    long max = runtime.maxMemory ();

    long used = total - free;

    System.out.println (Math.round (used / 1e3) + " KB used before GC");

    Window [] wins = Window.getWindows ();

    for (int X1 = 0;

    X1 < wins.length; X1 ++) {

        if (wins [X1] instanceof JDialog) {

            System.out.println ("    Trying to Remove JDialog");

            wins [X1].setVisible (false);

            wins [X1].dispose ();

            WindowEvent windowClosing = new WindowEvent (wins [X1], WindowEvent.WINDOW_CLOSING);

            wins [X1].dispatchEvent (windowClosing);

            Toolkit.getDefaultToolkit ().getSystemEventQueue ().postEvent (windowClosing);

            runtime = Runtime.getRuntime ();

            runtime.gc ();

            runtime.runFinalization ();

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
