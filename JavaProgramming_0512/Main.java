public class Main {
    public static void main(String[] args) {
        int arraySize = 10000;
        int[] input = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            input[i] = i;
        }
        int threadCount = 4;
        int chunkSize = arraySize / threadCount;
        ArrayPartialSumWalker[] runnables = new ArrayPartialSumWalker[threadCount];
        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            runnables[i] = new ArrayPartialSumWalker(input, i * chunkSize, (i + 1) * chunkSize);
            threads[i] = new Thread(runnables[i]);
            threads[i].start();
        }
        for (int i = 0; i < threadCount; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int totalSum = 0;
        for (ArrayPartialSumWalker i : runnables) {
            totalSum += i.getFinalSum();
        }
        System.out.println(totalSum);
    }
}
