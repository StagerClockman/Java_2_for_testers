package lesson1;

/**
 * Java1.Team
 *
 * @author Pavel.Stolyarov
 * @version 17.12.2021
 */
public class Team {

    String nameTeam ;

    Competitor[] partner = new Competitor[3];
    public Team(String nameTeam, Competitor com1, Competitor com2, Competitor com3 ) {
        this.nameTeam  = nameTeam;

        partner[0] = com1;
        partner[1] = com2;
        partner[2] = com3;
    }

    public void passedTheDistance() {
        for (Competitor com : partner) {
            if (com.isOnDistance()) {
                com.info();
            }
        }
    }

    public void showResults() {
        for (Competitor com : partner) {
            com.info();
        }
    }

    public Competitor[] getTeammates() {
        return partner;
    }
}
