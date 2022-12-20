package com.final_census;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin();
        USER user = new USER();
        int choice, ynAdmin, ynUser;
        System.out.println("**----*----*----*----*----*----*----*----*----*----*----*----*----*----*----**");
        System.out.println("\t\t\t\t  | WELCOME TO INDIAN CENSUS RECORDS | ");
        System.out.println("**----*----*----*----*----*----*----*----*----*----*----*----*----*----*----**");
        System.out.println("Please choose who are you:");
        System.out.println("1.ADMIN");
        System.out.println("2.USER");
        choice = sc.nextInt();
        MLLW obj = new MLLW();
        admin.Information();
        user.Information();
        switch (choice) {
            case 1 -> {
                if (admin.login() == true) {
                    do {
                        System.out.println("**----*----*----* ADMIN PAGE *----*----*----**");
                        System.out.println("What do you want to do?");
                        System.out.println("1.Add a state");
                        System.out.println("2.Add a district");
                        System.out.println("3.Update a state");
                        System.out.println("4.Update a District");
                        System.out.println("5.Delete a state");
                        System.out.println("6.Delete a district");
                        System.out.println("7.Comparison of population/Literacy(of State/district)");
                        System.out.println("8.Display entire India census");
                        System.out.println("9.Display all attributes of any state or district");

                        int ch = sc.nextInt();
                        switch (ch) {
                            case 1 -> admin.addState();
                            case 2 -> admin.addDistrict();
                            case 3 -> admin.Update_State();
                            case 4 -> admin.Update_District();
                            case 5 -> admin.Delete_State();
                            case 6 -> admin.Delete_District();
                            case 7 -> admin.comparison();
                            case 8 -> admin.displayIndia();
                            case 9 -> admin.displayAllAttributesState();
                            default -> System.out.println("Enter a valid input");
                        }
                        System.out.println("Do you want to continue?1.Yes 0.No");
                        ynAdmin = sc.nextInt();

                    } while (ynAdmin == 1);
                } else {
                    System.out.println("Incorrect username or password");
                    admin.login();
                }
            }
            case 2 -> {
                if (user.LoginSignup() == true) {
                    do {
                        System.out.println("**----*----*----* CITIZEN PAGE *----*----*----**");
                        System.out.println("What do you want to do?");
                        System.out.println("1.Enter your data in the census");
                        System.out.println("2.Update your data");
                        System.out.println("3.See your details");
                        System.out.println("4.Comparison of population/Literacy(of State/district)");
                        System.out.println("5.Display all attributes of a state/district ");
                        System.out.println("6.Display Entire India census");
                        int ch2 = sc.nextInt();
                        switch (ch2) {
                            case 1 -> user.insertPerson();
                            case 2 -> user.update();
                            case 3->user.user_display();
                            case 4 -> admin.comparison();
                            case 5-> admin.displayAllAttributesState();
                            case 6-> admin.displayIndia();
                            default -> System.out.println("Enter a valid input");
                        }
                        System.out.println("Do you want to continue? 1.Yes 0.No");
                        ynUser = sc.nextInt();
                    } while (ynUser == 1);
                }
            }
        }
    }
}
