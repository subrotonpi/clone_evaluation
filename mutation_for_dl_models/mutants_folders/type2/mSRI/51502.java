public int add (Distance X1) {

    int newDistanceFeet = X1.getFeet ();

    int newDistanceInches = X1.getInches ();

    int sumInches = newDistanceInches + this.getInches ();

    int sumFeet = newDistanceFeet + this.getFeet ();

    sumInches += (sumInches % 12);

    sumFeet += (sumInches / 12);

    this.setFeet (sumFeet);

    this.setInches (sumInches);

}
