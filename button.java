import java.awt.Button;
import java.awt.Frame;

public class button {
    public static void main(String[] args) {
        Frame fr = new Frame();
        Button b = new Button("Click");

        fr.add(b);
        b.setBounds(100,100,50,50);

        fr.setSize(500,500);
        fr.setLayout(null);
        fr.setVisible(true);
    }
}
