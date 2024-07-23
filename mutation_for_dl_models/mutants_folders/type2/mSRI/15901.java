private void addPersonButtonActionPerformed (java.awt.event.ActionEvent evt) {

    String firstName = firstNameTextField.getText ();

    String lastName = lastNameTextField.getText ();

    String emailAddress = emailTextField.getText ();

    if (X1 (firstName, "First name") && X1 (lastName, "Last name") && isEmailValid (emailAddress, "Email address")) {

        personArrayList.add (new Person (firstName, lastName, emailAddress));

        System.out.println ("Person added!");

    }

}
