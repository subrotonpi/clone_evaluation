def parseToZonedDateTime(date, dateFormat):
  formatter = DateTimeFormatter.ofPattern(dateFormat)
  try:
    zonedDateTime = ZonedDateTime.parse(date, formatter)
  except DateTimeException as e:
    localDateTime = LocalDateTime.parse(date, formatter)
    zonedDateTime = localDateTime.atZone(ZoneId.systemDefault())
  return zonedDateTime