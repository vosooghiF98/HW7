package ir.maktab.hw7.entity;


import java.util.Objects;

public class FootballLeague extends LeagueList {

    @Override
    public void setRace(String fTeam1, int goal1, String fTeam2, int goal2) {
        if (!Objects.equals(fTeam1, fTeam2)) {
            if (contains(fTeam1) && contains(fTeam2)) {
                SportClub team1 = findByName(fTeam1);
                SportClub team2 = findByName(fTeam2);
                team1.numberOfGames++;
                team2.numberOfGames++;
                if (goal1 > goal2) {
                    team1.numberOfWins++;
                    team2.numberOfLosses++;
                    team1.score += 3;
                } else if (goal1 == goal2) {
                    ((FootballClub)team1).numberOfDraw++;
                    ((FootballClub)team2).numberOfDraw++;
                    team1.score++;
                    team2.score++;
                } else {
                    team2.numberOfWins++;
                    team1.numberOfLosses++;
                    team2.score += 3;
                }
            } else {
                System.out.println("One or both of clubs not exist!");
            }

        }else {
            System.out.println("Both of clubs name is equal!");
        }
    }

}
