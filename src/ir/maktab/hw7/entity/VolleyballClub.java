package ir.maktab.hw7.entity;

public class VolleyballClub extends SportClub{
    public VolleyballClub(String clubName) {
        super(clubName);
    }

    @Override
    public String toString() {
        return "VolleyballClub{" +
                "numberOfGames=" + numberOfGames +
                ", numberOfWins=" + numberOfWins +
                ", numberOfLosses=" + numberOfLosses +
                ", score=" + score +
                '}';
    }
}
