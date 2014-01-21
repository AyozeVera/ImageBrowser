package imagebrowser.ui;

public class ConsoleImageViewer extends ImageViewer {
    
    @Override
    public void refresh() {
        System.out.print(((SwingBitmap)getImage().getBitmap()).getBufferedImage());
        System.out.print("x");
        System.out.print(getImage().getDimension().getHeight());
        System.out.println("");
    }

}
