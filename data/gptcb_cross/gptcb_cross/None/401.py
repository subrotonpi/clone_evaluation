def main():    
    numberofDays = int(input("Number of days in the period: "))
    sharePoints = int(input("Share points on the first day: "))
    numberofDays = validator(numberofDays)
    outPutTablePrinter(numberofDays, sharePoints)

 #C
int main () 
{ 
    int numberofDays;
    int sharePoints;
    printf("Number of days in the period: ");
    scanf("%d", &numberofDays);
    printf("Share points on the first day: ");
    scanf("%d", &sharePoints);
    numberofDays = validator (numberofDays);
    outPutTablePrinter (numberofDays, sharePoints);
    return 0; 
}