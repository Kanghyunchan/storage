import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame();
        Panel p = new Panel();
        MyCanvas c = new MyCanvas(500, 300);
        p.add(c, BorderLayout.CENTER);
        Runnable run = ()->{
            while(true){
                try {
                    Thread.sleep(1000 * 1/60);
                    c.rendering();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t = new Thread(run);
        t.start();

        p.setLayout(new BorderLayout());
        Button b2 = new Button("SOUTH");
        b2.addActionListener(e -> c.addCircle());
        p.add(b2, BorderLayout.SOUTH);

        f.add(p);
        f.setSize(800, 500);
        f.setTitle("Example");
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }
}


