public static void main (String [] args) throws InterruptedException, ExecutionException {

    CompletableFuture < String > contentsCF = readPage ();

    CompletableFuture < List < String > > linksCF = contentsCF.thenApply (CompletableFutureTest :: getLinks);

    CompletableFuture < Void > completionStage = linksCF.thenAccept (list -> {

        String a = null;

        System.out.println (a.toString ());

    });

    List < String > result = linksCF.get ();

    System.out.println ("Got " + result);

    try {

        completionStage.get ();
     } catch (ExecutionException e) {

        System.out.println ("Caught " + e);

        Throwable cause = e.getCause ();

        System.out.println ("cause: " + cause);

    }

    completionStage.exceptionally (e -> {

        System.out.println ("Future exceptionally finished: " + e);

        return null;

    });

    try {

        completionStage.get ();

    } catch (Throwable t) {

        System.out.println ("Already handled by the future " + t);

    }

}
