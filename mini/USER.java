package com.final_census;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.*;

class Node2 {
    Node2 next;
    String Name, State, District, aadhar;
    char Gender;
    int age, Religion;
    long illiterate, literate;
    Node2(String Name, String State, String District, char Gender, String aadhar, int Religion, int age, long illiterate, long literate) {
        this.Name = Name;
        this.State = State;
        this.District = District;
        this.Gender = Gender;
        this.aadhar = aadhar;
        this.age = age;
        this.illiterate = illiterate;
        this.literate = literate;
        this.Religion = Religion;
    }
}
public class USER extends MLLW {
    Node2 head2;
    String aadhar, Name, State, District, UserName, Password, LUser, Lpass;
    String aadhar2, Name2, State2, District2;
    char Gender2;
    char Gender;
    int age, choice, ch, choice2, flag = 0, Religion, Religion2;
    long illiterate, literate;
    MLLW obj = new MLLW();
    Scanner in = new Scanner(System.in);
    Scanner aad = new Scanner(System.in);
    Scanner name = new Scanner(System.in);
    Scanner state = new Scanner(System.in);
    Scanner district = new Scanner(System.in);
    Scanner username = new Scanner(System.in);
    Scanner password = new Scanner(System.in);
    Scanner religion = new Scanner(System.in);

    public boolean isValidAadhaarNumber(String str) {
        return true;
//        String regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
//
//        Pattern p = Pattern.compile(regex);
//        if (str == null) {
//            return false;
//        }
//        Matcher m = p.matcher(str);
//
//        return m.matches();
    }
    void acceptAadhar() {
        System.out.println("Enter your aadhar Card number: ");
        aadhar = aad.nextLine();
        if (!isValidAadhaarNumber(aadhar)) {
            System.out.println("Please enter a valid aadhar number: ");
            acceptAadhar();
        }

    }
    void accept() {
        acceptAadhar();
        System.out.println("Enter your name:");
        Name = name.nextLine();
        System.out.println("Enter the State you live in: ");
        State = state.nextLine();
        State();
        district(State);

        if(flags==15) {
            flags = 0;
            System.out.println("Enter the District you live in: ");
            District = district.nextLine();
            Node ptr = head;
            while (ptr != null) {
                if (ptr.data.equalsIgnoreCase(State)) {
                    Node node = ptr.down;
                    while (node != null) {
                        if (node.data.equalsIgnoreCase(District)) {
                            flagd = 41;
                            break;
                        }
                        node = node.next;
                    }
                }
                ptr = ptr.next;
            }
            if (flagd == 41) {
                flagd=0;
                System.out.println("Enter your gender(Male:M/ Female:F/ Other:O): ");
                Gender = in.next().toLowerCase().charAt(0);
                do {
                    flag = 0;
                    System.out.println("1.Hindu\n2.Buddhist\n3.Muslim\n4.Jain\n5.Christian\n6.Sikh\n7.Other");
                    System.out.println("Enter the number according to your religion: ");
                    Religion = religion.nextInt();
                    if (Religion < 1 || Religion > 7) {
                        System.out.println("Please enter a valid religion");
                        flag = 1;
                    }
                } while (flag == 1);
                System.out.println("Enter your age: ");
                age = in.nextInt();

                if (age > 7) {
                    System.out.println("1.No education");
                    System.out.println("2.Below primary(below grade 5)");
                    System.out.println("3.Primary(grade 5-7)");
                    System.out.println("4.Middle School(grade 8-9)");
                    System.out.println("6.Lower Secondary(grade 10-11)");
                    System.out.println("7.Higher Secondary(grade 12)");
                    System.out.println("8.Beyond Secondary school");
                    System.out.println("Please enter your education level:");
                    choice = in.nextInt();
                    switch (choice) {
                        case 1 -> illiterate++;
                        case 2, 3, 4, 5, 6, 7, 8 -> literate++;
                        default -> System.out.println("Please enter a valid choice");
                    }
                }
                increment(State, Gender, District, choice, Religion);
            }else{
                System.out.println("District not found");
            }
        }

    }
    void increment(String State, char gender, String District, int education, int Religion) {
        // Information();
        Node found = null;
        Node temp = head;
        flag = 0;
        while (temp != null && flag == 0) {
            if (temp.data.equalsIgnoreCase(State)) {
                Node node = temp.down;
                if (node == null) {
                    return;
                }
                while (node != null && flag == 0) {
                    if (node.data.equalsIgnoreCase(District)) {
                        found = node;
                        flag = 1;

                    } else {
                        node = node.next;
                    }
                }
            } else {
                temp = temp.next;
            }
        }
        if (gender == 'f') {
            assert found != null;
            found.Fpopulation = found.Fpopulation + 1;//INCR female pop
            if (education > 2) {//incr literacy rate
                double new_Fliterates = (found.FLiteracy * found.Fpopulation / 100) + 1;
                found.FLiteracy = new_Fliterates / found.Fpopulation * 100;
            }
            switch (Religion) {
                case 1 -> {
                    double new_Hpeeps = (found.HinduP22 * found.Tpopulation / 100) + 1;
                    found.HinduP22 = new_Hpeeps / found.Tpopulation * 100;
                }
                case 2 -> {
                    double new_Bpeeps = (found.BuddhistP22 * found.Tpopulation / 100) + 1;
                    found.BuddhistP22 = new_Bpeeps / found.Tpopulation * 100;
                }
                case 3 -> {
                    double new_Mpeeps = (found.MuslimP22 * found.Tpopulation / 100) + 1;
                    found.MuslimP22 = new_Mpeeps / found.Tpopulation * 100;
                }
                case 4 -> {
                    double new_Jpeeps = (found.JainP22 * found.Tpopulation / 100) + 1;
                    found.JainP22 = new_Jpeeps / found.Tpopulation * 100;
                }
                case 5 -> {
                    double new_Cpeeps = (found.ChristianP22 * found.Tpopulation / 100) + 1;
                    found.ChristianP22 = new_Cpeeps / found.Tpopulation * 100;
                }
                case 6 -> {
                    double new_Speeps = (found.SikhP22 * found.Tpopulation / 100) + 1;
                    found.SikhP22 = new_Speeps / found.Tpopulation * 100;
                }
                case 7 -> {
                    double new_Opeeps = (found.OtherP22 * found.Tpopulation / 100) + 1;
                    found.OtherP22 = new_Opeeps / found.Tpopulation * 100;
                }
                default -> System.out.println("Invalid input!");
            }
        } else {
            assert found != null;
            found.Mpopulation = found.Mpopulation + 1;
            if (education > 2) {
                double new_Mliterates = (found.MLiteracy * found.Mpopulation / 100) + 1;
                found.MLiteracy = new_Mliterates / found.Mpopulation * 100;
            }
        }
        System.out.println(" Old Total Population: " + found.Tpopulation);
        Node newNode = new Node(District, found.Mpopulation, found.Fpopulation, found.MLiteracy, found.FLiteracy, found.Mpopulation11, found.Fpopulation11, found.MLiteracy11, found.FLiteracy11, found.Mpopulation01, found.Fpopulation01, found.MLiteracy01, found.FLiteracy01, found.HinduP22, found.BuddhistP22, found.MuslimP22, found.JainP22, found.ChristianP22, found.SikhP22, found.OtherP22, found.HinduP11, found.BuddhistP11, found.MuslimP11, found.JainP11, found.ChristianP11, found.SikhP11, found.OtherP11, found.HinduP01, found.BuddhistP01, found.MuslimP01, found.JainP01, found.ChristianP01, found.SikhP01, found.OtherP01);
        if (found.next != null)
            found.next.prev = newNode; //connecting next to the new node

        //found.prev.next = newNode; //connecting previous to the new node
        System.out.println(" New Total Population: " + newNode.Tpopulation);

    }
    void insertPerson() {
        accept();
        Node2 newNode = new Node2(Name, State, District, Gender, aadhar, Religion, age, illiterate, literate);
        if (head2 == null) {
            head2 = newNode;
            return;
        }
        Node2 temp = head2;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        newNode = temp;
    }
    void update() {
        System.out.println("Please enter your aadhar number: ");
        aadhar2 = aad.nextLine();
        Node2 temp = head2;
        if (head2 == null) {
            return;
        }
        while (temp != null) {
            if (temp.aadhar.equals(aadhar2)) {
                flag=7;
                System.out.println("Please enter what you want to update:");
                System.out.println("1.Name");
                System.out.println("2.State");
                System.out.println("3.District");
                System.out.println("4.Gender");
                System.out.println("5.Religion");
                choice2 = in.nextInt();
                switch (choice2) {
                    case 1 -> {
                        System.out.println("Enter your new name: ");
                        Name2 = name.nextLine();
                        temp.Name = Name2;
                    }
                    case 2 -> {
                        State();
                        System.out.println("Enter your new State: ");
                        State2 = state.nextLine();
                        temp.State = State2;
                        district(State2);
                        if(flags==15) {
                            flags=0;
                            System.out.println("Enter your new District: ");
                            District2 = district.nextLine();
                            temp.District = District2;
                        }
                    }
                    case 3 -> {
                        district(State);
                        System.out.println("Enter your new District: ");
                        District2 = district.nextLine();
                        temp.District = District2;
                    }
                    case 4 -> {
                        System.out.println("Enter your new Gender: ");
                        Gender2 = in.next().charAt(0);
                        temp.Gender = Gender2;
                    }
                    case 5 -> {
                        System.out.println("1.Hindu\n2.Buddhist\n3.Muslim\n4.Jain\n5.Christian\n6.Sikh\n7.Other");
                        System.out.println("Enter a new Religion: ");
                        Religion2 = religion.nextInt();
                        temp.Religion = Religion2;
                    }
                    default -> {
                        System.out.println("Please enter a valid choice: ");
                        update();
                    }
                }
                return;
            } else {
                temp = temp.next;
            }
        }
        if(flag!=7){
            System.out.println("This aadhar number doesn't exist in our data");
            flag=0;
        }
    }
    void user_display(){
        System.out.println("Enter your aadhar number");
        String user_aadhar=aad.nextLine();
        Node2 ptr=head2;
        while(ptr!=null){
            if(ptr.aadhar.equals(user_aadhar)){
                flag=3;
                System.out.println("******** Your details ********");
                System.out.println("Name: "+ptr.Name);
                System.out.println("State: "+ptr.State);
                System.out.println("District: "+ptr.District);
                System.out.println("Gender: "+ptr.Gender);
                System.out.println("Age: "+ptr.age);
                switch(ptr.Religion){
                    case 1-> System.out.println("Religion: Hindu");
                    case 2-> System.out.println("Religion: Buddhist");
                    case 3-> System.out.println("Religion: Muslim");
                    case 4-> System.out.println("Religion: Jain");
                    case 5-> System.out.println("Religion: Christian");
                    case 6-> System.out.println("Religion: Sikh");
                    case 7-> System.out.println("Religion: Others/not stated");

                }
                return;
            }
            ptr=ptr.next;
        }
        if(flag!=3){
            System.out.println("Your data is not in this data");
        }

    }
    boolean LoginSignup() {
        return true;
//        System.out.println("******** Sign Up *******");
//        System.out.println("Enter your username: ");
//        UserName = username.nextLine();
//        System.out.println("Enter your password: ");
//        Password = password.nextLine();
//        int attempts = 0;
//        if ((UserName != null && Password != null) && !UserName.equals(Password)) {
//            System.out.println("Successfully signed up! Please log in");
//            while (attempts < 3) {
//                System.out.println("Enter your username: ");
//                LUser = username.nextLine();
//                System.out.println("Enter your Password: ");
//                Lpass = password.nextLine();
//                if (LUser.equals(UserName) && Lpass.equals(Password)) {
//                    System.out.println("Successfully logged in");
//                    flag = 1;
//                    return true;
//                } else {
//                    attempts++;
//                    System.out.println("Incorrect Username or Password, retry");
//                    if (attempts == 3) {
//                        System.out.println("Too many attempts");
//                    }
//                }
//            }
//        } else {
//            System.out.println("Username and password should not be empty or same");
//            LoginSignup();
//        }
//        return flag == 1;
    }
}