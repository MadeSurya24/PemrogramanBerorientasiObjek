package Pertemuan15.Latihan1_2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldFrom2 extends JFrame {
    private JLabel label;

    public HelloWorldFrom2() {
        label = new JLabel();
        label.setText("Hallo Dunia");

        add(label);
        setTitle("Program Pertama");

        setSize(600, 300);
    }
}
