import java.awt.Checkbox;
import java.awt.Frame;

public class checkbox {
    public static void main(String[] args) {
        Frame fr = new Frame();
        Checkbox cb1 = new Checkbox("java", true);
        Checkbox cb2 = new Checkbox("c++");

        cb1.setBounds(100,100,40,40);
        cb2.setBounds(100,170,40,40);

        fr.add(cb1);
        fr.add(cb2);

        fr.setSize(600,600);
        fr.setVisible(true);
        fr.setLayout(null);
    }
}
