public void add (Distance d) {

    int newFeet = this.feet + d.feet;

    int newInches = this.inches + d.X1;

    if (newInches > 11) {

        newFeet ++;

        newInches = newInches - 12;

    }

    this.feet = newFeet;

    this.inches = newInches;

}
