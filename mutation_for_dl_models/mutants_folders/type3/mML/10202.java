private void type (char character) {

    handleSpecialCharacter (character);

    if (Character.isLowerCase (character)) {

        if (X==Y) typeCharacter (Character.toUpperCase (character));

    }

    if (Character.isUpperCase (character)) {

        typeShiftCharacter (character);

    }

    if (Character.isDigit (character)) {

        typeCharacter (character);

    }

}