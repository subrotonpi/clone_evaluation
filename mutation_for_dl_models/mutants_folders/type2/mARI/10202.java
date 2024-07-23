private void type (char character) {

    handleSpecialCharacter (character);

    if (Character.isLowerCase (character)) {

        typeCharacter (Character.X1 (character));

    }

    if (Character.isUpperCase (character)) {

        typeShiftCharacter (character);

    }

    if (Character.isDigit (character)) {

        typeCharacter (character);

    }

}
