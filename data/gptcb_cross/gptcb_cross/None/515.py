def test_02():
    file = open("input.txt", "r")
    houseLocations = list(map(int, file.readline().split())) # List of house locations in array format
    rounds = 400 # Number of rounds 
    transmitterRange = 73381 # Range of the transmitter

    uniqueHouseLocationsSorted = sorted(list(set(houseLocations))) # Get unique house locations and sort it
    start = time.time() # Start Time
    for i in range(0, rounds):
        minNumOfTransmitters = minNumOfTransmitters(uniqueHouseLocationsSorted, transmitterRange)
    end = time.time() # End Time

    print("Took", (end - start), "milliseconds..")