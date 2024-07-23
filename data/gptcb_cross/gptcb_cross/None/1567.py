def main():
    totalGrades, gradeAverage = 0, 0
    laki = int(input("How many grades will you enter? "))
    grades = []
    count = 0

    while laki > 0 :
        grades.append(float(input("Please enter grade # " + str(count+1) + " : ")))
        totalGrades += grades[count]
        laki -= 1
        count += 1

    gradeAverage = totalGrades/count
    print("Your grades average is " , gradeAverage)