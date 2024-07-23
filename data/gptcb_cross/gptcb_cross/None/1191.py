def addBusinessDays (date, days):
    result = datetime.datetime(date.year, date.month, date.day)
    result = isWeekEnd (result) ? getPreviousBusinessDate (result) : result
    for i in range (days):
        if isWeekEnd (result):
            i -= 1
        result = result + datetime.timedelta(days=1)
    return result.date()