@Override

public void tick (float delta) {

    for (Entity e : entities) {

        if (color == Color.WHITE) {

            if (X1 (- 32, - 32) != null && X1 (- 32, - 32).getColor () == Color.BLACK) {

                if (X1 (- 32, - 32).getStrength () < strength) {

                    X1 (- 32, - 32).setStrength (- 50);

                }

            }

        }

        if (! inGame.entities.isEmpty () && strength <= 0) {

            inGame.entities.remove (this);

        }

    }

}
