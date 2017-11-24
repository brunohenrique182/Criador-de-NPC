package view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Ficha extends JPanel implements VisualWindow {

    private Image image;
    FrameBase fb;
    
    public Ficha(FrameBase fb) {
        this.fb = fb;
        setLayout();
        setComponents();
        setEvents();
    }

    @Override
    public void setLayout() {
        setSize(600,800);
    }

    @Override
    public void setComponents() {

    }

    @Override
    public void setEvents() {

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        image = new ImageIcon(getClass().getResource("/image/bgFicha.jpg")).getImage();
        g.drawImage(image, 0, 0, this);
    }
}
