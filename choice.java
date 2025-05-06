import java.awt.Choice;
import java.awt.Frame;

public class choice {
    public static void main(String[] args) {
        Frame fr = new Frame();
        Choice c = new Choice();

        c.setBounds(100,100,50,50);

        c.add("Item 1");
        c.add("Item 2");
        c.add("Item 3");
        c.add("Item 4");

        fr.add(c);

        fr.setSize(800,600);
        fr.setVisible(true);
        fr.setLayout(null);
    }
}
