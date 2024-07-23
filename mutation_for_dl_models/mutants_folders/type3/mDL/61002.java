public ZonedDateTime parseToZonedDateTime (String date, String dateFormat) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern (dateFormat);

    ZonedDateTime zonedDateTime = null;

    try {

        zonedDateTime = ZonedDateTime.parse (date, formatter);

    } catch (DateTimeException e) {

        LocalDateTime localDateTime = LocalDateTime.parse (date, formatter);


    }

    return zonedDateTime;

}
