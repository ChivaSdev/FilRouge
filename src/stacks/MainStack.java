package stacks;

public class MainStack {
    
    public static void main(String [] args) {

        Box box = new Box(1.5f, 2.5f, 0.5f);
        Book book = new Book("Me", "My Book", 399);
        Painting painting = new Painting("Me", "My paint");
        BoxedPainting boxedPainting = new BoxedPainting(painting, box);

        Stack objects = new Stack();
        objects.addObject(box);
        objects.addObject(book);
        objects.addObject(boxedPainting);

        System.out.println("Height of the box : " + box.getHeight());
        System.out.println("Height of the book : " + book.getHeight());
        System.out.println("Height of the boxed Painting : " + boxedPainting.getHeight());
        System.out.println("Total height of the stacked objects : " + objects.getTotalHeight());

    } 
}
