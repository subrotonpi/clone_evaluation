public static void main (String [] args) {

    LocalDateTime from = LocalDateTime.parse ("2015-07-24T09:39:14.000Z", ISODateTimeFormat.dateTime ());

    LocalDateTime to = LocalDateTime.parse ("2015-07-24T09:45:44.000Z", ISODateTimeFormat.dateTime ());

    LocalTime X1 = from.toLocalTime ();

    LocalTime toTime = to.toLocalTime ();

    System.out.println (X1 + " - " + toTime);

    System.out.println (X1 + " before " + toTime + " = " + X1.isBefore (toTime));

    System.out.println (X1 + " after " + toTime + " = " + X1.isAfter (toTime));

    System.out.println (X1 + " equals " + toTime + " = " + X1.equals (toTime));

    System.out.println (X1 + " compareTo " + toTime + " = " + X1.compareTo (toTime));

}
