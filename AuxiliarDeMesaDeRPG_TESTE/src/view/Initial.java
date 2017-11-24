package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Initial extends JPanel implements VisualWindow {

    private Image image;
    private JButton btCREATE, btLOAD, btRemove;
    private PanelInternal pInternal;
    FrameBase fb;
    
    public Initial(FrameBase fb) {
        this.fb = fb;
        setLayout();
        setComponents();
        setEvents();
    }

    @Override
    public void setLayout() {
        setSize(900, 652);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void setComponents() {
        btCREATE = new JButton("Create");
        btLOAD = new JButton("Load");
        btRemove = new JButton("Remove");
        pInternal = new PanelInternal();
        
        btCREATE.setBounds(15, 30, 80, 30);
        btLOAD.setBounds(15, 60, 80, 30);
        btRemove.setBounds(15, 90, 80, 30);
        pInternal.setBounds(200, 100, 650, 500);
        
        add(btCREATE);
        add(btLOAD);
        add(btRemove);
        add(pInternal);
    }

    @Override
    public void setEvents() {
      btLOAD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fb.showPanels(PanelBase.FICHA);

			}
		});
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        image = new ImageIcon(getClass().getResource("/image/background.jpg")).getImage();
        g.drawImage(image, 0, 0, this);
    }
    
    

}
