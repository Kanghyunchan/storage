import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame("JavaAp 12주차 202202135 강현찬");
        Button objectCreateBtn = new Button("ObjectCreateButton");
        Button objectDeleteBtn = new Button("ObjectDeleteButton");
        ShapeManager centerCanvas = new ShapeManager();
        centerCanvas.setSize(800, 800);
        Runnable run = ()->{
            while(true){
                try{
                    Thread.sleep(1000 * 1/60);
                    centerCanvas.rendering();
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t = new Thread(run);
        t.start();
        objectCreateBtn.addActionListener(e -> centerCanvas.addObject());
        objectDeleteBtn.addActionListener(e -> centerCanvas.deleteShape());
        f.setLayout(new BorderLayout());
        f.add(objectCreateBtn, BorderLayout.SOUTH);
        f.add(objectDeleteBtn, BorderLayout.NORTH);
        f.add(centerCanvas, BorderLayout.CENTER);
        f.setVisible(true);

        f.setSize(800, 800);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
