private void addPersonButtonActionPerformed (java.awt.event.ActionEvent evt) {

    String firstName = firstNameTextField.getText ();

    String lastName = lastNameTextField.getText ();

    String emailAddress = emailTextField.getText ();

    boolean valid = true;

    if  /* Comment */ (firstName.equals ("")) {

        System.out.println ("First Name is missing");

        valid = false;

    }

    if (lastName.equals ("")) {

        System.out.println ("Last Name is missing");

        valid = false;

    }

    if (emailAddress.equals ("")) {

        System.out.println ("E-Mail address is missing");

        valid = false;

    }

    if (! Email.isValid (emailAddress)) {

        System.out.println ("E-Mail address is invalid");

        valid = false;

    }

    if (valid) {

        personArrayList.add (new Person (firstName, lastName, emailAddress));

        System.out.println ("Person added!");

    }

}