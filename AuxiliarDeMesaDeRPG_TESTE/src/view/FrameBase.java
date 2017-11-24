package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FrameBase extends JFrame implements VisualWindow {

    private PanelBase pb;
    private CardLayout cl;

    public FrameBase() {
        setComponents();
        setEvents();
        setLayout();
    }

    @Override
    public void setLayout() {
        setSize(910, 685);
        setVisible(true);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        repaintAll();
    }

    @Override
    public void setComponents() {
        pb = new PanelBase(this);
        cl = new CardLayout();
        cl = (CardLayout) pb.getLayout();

        add(pb, BorderLayout.CENTER);
    }

    @Override
    public void setEvents() {

    }

    private void repaintAll() {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                repaint();
            }
        });
    }
    
    public void showPanels(int panelBaseConstants) {
		switch (panelBaseConstants) {
		case 1:
			cl.show(pb, "initial");
			break;
		case 2:
			cl.show(pb, "ficha");
			break;
		//case 3:
		//	cl.show(panelBase, "tela2");
		//	break;
		default:
			break;
		}
	}

}
