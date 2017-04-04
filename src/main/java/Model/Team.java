package Model;

import static java.lang.Math.abs;

/**
 * Created by ttomaka on 03.04.2017.
 */
public class Team {
    private String teamName;
    private int goalsFor;
    private int goalAgainst;

    public Team(String teamName, int goalsFor, int goalAgainst) {
        this.teamName = teamName;
        this.goalsFor = goalsFor;
        this.goalAgainst = goalAgainst;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGoalDiff() {
        return abs( goalsFor - goalAgainst );
    }
}
