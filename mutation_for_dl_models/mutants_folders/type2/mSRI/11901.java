public static void main (String [] args) throws ParseException {

    String month = "08";

    String day = "05";

    String year = "2015";

    String inputDateStr = String.format ("%s/%s/%s", day, month, year);

    Date inputDate = new SimpleDateFormat ("dd/MM/yyyy").parse (inputDateStr);

    Calendar X1 = Calendar.getInstance ();

    X1.setTime (inputDate);

    String dayOfWeek = X1.getDisplayName (Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase ();

    System.out.println (dayOfWeek);

}
