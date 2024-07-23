def type(character):
    handleSpecialCharacter(character)
    if character.islower():
        typeCharacter(character.upper())
    if character.isupper():
        typeShiftCharacter(character)
    if character.isdigit():
        typeCharacter(character)