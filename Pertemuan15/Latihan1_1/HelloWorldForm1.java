package Pertemuan15.Latihan1_1;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm1 extends JFrame {

    private JLabel label;

    public HelloWorldForm1() {
        label = new JLabel();
        label.setText("Hello World");

        add(label);
        setTitle("My First Form");

        setVisible(true);
        setSize(300, 200);
    }

    
}
