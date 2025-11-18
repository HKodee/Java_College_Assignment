import java.applet.Applet;
import java.awt.*;

public class Controls extends Applet {
    public void init() {
        add(new Label("Name:"));
        add(new TextField(20));
        
        add(new Label("Comments:"));
        add(new TextArea(3, 20));
        
        add(new Button("Submit"));
        
        CheckboxGroup cbg = new CheckboxGroup();
        add(new Checkbox("Male", cbg, true));
        add(new Checkbox("Female", cbg, false));
        
        Choice os = new Choice();
        os.add("Windows");
        os.add("Linux");
        add(os);
        
        List l = new List(2);
        l.add("Item 1");
        l.add("Item 2");
        add(l);
        
        showStatus("This is the Status Bar");
    }
}