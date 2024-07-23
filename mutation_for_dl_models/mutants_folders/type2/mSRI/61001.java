public ZonedDateTime parseToZonedDateTime (String date, String dateFormat) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern (dateFormat);

    TemporalAccessor parsed = formatter.parseBest (date, ZonedDateTime :: from, LocalDateTime :: from);

    if (parsed instanceof ZonedDateTime) {

        return (ZonedDateTime) parsed;

    }

    if (parsed instanceof LocalDateTime) {

        LocalDateTime X1 = (LocalDateTime) parsed;

        return X1.atZone (ZoneId.systemDefault ());

    }

    return null;

}
