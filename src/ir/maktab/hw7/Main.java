package ir.maktab.hw7;

import ir.maktab.hw7.menu.FootballMenu;
import ir.maktab.hw7.menu.VolleyballMenu;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    //check function input
    public static int check(int first, int last) {
        int button;
        while (true) {
            if (input.hasNextInt()) {
                int temp = input.nextInt();
                if (temp >= first && temp <= last) {
                    button = temp;
                    return button;
                } else {
                    System.out.print("Enter Number Between" + first + "and" + last + " : ");
                }
            } else {
                System.out.print("Enter Number! : ");
                input.next();
            }
        }
    }
    public static void main(String[] args) {
        FootballMenu footballMenu = new FootballMenu();
        VolleyballMenu volleyballMenu = new VolleyballMenu();
        System.out.println("Menu :");
        System.out.println("Football league : 1");
        System.out.println("Volleyball league : 2");
        System.out.print("Enter Your Function : ");
        int button = check(1,2);
        if (button == 1){
            do {
                System.out.println("Menu :");
                System.out.println("Add FC : 1");
                System.out.println("Remove FC : 2");
                System.out.println("Add Race : 3");
                System.out.println("Show FC : 4");
                System.out.println("Show League : 5");
                System.out.println("Exit : 6");
                System.out.print("Enter Your Function : ");
                button = check(1,6);
                if (button == 1) {
                    System.out.print("Enter club name : ");
                    input.nextLine();
                    String name = input.nextLine();
                    footballMenu.add(name);
                    System.out.println("FC added.");
                }
                if (button == 2) {
                    System.out.print("Enter club name : ");
                    input.nextLine();
                    String name = input.nextLine();
                    footballMenu.remove(name);
                    System.out.println("FC removed.");
                }
                if (button == 3) {
                    System.out.print("Enter club name : ");
                    input.nextLine();
                    String club1 = input.nextLine();
                    System.out.print("Enter number of goal : ");
                    int goal1 = check(0,100);
                    System.out.print("Enter club name : ");
                    input.nextLine();
                    String club2 = input.nextLine();
                    System.out.print("Enter number of goal : ");
                    int goal2 = check(0,100);
                    footballMenu.setRace(club1, goal1, club2, goal2);
                }
                if (button == 4) {
                    System.out.print("Enter club name : ");
                    input.nextLine();
                    String name = input.nextLine();
                    footballMenu.show(name);
                }
                if (button == 5) {
                    footballMenu.showAll();
                }
            } while (button != 6);
        }
        if (button == 2){

            do {
                System.out.println("Menu :");
                System.out.println("Add VC : 1");
                System.out.println("Remove VC : 2");
                System.out.println("Add Race : 3");
                System.out.println("Show VC : 4");
                System.out.println("Show League : 5");
                System.out.println("Exit : 6");
                System.out.print("Enter Your Function : ");
                button = check(1,6);
                if (button == 1) {
                    System.out.print("Enter club name : ");
                    input.nextLine();
                    String name = input.nextLine();
                    volleyballMenu.add(name);
                    System.out.println("VC added.");
                }
                if (button == 2) {
                    System.out.print("Enter club name : ");
                    input.nextLine();
                    String name = input.nextLine();
                    volleyballMenu.remove(name);
                    System.out.println("VC removed.");
                }
                if (button == 3) {
                    System.out.print("Enter club name : ");
                    input.nextLine();
                    String club1 = input.nextLine();
                    System.out.print("Enter number of set : ");
                    int set1 = check(0,3);
                    System.out.print("Enter club name : ");
                    input.nextLine();
                    String club2 = input.nextLine();
                    System.out.print("Enter number of set : ");
                    int set2 = check(0,3);
                    volleyballMenu.setRace(club1, set1, club2, set2);
                }
                if (button == 4) {
                    System.out.print("Enter club name : ");
                    input.nextLine();
                    String name = input.nextLine();
                    volleyballMenu.show(name);
                }
                if (button == 5) {
                    volleyballMenu.showAll();
                }
            } while (button != 6);
        }

    }
}