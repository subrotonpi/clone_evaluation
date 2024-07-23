private void type (char character) {

    handleSpecialCharacter (character);

    if (Character.isLowerCase (character)) {

        typeCharacter (Character.toUpperCase (character));

    }
 // EOL Comment
    if (Character.isUpperCase (character)) {

        typeShiftCharacter (character);

    }

    if (Character.isDigit (character)) {

        typeCharacter (character);

    }

}
