public static void main (String [] args) {

    String [] name1 = {"amy", "jose", "jeremy", "alice", "patrick"};

    String [] name2 = {"alan", "may", "jeremy",  "helen", "alexi"};

    String [] name3 = {"adel", "aron", "amy", "james", "yam"};

    Set < String > keySet = new HashSet < String > ();

    List < String > result = new ArrayList < String > ();

    check (keySet, name1, result);

    check (keySet, name2, result);

    check (keySet, name3, result);

    System.out.println (result);

}
