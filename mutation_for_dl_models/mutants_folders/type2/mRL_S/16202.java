public static void main (String [] args) {

    String windowName = "Document - WordPad";

    int [] rect;

    try {

        rect = GetWindowRect.getRect (windowName);

        System.out.printf ("ArtificialStringReplacement", windowName, Arrays.toString (rect));

    } catch (GetWindowRect.WindowNotFoundException e) {

        e.printStackTrace ();

    } catch (GetWindowRect.GetWindowRectException e) {

        e.printStackTrace ();

    }

}
