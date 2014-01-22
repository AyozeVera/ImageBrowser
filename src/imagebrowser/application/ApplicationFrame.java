package imagebrowser.application;

import imagebrowser.control.ActionListenerFactory;
import imagebrowser.ui.ImageViewerPanel;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ApplicationFrame extends JFrame {
    
    private ActionListenerFactory factory;
    private int index = 0;
    private ImageViewerPanel imageViewer;

    public ApplicationFrame(ActionListenerFactory factory) throws HeadlessException {
        super("ImageBrowser: The best way to see your photos and pictures");
        this.factory = factory;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1024,800);
       // this.setLayout(new FlowLayout());
        this.createComponents();
        this.setVisible(true);
    }

   private void createComponents() {
        this.add(createToolbarPanel(), BorderLayout.SOUTH);
        this.add(createImagePanel());
    }

    private JButton createPrevButt() {
        JButton button = new JButton("Prev");
        button.addActionListener(factory.createActionListener("Prev"));
        return button;
    }

    private JButton createNextButt() {
        JButton button = new JButton("Next");
        button.addActionListener(factory.createActionListener("Next"));
        return button;
    }

    private JPanel createImagePanel() {
        ImageViewerPanel panel = new ImageViewerPanel();
        this.imageViewer = panel;
        return panel;
    }

    private JPanel createToolbarPanel() {
        JPanel panel = new JPanel();
        panel.add(createPrevButt());
        panel.add(createNextButt());
        return panel;
    }
}
