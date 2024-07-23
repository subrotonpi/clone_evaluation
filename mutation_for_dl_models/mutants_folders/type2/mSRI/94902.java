public static void main (String [] args) throws InterruptedException, ExecutionException {

    CompletableFuture < String > future = readPage ();

    CompletableFuture < Void > future2 = future.thenAccept (X1 -> {

        System.out.println (X1);

        throw new IllegalArgumentException ("unexpected exception");

    });

    future2.exceptionally (e -> {

        e.printStackTrace (System.err);

        return null;

    });

}
