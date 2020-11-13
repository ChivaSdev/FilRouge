package stacks;


/**
 * Class which represents an artwork object. This class implements the interface Stackable
 */
public class Artwork {

    protected String author;

    protected String title;

    /**
     * Build a new instance
     * @param author : author of the artwork
     * @param title : artwork's title
     */
    public Artwork(String author, String title){
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

}
