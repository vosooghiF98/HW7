package ir.maktab.hw7.menu;

import ir.maktab.hw7.entity.*;


public class FootballMenu implements LeagueMenu {
    static FootballLeague footballLeague = new FootballLeague();

    public void add(String name){
        if (footballLeague.contains(name)){
            System.out.println("This club is exist!");
        }else {
            SportClub footballClub = new FootballClub(name);
            footballLeague.add(footballClub);
        }
    }

    public void remove(String name){
        if (footballLeague.contains(name)){
            footballLeague.remove(footballLeague.findByName(name));
        }else {
            System.out.println("This club not exist!");
        }
    }



    public void showAll(){
        if (footballLeague.size()>0){
            footballLeague.sortLeague(footballLeague);
            footballLeague.toString();
        }else {
            System.out.println("This league is empty!");
        }
    }



    public void show(String name){
        if (footballLeague.contains(name)){
            System.out.println(footballLeague.findByName(name).toString());
        }else {
            System.out.println("This club not exist!");
        }
    }



    public void setRace(String fTeam1, int goal1, String fTeam2, int goal2){
        footballLeague.setRace(fTeam1,goal1,fTeam2,goal2);
    }




}
