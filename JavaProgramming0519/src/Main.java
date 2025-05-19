import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김이", "이박최", "박최강우", "최강오황소");
        Collections.sort(names, (o1, o2) -> {
            if(o1.length() > o2.length()) return -1;
            else if (o1.length() == o2.length()) return 0;
            else return 1;
        });

        for(String name : names){
            System.out.println(name);
        }
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
//        t1.start();
//        Thread t = new Thread(() -> {
//            for (int i = 0; i < 3; i++) {
//                String name = Thread.currentThread().getName();
//                System.out.println(name + ": " + i);
//                try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//        t.start();
    }
}
