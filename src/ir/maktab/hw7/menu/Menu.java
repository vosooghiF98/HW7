package ir.maktab.hw7.menu;

import ir.maktab.hw7.entity.*;


public class Menu {
    static FootballLeague footballLeague = new FootballLeague();
    static VolleyballLeague volleyballLeague = new VolleyballLeague();
    public static void addFC(String name){
        if (footballLeague.contains(name)){
            System.out.println("This club is exist!");
        }else {
            SportClub footballClub = new FootballClub(name);
            footballLeague.add(footballClub);
        }
    }

    public static void removeFC(String name){
        if (footballLeague.contains(name)){
            footballLeague.remove(footballLeague.findByName(name));
        }else {
            System.out.println("This club not exist!");
        }
    }

    public static void addVC(String name){
        if (volleyballLeague.contains(name)){
            System.out.println("This club is exist!");
        }else {
            SportClub volleyballClub = new VolleyballClub(name);
            volleyballLeague.add(volleyballClub);
        }
    }

    public static void removeVC(String name){
        if (volleyballLeague.contains(name)){
            volleyballLeague.remove(volleyballLeague.findByName(name));
        }else {
            System.out.println("This club not exist!");
        }
    }

    public static void showAllFC(){
        if (footballLeague.size()>0){
            footballLeague.sortLeague(footballLeague);
            footballLeague.toString();
        }else {
            System.out.println("This league is empty!");
        }
    }

    public static void showAllVC(){
        if (volleyballLeague.size() > 0){
            volleyballLeague.sortLeague(volleyballLeague);
            volleyballLeague.toString();
        }else {
            System.out.println("This league is empty!");
        }
    }

    public static void showFC(String name){
        if (footballLeague.contains(name)){
            System.out.println(footballLeague.findByName(name).toString());
        }else {
            System.out.println("This club not exist!");
        }
    }

    public static void showVC(String name){
        if (volleyballLeague.contains(name)){
            System.out.println(volleyballLeague.findByName(name).toString());
        }else {
            System.out.println("This club not exist!");
        }
    }

    public static void setRaceFC(String fTeam1, int goal1, String fTeam2, int goal2){
        footballLeague.setRace(fTeam1,goal1,fTeam2,goal2);
    }

    public static void setRaceVC(String fTeam1, int goal1, String fTeam2, int goal2){
        volleyballLeague.setRace(fTeam1,goal1,fTeam2,goal2);
    }


}
