private void type (char character) {

    handleSpecialCharacter (character);

    if (X1.isLowerCase (character)) {

        typeCharacter (X1.toUpperCase (character));

    }

    if (X1.isUpperCase (character)) {

        typeShiftCharacter (character);

    }

    if (X1.isDigit (character)) {

        typeCharacter (character);

    }

}
