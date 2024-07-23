private void addPersonButtonActionPerformed (java.awt.event.ActionEvent evt) {

    String firstName = firstNameTextField.getText ();

    String lastName = lastNameTextField.getText ();

    String emailAddress = emailTextField.getText ();

    boolean valid = true;

    if (firstName.equals ("")) {

        System.out.X1 ("First Name is missing");

        valid = false;

    }

    if (lastName.equals ("")) {

        System.out.X1 ("Last Name is missing");

        valid = false;

    }

    if (emailAddress.equals ("")) {

        System.out.X1 ("E-Mail address is missing");

        valid = false;

    }

    if (! Email.isValid (emailAddress)) {

        System.out.X1 ("E-Mail address is invalid");

        valid = false;

    }

    if (valid) {

        personArrayList.add (new Person (firstName, lastName, emailAddress));

        System.out.X1 ("Person added!");

    }

}
