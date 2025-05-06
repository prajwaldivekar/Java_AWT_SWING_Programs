import java.awt.*;
public class menubar {
  public static void main(String[] args) {
    Frame fr = new Frame();
    MenuBar mb = new MenuBar(); //Menubar horizontally bar on top of screen

    Menu m1 = new Menu("File");// In Manubar their are options like "file" , "insert"
    Menu m2 = new Menu("Edit");// In Manubar their are options like "file" , "insert"

    MenuItem mi1 = new MenuItem("Save"); // MenuItems
    MenuItem mi2 = new MenuItem("Delete");
    
    MenuItem mi3 = new MenuItem("Cut");
    MenuItem mi4 = new MenuItem("Copy");
    MenuItem mi5 = new MenuItem("Paste");

    m1.add(mi1);  // MenuItems are added into menu
    m1.add(mi2);
    m2.add(mi3);
    m2.add(mi4);
    m2.add(mi5);

    Menu m3 = new Menu("Save as"); // Creating other menu

    MenuItem mi6 = new MenuItem(".png");
    MenuItem mi7 = new MenuItem(".jpg");

    m3.add(mi6);
    m3.add(mi7);

    m1.add(m3); // this menu are added into  [MenuItem mi1 = new MenuItem("Save");]

    mb.add(m1); //menuitem are added into manubar
    mb.add(m2);

    fr.setSize(400,400);
    fr.setVisible(true);
    fr.setLayout(null);

  }  
}
