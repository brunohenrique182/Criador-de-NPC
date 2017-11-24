package view;

import java.awt.CardLayout;
import javax.swing.JPanel;

public class PanelBase extends JPanel implements VisualWindow {

    private Initial initial;
    private Ficha ficha;
    FrameBase fb;
    
    public static final int INITIAL = 1;
    public static final int FICHA = 2;

    public PanelBase(FrameBase fb) {
        this.fb = fb;
        setLayout();
        setComponents();
        setEvents();
    }

    @Override
    public void setLayout() {
        setSize(600, 800);
        setLayout(new CardLayout());
        setVisible(true);
    }

    @Override
    public void setComponents() {
        initial = new Initial(fb);
       ficha = new Ficha(fb);
        add(initial, "initial");
        add(ficha, "ficha");
    }

    @Override
    public void setEvents() {

    }
}
