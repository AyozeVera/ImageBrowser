package imagebrowser.ui;

import imagebrowser.model.Bitmap;
import java.awt.image.BufferedImage;


public class SwingBitmap implements Bitmap {
    private BufferedImage bufferedImage;
 
    public SwingBitmap(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }
 
    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }
}
