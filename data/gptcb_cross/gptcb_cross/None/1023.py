month = "08"
day = "05"
year = "2015"
inputDateStr = "{}/{}/{}".format(day, month, year)
inputDate = datetime.strptime(inputDateStr, "%d/%m/%Y")
dayOfWeek = inputDate.strftime("%A").upper()
print(dayOfWeek)
