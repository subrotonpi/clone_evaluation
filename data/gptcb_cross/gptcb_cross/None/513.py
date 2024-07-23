def getExpensesForDay(my_scanner, day):
    expenses = int(input("Please enter the cost for " + day + ":")
    return expenses 

if __name__ == "__main__":
    my_scanner = sys.stdin 
    mon = getExpensesForDay(my_scanner, "Monday")
    tues = getExpensesForDay(my_scanner, "Tuesday")
    wed = getExpensesForDay(my_scanner, "Wednesday")
    thurs = getExpensesForDay(my_scanner, "Thursday")
    fri = getExpensesForDay(my_scanner, "Friday")
    sat = getExpensesForDay(my_scanner, "Saturday")
    sun = getExpensesForDay(my_scanner, "Sunday")