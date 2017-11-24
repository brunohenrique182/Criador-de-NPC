
package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class PanelInternal extends JPanel implements VisualWindow{

    private JTable table;
    
    public PanelInternal(){
        setLayout();
        setComponents();
        setEvents();
    }
    
    @Override
    public void setLayout() {
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void setComponents() {
        
        table = new JTable();
        JScrollPane scroll = new JScrollPane(table);
        
        scroll.setBounds(0, 0, 650, 500);
        
        add(scroll);
    }

    @Override
    public void setEvents() {
        
    }
    
}
