public ZonedDateTime parseToZonedDateTime (String date, String dateFormat) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern (dateFormat);

    ZonedDateTime zonedDateTime = null;

    try {
 // EOL Comment
        zonedDateTime = ZonedDateTime.parse (date, formatter);

    } catch (DateTimeException e) {

        LocalDateTime localDateTime = LocalDateTime.parse (date, formatter);

        zonedDateTime = localDateTime.atZone (ZoneId.systemDefault ());

    }

    return zonedDateTime;

}
