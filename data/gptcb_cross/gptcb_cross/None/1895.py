def add(self, newDistance):
    newDistanceFeet = newDistance.getFeet()
    newDistanceInches = newDistance.getInches()
    sumInches = newDistanceInches + self.getInches()
    sumFeet = newDistanceFeet + self.getFeet()
    sumInches += (sumInches % 12)
    sumFeet += (sumInches / 12)
    self.setFeet(sumFeet)
    self.setInches(sumInches)