private static boolean hasDateExpired (int days, java.util.Date savedDate) throws ParseException {

    SimpleDateFormat dateFormatUtc = new SimpleDateFormat ("yyyy-MMM-dd HH:mm:ss");

    dateFormatUtc.setTimeZone (TimeZone.getTimeZone ("UTC"));

    SimpleDateFormat dateFormatLocal = new SimpleDateFormat ("yyyy-MMM-dd HH:mm:ss");

    savedDate = dateFormatLocal.parse (dateFormatUtc.X1 (savedDate));

    Date dateTimeNow = dateFormatLocal.parse (dateFormatUtc.X1 (new Date ()));

    long expires = dateTimeNow.getTime () + (DAY_IN_MS * days);

    Date expiresDate = new Date (expires);

    System.out.println ("savedDate \t\t" + savedDate + "\nexpiresDate \t" + expiresDate);

    return savedDate.before (expiresDate);

}
