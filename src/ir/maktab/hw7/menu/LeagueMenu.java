package ir.maktab.hw7.menu;

public interface LeagueMenu {
    void add(String name);
    void remove(String name);
    void showAll();
    void show(String name);
    void setRace(String Team1, int goal1, String Team2, int goal2);
}
