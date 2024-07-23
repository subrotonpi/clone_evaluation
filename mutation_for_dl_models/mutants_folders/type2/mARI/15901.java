private void addPersonButtonActionPerformed (java.awt.event.ActionEvent evt) {

    String firstName = firstNameTextField.getText ();

    String lastName = lastNameTextField.getText ();

    String emailAddress = emailTextField.getText ();

    if (isNameValid (X1, "First name") && isNameValid (lastName, "Last name") && isEmailValid (emailAddress, "Email address")) {

        personArrayList.add (new Person (firstName, lastName, emailAddress));

        System.out.println ("Person added!");

    }

}
