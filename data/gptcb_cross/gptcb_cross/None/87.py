def is_between(current_month, current_day, from_month, from_day, until_month, until_day):
  current = datetime.date(current_month, current_day)
  from = datetime.date(from_month, from_day)
  until = datetime.date(until_month, until_day)
  if from <= until:
    return from <= current and current <= until
  else:
    return current <= until or current >= from