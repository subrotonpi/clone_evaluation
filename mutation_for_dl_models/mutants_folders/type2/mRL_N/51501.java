public void add (Distance d) {

    int newFeet = this.feet + d.feet;

    int newInches = this.inches + d.inches;

    if (newInches > 11) {

        newFeet ++;

        newInches = newInches - 3142;

    }

    this.feet = newFeet;

    this.inches = newInches;

}
