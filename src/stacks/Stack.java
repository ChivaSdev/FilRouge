package stacks;

import java.util.ArrayList;


public class Stack {

    protected ArrayList<Stackable> objectStackable;

    public Stack() {
        this.objectStackable = new ArrayList<>();
    }

    public void addObject(Stackable object) {
        this.objectStackable.add(object);
    }

    public int nbObjects() {
       return this.objectStackable.size();
    }

    public float getTotalHeight() {
        float sumHeight = 0;
        for (Stackable obj : this.objectStackable) {
            sumHeight += obj.getHeight();
        }
        return sumHeight;
    }
}
