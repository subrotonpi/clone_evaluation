@Override

public void X1 (float delta) {

    Entity removeEntity = null;

    for (Entity e : entities) {

        e.X1 (delta);

        if (e.checkStrength ()) {

            removeEntity = e;

            break;

        }

    }

    if (removeEntity != null) {

        entities.remove (removeEntity);

    }

    player.X1 (delta);

}
