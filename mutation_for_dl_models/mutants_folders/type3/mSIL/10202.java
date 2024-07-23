private void type (char character) {

    handleSpecialCharacter (character,X1);

    if (Character.isLowerCase (character)) {

        typeCharacter (Character.toUpperCase (character));

    }

    if (Character.isUpperCase (character)) {

        typeShiftCharacter (character);

    }

    if (Character.isDigit (character)) {

        typeCharacter (character);

    }

}
