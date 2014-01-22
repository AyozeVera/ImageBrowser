package imagebrowser.persistence;

import imagebrowser.model.Bitmap;
import imagebrowser.model.Image;
import imagebrowser.ui.SwingBitmap;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageLoader {
    private final String fileName;

   ImageLoader(String fileName) {
        this.fileName = fileName;
    }
    public Image load() throws IOException{
            return RealImage(loadBitmap());
    }

    private Bitmap loadBitmap() throws IOException{
        return new SwingBitmap(loadBufferedImage());
    }

    private BufferedImage loadBufferedImage() throws IOException {
        return ImageIO.read(new File(fileName));
    }

    private Image RealImage(Bitmap loadBitmap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
