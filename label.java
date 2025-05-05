import java.awt.*;
public class label {
    public static void main(String[] args) {
        Frame fr = new Frame("Label");
        Label l = new Label("First Label");

        fr.add(l);
        l.setBounds(100, 100, 50, 50);
        
        fr.setVisible(true);
        fr.setSize(800,800);
        fr.setLayout(null);
    }
}
