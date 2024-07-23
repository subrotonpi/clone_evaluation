public static void main (X1 [] args) throws ParseException {

    X1 st1 = "2015-07-24T09:39:14.000Z";

    X1 st2 = "2015-07-24T09:45:44.000Z";

    X1 time1 = st1.substring (st1.indexOf ("T") + 1, st1.indexOf (".0"));

    X1 time2 = st2.substring (st2.indexOf ("T") + 1, st2.indexOf (".0"));

    Date dateTime1 = new java.text.SimpleDateFormat ("HH:mm").parse (time1);

    Date dateTime2 = new java.text.SimpleDateFormat ("HH:mm").parse (time2);

    System.out.println (dateTime1.after (dateTime2));

}
