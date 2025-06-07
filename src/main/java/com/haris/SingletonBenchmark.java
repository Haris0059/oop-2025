package com.haris;

public class SingletonBenchmark {

    // Synchronized only version
    private static class SyncSingleton {
        private static SyncSingleton instance;

        public static synchronized SyncSingleton getInstance() {
            if (instance == null) {
                instance = new SyncSingleton();
            }
            return instance;
        }
    }

    // Double-checked locking version
    private static class DCLSingleton {
        private static volatile DCLSingleton instance;

        public static DCLSingleton getInstance() {
            if (instance == null) {
                synchronized (DCLSingleton.class) {
                    if (instance == null) {
                        instance = new DCLSingleton();
                    }
                }
            }
            return instance;
        }
    }


    public static void main(String[] args) {
        final int iterations = 2_147_483_647;

        // Warm-up
        SyncSingleton.getInstance();
        DCLSingleton.getInstance();

        // Benchmark synchronized only
        long startSync = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            SyncSingleton.getInstance();
        }
        long durationSync = System.nanoTime() - startSync;

        // Benchmark double-checked locking
        long startDCL = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            DCLSingleton.getInstance();
        }
        long durationDCL = System.nanoTime() - startDCL;

        System.out.printf("Synchronized only time: %.3f seconds%n", durationSync / 1e9);
        System.out.printf("Double-checked locking time: %.3f seconds%n", durationDCL / 1e9);
        System.out.printf("Speedup for Sync to DCL: %.2f x faster%n", (double) durationSync / durationDCL);
    }
}
