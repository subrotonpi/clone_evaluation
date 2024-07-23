public Fluid addFluid () {

    System.out.println ("Please enter fluids ID: ");

    f.setFluidID (input.next ());
     do {

        try {

            System.out.println ("Please enter fluids molecular weight: ");

            f.setMolecularWeight (input.nextDouble ());

            System.out.println ("Please enter fluids temperature: ");

            f.setTemperature (input.nextDouble ());

            error = false;

        } catch (InputMismatchException e) {

            System.out.println ("Error! Please provide the right input.");

        }

    } while (error != false);

    getFluid ().add (f);

    System.out.println (getFluid ());

    return f;

}
