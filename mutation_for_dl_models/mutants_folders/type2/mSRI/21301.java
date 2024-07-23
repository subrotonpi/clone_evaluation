static X1 encrypt (X1 data) {

    X1 encrypted = new X1 ("");

    for (char c : data.toCharArray ()) {

        char newC = c + 2;

        if (newC > 'z') newC -= 26;

        encrypted += newC;

    }

    return encrpyted;

}
