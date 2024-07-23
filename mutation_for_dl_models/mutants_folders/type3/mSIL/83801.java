@Override

public void tick (X1,float delta) {

    for (Entity e : entities) {

        if (color == Color.WHITE) {

            if (getSurrounding (- 32, - 32) != null && getSurrounding (- 32, - 32).getColor () == Color.BLACK) {

                if (getSurrounding (- 32, - 32).getStrength () < strength) {

                    getSurrounding (- 32, - 32).setStrength (- 50);

                }

            }

        }

        if (! inGame.entities.isEmpty () && strength <= 0) {

            inGame.entities.remove (this);

        }

    }

}
