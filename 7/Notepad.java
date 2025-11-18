import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Notepad extends Frame {
    Notepad() {
        setTitle("Simple Notepad");
        setSize(500, 400);
        MenuBar mb = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        fileMenu.add(new MenuItem("New"));
        fileMenu.add(new MenuItem("Open"));
        fileMenu.add(new MenuItem("Save"));
        editMenu.add(new MenuItem("Cut"));
        editMenu.add(new MenuItem("Copy"));
        editMenu.add(new MenuItem("Paste"));
        mb.add(fileMenu);
        mb.add(editMenu);
        setMenuBar(mb);
        add(new TextArea());        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new Notepad();
    }
}