package sharing;

/**
 * An interface for all objects that can be shared
 */
public interface Sharable {

    public Sharable share(int nbPersons);

    public Sharable remainder(int nbPersons);

}