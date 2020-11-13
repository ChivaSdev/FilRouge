package stacks;


/**
 * Class which represents a box object. This class implements the interface Stackable
 */
public class Box implements Stackable {

    protected float length;

    protected float width;

    protected float height;

    /**
     * Builds a new instance.
     * @param length : length of the box
     * @param width : width of the box
     * @param height : height of the box
     */
    public Box(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public float getLength() {
        return this.length;
    }

    public float getWidth() {
        return this.width;
    }

    @Override
    public float getHeight() {
        return this.height;
    }
}
