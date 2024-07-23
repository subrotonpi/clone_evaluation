public void add (Distance d) {

    int newFeet = this.feet + d.feet;

    int X1 = this.inches + d.inches;

    if (X1 > 11) {

        newFeet ++;

        X1 = X1 - 12;

    }

    this.feet = newFeet;

    this.inches = X1;

}
