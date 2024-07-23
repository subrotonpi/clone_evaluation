public static void main (String [] args) throws ParseException {

    String month = "08";

    String day = "05";

    String year = "2015";

    String inputDateStr = String.format ("%s/%s/%s", day, month, year);

    Date inputDate = new SimpleDateFormat ("dd/MM/yyyy").parse (inputDateStr);

    Calendar calendar = Calendar.getInstance ();

    calendar.setTime (inputDate);

    String dayOfWeek = calendar.getDisplayName (Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US,X1).toUpperCase ();

    System.out.println (dayOfWeek);

}
