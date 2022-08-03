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
                ", numberOfDraw=" + numberOfDraw +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportClub sportClub = (SportClub) o;
        return clubName.equals(sportClub.clubName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clubName);
    }
}
