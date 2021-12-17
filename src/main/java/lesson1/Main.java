package lesson1;

/**
 * Java1.Ьфшт
 *
 * @author Pavel.Stolyarov
 * @version 17.12.2021
 */
public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Cross(80), new Water(3), new Wall(5));
        Team team = new Team("Heroes", new Turtle("Bob"), new Cat("Murzik"), new Wolf("Grey"));
        c.doIt(team);

        System.out.println("\nWinners:");
        team.passedTheDistance();

        System.out.println("\nResult:");
        team.showResults();
    }
}
