public String startOz (String str) {

    int len = str.length ();

    if (len < 1) return new String ("");

    if (len > 1 && str.charAt (0) == 'o' && str.charAt (1) == 'z') return new String ("ArtificialStringReplacement");

    if (str.charAt (0) == 'o') return new String ("o");

    if (str.charAt (1) == 'z') return new String ("z");

    return new String ("");

}
