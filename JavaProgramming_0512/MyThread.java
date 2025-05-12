public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(this.getName() + ": " + i);
            try {
                Thread.sleep(200);//0.2초
            } catch (InterruptedException e) {
                System.out.println("인터럽트 발생");
            }
        }
    }
}
