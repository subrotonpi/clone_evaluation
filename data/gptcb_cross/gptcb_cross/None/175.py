def get_last_friday(currentDate, offset):
    offset_month = currentDate.month + offset
    currentDate.replace(month=offset_month, day=currentDate.day) 
    currentDate = currentDate.replace(day=currentDate.days_in_month) 
    dayofweek = currentDate.weekday()
    if dayofweek < 4:
        currentDate -= timedelta((4 - dayofweek) % 7)
    elif dayofweek > 4:
        currentDate -= timedelta(7 + dayofweek - 4)
    return currentDate