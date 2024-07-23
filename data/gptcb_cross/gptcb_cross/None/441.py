def main (args): 
  THIRTYONE = 31  
  THIRTY = 30 
  FEBNORM = 28 
  FEBLEAP = 29 
  numOfSundays = 0 
  calendar = [[0 for x in range (THIRTYONE)] for y in range (12)]
  calendar[1] = [0 for x in range (FEBLEAP)]
  calendar[3] = [0 for x in range (THIRTY)]
  calendar[5] = [0 for x in range (THIRTY)]
  calendar[8] = [0 for x in range (THIRTY)]
  calendar[10] = [0 for x in range (THIRTY)]
  dayOfWeek = 1 
  
  for year in range(1900,2001):
    for month in range(12):
      dayOfMonth = 0 
      if month == 1:
        daysInMonth = FEBLEAP if isLeapYear(year) else FEBNORM 
      else:
        daysInMonth = THIRTYONE if month not in [3,5,8,10] else THIRTY
    while dayOfWeek < 8 and dayOfMonth < daysInMonth:
      print("year: "+ str(year)+ "\tday: "+str(dayOfWeek)+ "\tcalendar["+str(month)+"]["+str(dayOfMonth)+"]: "+str(calendar[month][dayOfMonth]))
      if dayOfWeek == 7 and year > 1900:
        calendar[month][dayOfMonth] += 1
        if dayOfMonth == 0:
          numOfSundays += 1
      dayOfMonth += 1 
      dayOfWeek += 1 
      if dayOfWeek > 7:
        dayOfWeek = 1 
        
  for month in range (12):
    print (calendar[month][0])
  print(numOfSundays)