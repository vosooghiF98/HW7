package ir.maktab.hw7.entity;

import java.util.Arrays;

public abstract class LeagueList {
    private SportClub[] sportClubs = new SportClub[500];
    private int index = 0; // Shows last empty element of array.

    public void add(SportClub sportClub) {
        if (index == sportClubs.length) {
            sportClubs = Arrays.copyOf(sportClubs, sportClubs.length * 2);
        }
        sportClubs[index] = sportClub;
        index++;
    }

    public SportClub get(int index) {
        if (index >= this.index) {
            System.out.println("Error: given index is greater than list size!");
            return null;
        }
        return sportClubs[index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public void remove(int index) {
        if (index >= size()) {
            System.out.println("Error: given index is greater than list size!");
            return; // stopping execution of method!
        }
        // Shifting Array!
        for (int i = index; i < size(); i++) {
            sportClubs[i] = sportClubs[i+1];
        }
        this.index--;
    }

    public void remove(SportClub sportClub) {
        // Finding person
        int foundIndex = -1;
        for (int i = 0; i < index; i++) {
            if (sportClub.getClubName().equals(sportClubs[i].getClubName())) {
                foundIndex = i;
            }
        }
        if (foundIndex == -1) {
            System.out.println("No club found with given name and id!");
            return;
        }
        // Shifting Array!
        for (int i = foundIndex; i < index; i++) {
            sportClubs[i] = sportClubs[i+1];
        }
        index--;
    }

    public int size() {
        return index;
    }

    public boolean contains(String clubName) {
        for (int i = 0; i < index; i++) {
            if (clubName.equals(sportClubs[i].getClubName())){
                return true;
            }

        }
        return false;
    }

    public SportClub findByName(String clubName){
        for (int i = 0; i < index; i++) {
            if (clubName.equals(sportClubs[i].getClubName())){
                return sportClubs[i];
            }

        }
        return null;
    }

    public SportClub[] getSportClubs() {
        return Arrays.copyOf(sportClubs, sportClubs.length);
    }

    public abstract void setRace(String team1,int goal1,String team2, int goal2);

    public void sortLeague(LeagueList leagueList){
        int n = leagueList.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (sportClubs[j].score < sportClubs[j+1].score) {
                    SportClub temp = sportClubs[j];
                    sportClubs[j] = sportClubs[j+1];
                    sportClubs[j+1] = temp;
                }
    }

    @Override
    public String toString() {
        for (int i = 0; i < size(); i++) {
            System.out.println((i+1) + " - " + sportClubs[i].toString());
        }
        return null;
    }


}
