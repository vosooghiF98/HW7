package ir.maktab.hw7.entity;

public class FootballClub extends SportClub{
    public FootballClub(String clubName) {
        super(clubName);
    }
    protected int numberOfDraw;

    @Override
    public String toString() {
        return "FootballClub{" +
                "numberOfDraw=" + numberOfDraw +
                ", numberOfGames=" + numberOfGames +
                ", numberOfWins=" + numberOfWins +
                ", numberOfLosses=" + numberOfLosses +
                ", score=" + score +
                '}';
    }
}
