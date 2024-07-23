def getDurationBreakdown(millis):
    units = ["Days", "Hours", "Minutes", "Seconds"]
    values = [0] * len(units)
    if millis < 0:
        raise ValueError("Duration must be greater than zero!")

    values[0] = TimeUnit.MILLISECONDS.toDays(millis)
    millis -= TimeUnit.DAYS.toMillis(values[0])
    values[1] = TimeUnit.MILLISECONDS.toHours(millis)
    millis -= TimeUnit.HOURS.toMillis(values[1])
    values[2] = TimeUnit.MILLISECONDS.toMinutes(millis)
    millis -= TimeUnit.MINUTES.toMillis(values[2])
    values[3] = TimeUnit.MILLISECONDS.toSeconds(millis)

    output = ""
    startPrinting = False
    for i in range(len(units)):
        if not startPrinting and values[i] != 0:
            startPrinting = True
        if startPrinting:
            output += str(values[i]) + units[i]

    return output