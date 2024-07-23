public static void main (String [] args) throws InterruptedException, ExecutionException {

    CompletableFuture < String > future = readPage ();

    CompletableFuture < Void > future2 = future.thenAccept (page -> {

        System.out.println (page);

        throw new IllegalArgumentException ("ArtificialStringReplacement");

    });

    future2.exceptionally (e -> {

        e.printStackTrace (System.err);

        return null;

    });

}
