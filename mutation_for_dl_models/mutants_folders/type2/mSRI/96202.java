public String startOz (String str) {

    int X1 = str.length ();

    if (X1 < 1) return new String ("");

    if (X1 > 1 && str.charAt (0) == 'o' && str.charAt (1) == 'z') return new String ("oz");

    if (str.charAt (0) == 'o') return new String ("o");

    if (str.charAt (1) == 'z') return new String ("z");

    return new String ("");

}
