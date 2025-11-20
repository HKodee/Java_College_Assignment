import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SwingTable extends JFrame {

    SwingTable() {
        setTitle("JTable Example");
        
        String[][] data = {
            { "101", "Ravi", "85" },
            { "102", "Sunil", "90" },
            { "103", "Anil", "78" }
        };
        
        String[] columnNames = { "Roll No", "Name", "Marks" };

        JTable table = new JTable(data, columnNames);
        
        JScrollPane scrollPane = new JScrollPane(table);
        
        add(scrollPane);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingTable();
    }
}