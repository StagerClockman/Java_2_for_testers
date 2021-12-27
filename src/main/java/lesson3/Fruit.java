package lesson3;

/**
 * Java1.Fruit
 *
 * @author Pavel.Stolyarov
 * @version 27.12.2021
 */
abstract class Fruit {
    private float weight;

    Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
