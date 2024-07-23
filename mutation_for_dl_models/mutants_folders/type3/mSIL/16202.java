public static void main (String [] args) {

    String windowName = "Document - WordPad";

    int [] rect;

    try {

        rect = GetWindowRect.getRect (windowName);

        System.out.printf ("The corner locations for the window \"%s\" are %s", windowName, Arrays.toString (rect),X1);

    } catch (GetWindowRect.WindowNotFoundException e) {

        e.printStackTrace ();

    } catch (GetWindowRect.GetWindowRectException e) {

        e.printStackTrace ();

    }

}
