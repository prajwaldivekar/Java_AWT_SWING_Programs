import java.awt.*;
public class textfield {
    public static void main (String args[]){
        Frame fr = new Frame();
        Label l = new Label("Enter your name");
        TextField tf = new TextField();

        l.setBounds(100,100,100,70);
        tf.setBounds(100,180,100,70);

        fr.add(l);
        fr.add(tf);

        fr.setSize(600,600);
        fr.setLayout(null);
        fr.setVisible(true);
    }
}
