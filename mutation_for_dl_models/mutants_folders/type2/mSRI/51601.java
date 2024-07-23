public Thread newThread (Runnable runnable) {

    Runnable proxyRunnable = (Runnable) Proxy.newProxyInstance (runnable.getClass ().getClassLoader (), runnable.getClass ().getInterfaces (), new RunnableProxy (runnable));

    Thread X1 = new Thread (threadGroup, proxyRunnable, namePrefix + threadNumber.getAndIncrement (), 0);

    X1.setPriority (Thread.NORM_PRIORITY);

    X1.setUncaughtExceptionHandler (new Thread.UncaughtExceptionHandler () {

        public void uncaughtException (Thread X1, Throwable cause) {

            logger.fine (cause.getMessage ());

        }}

    );

    logger.fine (X1.toString () + " created.");

    return X1;

}
