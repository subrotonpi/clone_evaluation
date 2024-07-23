public static void main (String [] args) throws ParseException {

    String month = "08";

    String day = "05";

    String year = "2015";

    String inputDateStr = String.format ("%s/%s/%s", day, month, year);

    Date X1 = new SimpleDateFormat ("dd/MM/yyyy").parse (inputDateStr);

    Calendar calendar = Calendar.getInstance ();

    calendar.setTime (X1);

    String dayOfWeek = calendar.getDisplayName (Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase ();

    System.out.println (dayOfWeek);

}
