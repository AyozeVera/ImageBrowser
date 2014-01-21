package imagebrowser.model;

public class RealImage extends Image {
    
    private final Bitmap bitmap;
    private final Dimension dimension;

    public RealImage(Bitmap bitmap, Dimension dimension) {
        this.bitmap = bitmap;
        this.dimension = dimension;
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }

    @Override
    public Bitmap getBitmap() {
        return bitmap;
    }

    @Override
    public Image getNext() {
        return null;
    }

    @Override
    public Image getPrev() {
        return null;
    }

    @Override
    public void setNext(Image image) {
    }

    @Override
    public void setPrev(Image image) {
    }

}
