package ir.maktab.hw7.entity;

public class VolleyballLeague extends LeagueList{

    @Override
    public void setRace(String fTeam1, int set1, String fTeam2, int set2) {
        if (contains(fTeam1) && contains(fTeam2)) {
            SportClub team1 = findByName(fTeam1);
            SportClub team2 = findByName(fTeam2);
            team1.numberOfGames++;
            team2.numberOfGames++;
            if (set1 - set2 > 2){
                team1.numberOfWins++;
                team2.numberOfLosses++;
                team1.score += 3;
            }else if (set1 - set2 == 1){
                team1.numberOfWins++;
                team2.numberOfLosses++;
                team1.score += 2;
                team2.score += 1;
            }else if (set2 - set1 > 2){
                team2.numberOfWins++;
                team1.numberOfLosses++;
                team2.score += 3;
            }else if (set2 - set1 == 1){
                team2.numberOfWins++;
                team1.numberOfLosses++;
                team2.score += 2;
                team1.score += 1;
            }else if (set1 == set2){
                System.out.println("Both of sets should be not equal!");
            }
        }
    }
}
