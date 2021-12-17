package lesson1;

/**
 * Java1.Competitor
 *
 * @author Pavel.Stolyarov
 * @version 17.12.2021
 */
public interface Competitor {
    void run(int dist);

    void swim(int dist);

    void jump(int height);

    boolean isOnDistance();

    void info();
}
