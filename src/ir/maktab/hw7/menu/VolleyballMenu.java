package ir.maktab.hw7.menu;

import ir.maktab.hw7.entity.SportClub;
import ir.maktab.hw7.entity.VolleyballClub;
import ir.maktab.hw7.entity.VolleyballLeague;

public class VolleyballMenu implements LeagueMenu{
    static VolleyballLeague volleyballLeague = new VolleyballLeague();
    public void add(String name){
        if (volleyballLeague.contains(name)){
            System.out.println("This club is exist!");
        }else {
            SportClub volleyballClub = new VolleyballClub(name);
            volleyballLeague.add(volleyballClub);
        }
    }

    public void remove(String name){
        if (volleyballLeague.contains(name)){
            volleyballLeague.remove(volleyballLeague.findByName(name));
        }else {
            System.out.println("This club not exist!");
        }
    }
    public void showAll(){
        if (volleyballLeague.size() > 0){
            volleyballLeague.sortLeague(volleyballLeague);
            volleyballLeague.toString();
        }else {
            System.out.println("This league is empty!");
        }
    }
    public void show(String name){
        if (volleyballLeague.contains(name)){
            System.out.println(volleyballLeague.findByName(name).toString());
        }else {
            System.out.println("This club not exist!");
        }
    }
    public void setRace(String fTeam1, int goal1, String fTeam2, int goal2){
        volleyballLeague.setRace(fTeam1,goal1,fTeam2,goal2);
    }
}
