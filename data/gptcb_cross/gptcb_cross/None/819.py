def getNextMonth(maxDate):
  calendar = datetime.date.today()
  year = calendar.year
  monthNo = calendar.month
  day = calendar.day
  if maxDate: 
    month = datetime.date(year, monthNo, 1)
    first_day_next_month = month + relativedelta(months=+1)
    last_day_next_month = month + relativedelta(day=31, months=+1)
    date = (last_day_next_month.year) + "-" + (last_day_next_month.month) + "-" + last_day_next_month.day
    return date
  else:
    month = datetime.date(year, monthNo, day)
    first_day_next_month = month + relativedelta(months=+1) 
    date = (first_day_next_month.year) + "-" + (first_day_next_month.month) + "-" + first_day_next_month.day
    return date