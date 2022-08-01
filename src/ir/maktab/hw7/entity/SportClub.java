package ir.maktab.hw7.entity;

import java.util.Objects;

public class SportClub {

    private String clubName;
    protected int numberOfGames;
    protected int numberOfWins;
    protected int numberOfLosses;
    protected int numberOfDraw;
    protected int score;
    public SportClub (String clubName){
        this.clubName = clubName;
        numberOfGames = 0;
        numberOfLosses = 0;
        numberOfWins = 0;
        score = 0;
    }


    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }


    @Override
    public String toString() {
        return "SportClub{" +
                "clubName='" + clubName + '\'' +
                ", numberOfGames=" + numberOfGames +
                ", numberOfWins=" + numberOfWins +
                ", numberOfLosses=" + numberOfLosses +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SportClub sportClub = (SportClub) o;

        if (numberOfGames != sportClub.numberOfGames) return false;
        if (numberOfWins != sportClub.numberOfWins) return false;
        if (numberOfLosses != sportClub.numberOfLosses) return false;
        if (score != sportClub.score) return false;
        return Objects.equals(clubName, sportClub.clubName);
    }

    @Override
    public int hashCode() {
        int result = clubName != null ? clubName.hashCode() : 0;
        result = 31 * result + numberOfGames;
        result = 31 * result + numberOfWins;
        result = 31 * result + numberOfLosses;
        result = 31 * result + score;
        return result;
    }
}
