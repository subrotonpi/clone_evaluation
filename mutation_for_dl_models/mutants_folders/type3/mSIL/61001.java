public ZonedDateTime parseToZonedDateTime (String date,X1, String dateFormat) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern (dateFormat);

    TemporalAccessor parsed = formatter.parseBest (date, ZonedDateTime :: from, LocalDateTime :: from);

    if (parsed instanceof ZonedDateTime) {

        return (ZonedDateTime) parsed;

    }

    if (parsed instanceof LocalDateTime) {

        LocalDateTime dt = (LocalDateTime) parsed;

        return dt.atZone (ZoneId.systemDefault ());

    }

    return null;

}