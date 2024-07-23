public int add (Distance newDistance) {

    int newDistanceFeet = newDistance.getFeet ();

    int newDistanceInches = newDistance.getInches ();

    int sumInches = newDistanceInches + X1.getInches ();

    int sumFeet = newDistanceFeet + this.getFeet ();

    sumInches += (sumInches % 12);

    sumFeet += (sumInches / 12);

    this.setFeet (sumFeet);

    this.setInches (sumInches);

}
