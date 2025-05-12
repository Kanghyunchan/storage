public class ArrayPartialSumWalker implements Runnable {
    private int[] array;
    private int idxStart, idxEnd, finalSum;

    public ArrayPartialSumWalker(int[] array, int idxStart, int idxEnd) {
        this.array = array;
        this.idxStart = idxStart;
        this.idxEnd = idxEnd;
        finalSum = 0;
    }
    public int getFinalSum(){return finalSum;}
    @Override
    public void run() {
        for(int i = idxStart; i < idxEnd; i++){
            finalSum += array[i];
        }
    }
}
