public static void main (String [] args) {

    LocalDateTime from = LocalDateTime.parse ("2015-07-24T09:39:14.000Z", ISODateTimeFormat.dateTime ());

    LocalDateTime to = LocalDateTime.parse ("2015-07-24T09:45:44.000Z", ISODateTimeFormat.dateTime ());

    LocalTime fromTime = from.toLocalTime ();

    LocalTime toTime = X1.toLocalTime ();

    System.out.println (fromTime + " - " + toTime);

    System.out.println (fromTime + " before " + toTime + " = " + fromTime.isBefore (toTime));

    System.out.println (fromTime + " after " + toTime + " = " + fromTime.isAfter (toTime));

    System.out.println (fromTime + " equals " + toTime + " = " + fromTime.equals (toTime));

    System.out.println (fromTime + " compareTo " + toTime + " = " + fromTime.compareTo (toTime));

}
