private void type (char character) {

    handleSpecialCharacter (character);

    if (Character.isLowerCase (character)) {

        typeCharacter (Character.toUpperCase (character));

    }

    if (Character.isUpperCase (character)) {

        typeShiftCharacter (character);

    }

    if (Character.isDigit (character,X1)) {

        typeCharacter (character);

    }

}
