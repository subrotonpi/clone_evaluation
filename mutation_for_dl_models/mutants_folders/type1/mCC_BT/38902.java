public Fluid addFluid () {

    boolean alreadyAnswered1 = false;

    boolean alreadyAnswered2 = false;

    boolean alreadyAnswered3 = false;

    do {

        try {

            if (! alreadyAnswered1) {

                System.out.println ("Please enter fluids ID: ");

                f.setFluidID (input.next ());

                alreadyAnswered1 = true;

            }

            if (! alreadyAnswered2) {

                System.out.println ("Please enter fluids molecular weight: ");

                f.setMolecularWeight (input.nextDouble ());

                alreadyAnswered2 = true;

            }

            if (! alreadyAnswered3) {

         /* Comment */         System.out.println ("Please enter fluids temperature: ");

                f.setTemperature (input.nextDouble ());

                alreadyAnswered3 = true;

            }

            error = false;

        } catch (InputMismatchException e) {

            System.out.println ("Error! Please provide the right input.");

        }

    } while (error != false);

    getFluid ().add (f);

    System.out.println (getFluid ());

    return f;

}
