public Thread newThread (Runnable runnable) {

    Runnable proxyRunnable = (Runnable)Proxy.newProxyInstance (runnable.getClass ().getClassLoader (), runnable.getClass ().getInterfaces (), new RunnableProxy (runnable));

    Thread thread = new Thread (threadGroup, proxyRunnable, namePrefix + threadNumber.getAndIncrement (), 0);

    thread.setPriority (Thread.NORM_PRIORITY);

    thread.setUncaughtExceptionHandler (new Thread.UncaughtExceptionHandler () {

        public void uncaughtException (Thread thread, Throwable cause) {

            logger.fine (cause.getMessage ());

        }}

    );

    logger.fine (thread.toString () + " created.");

    return thread;

}
