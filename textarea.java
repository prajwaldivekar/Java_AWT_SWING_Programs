import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;

public class textarea {
    public static void main(String[] args) {
        Frame fr = new Frame();
        Label l = new Label("Enter your name");
        l.setBounds(100,100,100,100);

        TextArea t = new TextArea();
        t.setBounds(170,100,200,100);

        fr.add(l);
        fr.add(t);
        fr.setSize(800,700);
        fr.setVisible(true);
        fr.setLayout(null);
    }
}
