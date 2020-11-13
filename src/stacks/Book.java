package stacks;

public class Book extends Artwork implements Stackable {
    
    protected int nbPages;
    public static final float PAGE_HEIGHT = 0.01f;

    public Book(String author, String title, int nbPages) {
        super(author, title);
        this.nbPages = nbPages;
    }

    public int getNbPages() {
        return this.nbPages;
    }

    @Override
    public float getHeight() {
        return this.getNbPages() * PAGE_HEIGHT;
    }
}
