package javaap.week11;

import java.awt.*;

public class MainWindow extends Frame {
    private int buttonY;

    public MainWindow() {
        buttonY = 50;
        setTitle("new window");
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void addButton(String buttonName) {
        Button b = new Button(buttonName);
        b.setBounds(50, buttonY, 100, 50);
        b.addActionListener((e) -> System.out.println("Button Press"));
        buttonY += 50;
        add(b);
    }


    public static void main(String[] args) {
        MainWindow f = new MainWindow();
        f.addButton("button1");
        f.addButton("button2");
        f.addButton("button3");
    }
}
