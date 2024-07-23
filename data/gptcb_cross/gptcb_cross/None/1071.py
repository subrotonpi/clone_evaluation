def addPersonButtonActionPerformed(evt):
    firstName = firstNameTextField.getText()
    lastName = lastNameTextField.getText()
    emailAddress = emailTextField.getText()
    valid = True
    if firstName == "":
        print("First Name is missing")
        valid = False
    if lastName == "":
        print("Last Name is missing")
        valid = False
    if emailAddress == "":
        print("E-Mail address is missing")
        valid = False
    if not Email.isValid(emailAddress):
        print("E-Mail address is invalid")
        valid = False
    if valid:
        personArrayList.add(Person(firstName, lastName, emailAddress))
        print("Person added!")