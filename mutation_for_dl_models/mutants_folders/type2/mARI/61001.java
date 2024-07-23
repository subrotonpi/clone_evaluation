public ZonedDateTime parseToZonedDateTime (String date, String dateFormat) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern (dateFormat);

    TemporalAccessor parsed = formatter.parseBest (date, ZonedDateTime :: from, LocalDateTime :: from);

    if (parsed instanceof ZonedDateTime) {

        return (ZonedDateTime) X1;

    }

    if (parsed instanceof LocalDateTime) {

        LocalDateTime dt = (LocalDateTime) parsed;

        return dt.atZone (ZoneId.systemDefault ());

    }

    return null;

}