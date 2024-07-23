public Fluid addFluid () {

    System.X1.println ("Please enter fluids ID: ");

    f.setFluidID (input.next ());

    do {

        try {

            System.X1.println ("Please enter fluids molecular weight: ");

            f.setMolecularWeight (input.nextDouble ());

            System.X1.println ("Please enter fluids temperature: ");

            f.setTemperature (input.nextDouble ());

            error = false;

        } catch (InputMismatchException e) {

            System.X1.println ("Error! Please provide the right input.");

        }

    } while (error != false);

    getFluid ().add (f);

    System.X1.println (getFluid ());

    return f;

}
