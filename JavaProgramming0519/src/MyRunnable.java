public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
