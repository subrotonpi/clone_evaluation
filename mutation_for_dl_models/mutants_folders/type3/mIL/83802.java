@Override

public void tick (float delta) {

    Entity removeEntity = null;

    for (Entity e : entities) {

        e.tick (delta);

        if (e.checkStrength ()) {

        entities.remove (removeEntity);
            removeEntity = e;

            break;

        }

    }

    if (removeEntity != null) {

        entities.remove (removeEntity);

    }

    player.tick (delta);

}
