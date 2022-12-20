package com.final_census;

import java.util.Scanner;

class Node {
    String data;
    long Tpopulation, Mpopulation, Fpopulation, Tpopulation11, Mpopulation11, Fpopulation11, Tpopulation01, Mpopulation01, Fpopulation01;
    double HinduP22, BuddhistP22, MuslimP22, JainP22, ChristianP22, SikhP22, OtherP22, HinduP11, BuddhistP11, MuslimP11, JainP11, ChristianP11, SikhP11, OtherP11, HinduP01, BuddhistP01, MuslimP01, JainP01, ChristianP01, SikhP01, OtherP01;
    float agePer;
    double AvgLiteracy, AvgLiteracy11, AvgLiteracy01, MLiteracy, FLiteracy, MLiteracy11, FLiteracy11, MLiteracy01, FLiteracy01;
    int SexRatio, SexRatio11, SexRatio01;
    Node next, down, prev;

    Node(String data, long Mpopulation, long Fpopulation, double MLiteracy, double FLiteracy, long Mpopulation11, long Fpopulation11, double MLiteracy11, double FLiteracy11, long Mpopulation01, long Fpopulation01, double MLiteracy01, double FLiteracy01, double HinduP22, double BuddhistP22, double MuslimP22, double JainP22, double ChristianP22, double SikhP22, double OtherP22, double HinduP11, double BuddhistP11, double MuslimP11, double JainP11, double ChristianP11, double SikhP11, double OtherP11, double HinduP01, double BuddhistP01, double MuslimP01, double JainP01, double ChristianP01, double SikhP01, double OtherP01) {
        this.Tpopulation = Mpopulation + Fpopulation;
        this.Mpopulation = Mpopulation;
        this.Fpopulation = Fpopulation;
        this.agePer = agePer;
        this.AvgLiteracy = (MLiteracy + FLiteracy) / 2;
        this.MLiteracy = MLiteracy;
        this.FLiteracy = FLiteracy;
        this.Tpopulation11 = Mpopulation11 + Fpopulation11;
        this.Mpopulation11 = Mpopulation11;
        this.Fpopulation11 = Fpopulation11;
        this.AvgLiteracy11 = (MLiteracy11 + FLiteracy11) / 2;
        this.MLiteracy11 = MLiteracy11;
        this.FLiteracy11 = FLiteracy11;
        this.Tpopulation01 = Mpopulation01 + Fpopulation01;
        this.Mpopulation01 = Mpopulation01;
        this.Fpopulation01 = Fpopulation01;
        this.AvgLiteracy01 = (MLiteracy01 + FLiteracy01) / 2;
        this.MLiteracy01 = MLiteracy01;
        this.FLiteracy01 = FLiteracy01;
        this.data = data;
        if(Mpopulation!=0) {
            this.SexRatio = (int) ((Fpopulation * 1000 / Mpopulation));}
        else{
            this.SexRatio=0;}
        if (Mpopulation11!=0){
            this.SexRatio11 = (int) ((Fpopulation11 * 1000 / Mpopulation11));}
        else{
            this.SexRatio11=0;
        }
        if (Mpopulation01!=0) {
            this.SexRatio01 = (int) ((Fpopulation01 * 1000 / Mpopulation01));
        }else{
            this.SexRatio01=0;
        }
        this.HinduP22 = HinduP22;
        this.BuddhistP22 = BuddhistP22;
        this.MuslimP22 = MuslimP22;
        this.JainP22 = JainP22;
        this.ChristianP22 = ChristianP22;
        this.SikhP22 = SikhP22;
        this.OtherP22 = OtherP22;
        this.HinduP11 = HinduP11;
        this.BuddhistP11 = BuddhistP11;
        this.MuslimP11 = MuslimP11;
        this.JainP11 = JainP11;
        this.ChristianP11 = ChristianP11;
        this.SikhP11 = SikhP11;
        this.OtherP11 = OtherP11;
        this.HinduP01 = HinduP01;
        this.BuddhistP01 = BuddhistP01;
        this.MuslimP01 = MuslimP01;
        this.JainP01 = JainP01;
        this.ChristianP01 = ChristianP01;
        this.SikhP01 = SikhP01;
        this.OtherP01 = OtherP01;

        next = null;
        down = null;
        prev = null;
    }
}
public class MLLW {
    int ch10;
    Scanner in = new Scanner(System.in);
    Scanner state = new Scanner(System.in);
    Scanner district = new Scanner(System.in);
    int flags = 0, flagd = 0, flags2 = 0, flagd2 = 0,flags3=0,flagd3=0;
    String State, District;
    Node head;
    Node last;
    // Flattens a multi-level linked list depth wise
    public void addState(String data, long Mpopulation, long Fpopulation, double MLiteracy, double FLiteracy, long Mpopulation11, long Fpopulation11, double MLiteracy11, double FLiteracy11, long Mpopulation01, long Fpopulation01, double MLiteracy01, double FLiteracy01, double HinduP22, double BuddhistP22, double MuslimP22, double JainP22, double ChristianP22, double SikhP22, double OtherP22, double HinduP11, double BuddhistP11, double MuslimP11, double JainP11, double ChristianP11, double SikhP11, double OtherP11, double HinduP01, double BuddhistP01, double MuslimP01, double JainP01, double ChristianP01, double SikhP01, double OtherP01) {
        Node sl = new Node(data, Mpopulation, Fpopulation, MLiteracy, FLiteracy, Mpopulation11, Fpopulation11, MLiteracy11, FLiteracy11, Mpopulation01, Fpopulation01, MLiteracy01, FLiteracy01, HinduP22, BuddhistP22, MuslimP22, JainP22, ChristianP22, SikhP22, OtherP22, HinduP11, BuddhistP11, MuslimP11, JainP11, ChristianP11, SikhP11, OtherP11, HinduP01, BuddhistP01, MuslimP01, JainP01, ChristianP01, SikhP01, OtherP01);
        if (head == null) {
            head = sl;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = sl;
        sl.next = null;
        sl.prev = curr;
    }
    public void addDistrict(String st, String data, long Mpopulation, long Fpopulation, double MLiteracy, double FLiteracy, long Mpopulation11, long Fpopulation11, double MLiteracy11, double FLiteracy11, long Mpopulation01, long Fpopulation01, double MLiteracy01, double FLiteracy01, double HinduP22, double BuddhistP22, double MuslimP22, double JainP22, double ChristianP22, double SikhP22, double OtherP22, double HinduP11, double BuddhistP11, double MuslimP11, double JainP11, double ChristianP11, double SikhP11, double OtherP11, double HinduP01, double BuddhistP01, double MuslimP01, double JainP01, double ChristianP01, double SikhP01, double OtherP01) {
        Node temp = head;
        if (head == null) {
            System.out.println("dasygfzy");
        }
        while (temp != null) {
            if (temp.data.equalsIgnoreCase(st)) {
                Node sl = new Node(data, Mpopulation, Fpopulation, MLiteracy, FLiteracy, Mpopulation11, Fpopulation11, MLiteracy11, FLiteracy11, Mpopulation01, Fpopulation01, MLiteracy01, FLiteracy01, HinduP22, BuddhistP22, MuslimP22, JainP22, ChristianP22, SikhP22, OtherP22, HinduP11, BuddhistP11, MuslimP11, JainP11, ChristianP11, SikhP11, OtherP11, HinduP01, BuddhistP01, MuslimP01, JainP01, ChristianP01, SikhP01, OtherP01);
                if (temp.down == null) {
                    temp.down = sl;
                    return;
                }

                Node curr = temp.down;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = sl;
                sl.next = null;
                sl.prev = curr;

                return;
            } else {
                temp = temp.next;
            }
        }
        // System.out.println("not found");
    }
    public void State() {
        // Information();
        Node temp = head;
        if (temp == null) {
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }
    public void district(String st) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equalsIgnoreCase(st)) {
                flags=15;
                Node node = temp.down;
                if (node == null) {
                    return;
                }
                while (node != null) {
                    System.out.print(node.data + "\t");
                    node = node.next;
                }
                return;
            } else {
                temp = temp.next;
            }
        }
        if(flags!=15){
            System.out.println("State not found");
        }
    }
    public void update_state(String st) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        while (temp != null) {
            if (temp.data.equalsIgnoreCase(st)) {
                flags = 1;
                System.out.println("What do you want to update?");
                System.out.println("1.Name of the state");
                System.out.println("2.Population");

                ch10 = in.nextInt();
                switch (ch10) {
                    case 1 -> {
                        System.out.println("Enter a new name of state: ");
                        State = state.nextLine();
                        temp.data = State;
                    }
                    case 2 -> {

                        System.out.println("Enter the number of people to add: ");
                        long new_peeps = in.nextLong();


                        System.out.println("Enter the number of males");
                        long new_males = in.nextLong();

                        temp.Mpopulation += new_males;
                        temp.Fpopulation += new_peeps - new_males;

                        System.out.println("How many of the males are literates?");
                        long Mliter = in.nextLong();

                        double Mliterates = (temp.MLiteracy * temp.Mpopulation / 100);
                        double new_Mliterates = Mliter + Mliterates;
                        temp.MLiteracy = new_Mliterates / temp.Mpopulation;

                        System.out.println("How many of the females are literates?");
                        long Fliter = in.nextLong();

                        double Fliterates = (temp.FLiteracy * temp.Fpopulation / 100);
                        double new_Fliterates = Fliter + Fliterates;
                        temp.FLiteracy = new_Fliterates / temp.Fpopulation;


                        System.out.println("How many of them are Hindu?");
                        long new_HP = in.nextLong();

                        double HP = (temp.HinduP22 * temp.Tpopulation) / 100;
                        HP += new_HP;
                        temp.HinduP22 = HP / temp.Tpopulation * 100;
                        temp.HinduP22 += HP;

                        System.out.println("How many of them are Muslim?");
                        long new_Mu = in.nextLong();

                        double Mu = (temp.MuslimP22 * temp.Tpopulation) / 100;
                        Mu += new_Mu;
                        temp.MuslimP22 = Mu / temp.Tpopulation * 100;
                        temp.MuslimP22 += Mu;

                        System.out.println("How many of them are Buddhist?");
                        long new_Bu = in.nextLong();
                        double Bu = (temp.BuddhistP22 * temp.Tpopulation) / 100;
                        Bu += new_Bu;
                        temp.BuddhistP22 = Bu / temp.Tpopulation * 100;
                        temp.BuddhistP22 += Bu;

                        System.out.println("How many of them are Jain?");
                        long new_Ja = in.nextLong();

                        double Ja = (temp.JainP22 * temp.Tpopulation) / 100;
                        Ja += new_Ja;
                        temp.JainP22 = Ja / temp.Tpopulation * 100;
                        temp.JainP22 += Ja;

                        System.out.println("How many of them are Sikh?");
                        long new_Si = in.nextLong();

                        double Si = (temp.SikhP22 * temp.Tpopulation) / 100;
                        Si += new_Si;
                        temp.SikhP22 = Si / temp.Tpopulation * 100;
                        temp.SikhP22 += Si;

                        System.out.println("How many of them are Others/not stated?");
                        long new_Ot = in.nextLong();

                        double Ot = (temp.OtherP22 * temp.Tpopulation) / 100;
                        Ot += new_Ot;
                        temp.OtherP22 = Ot / temp.Tpopulation * 100;
                        temp.OtherP22 += Ot;
                    }
                }
                return;
            } else {
                temp = temp.next;
            }
        }
        if (flags != 1) {
            System.out.println("State Not found");
        }
    }
    public void update_district(String st, String ds) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equalsIgnoreCase(st)) {
                flags = 2;
                Node node = temp.down;
                if (node == null) {
                    return;
                }
                while (node != null) {
                    if (node.data.equalsIgnoreCase(ds)) {
                        flagd = 1;

                        System.out.println("What do you want to update?");
                        System.out.println("1.Name of the district");
                        System.out.println("2.Population");

                        int ch11 = in.nextInt();
                        switch (ch11) {
                            case 1 -> {
                                System.out.println("Enter a new name of district: ");
                                District = district.nextLine();
                                node.data = District;
                            }
                            case 2 -> {
                                System.out.println("Enter the number of people to add: ");
                                long new_peeps = in.nextLong();


                                System.out.println("Enter the number of males");
                                long new_males = in.nextLong();

                                node.Mpopulation += new_males;
                                node.Fpopulation += new_peeps - new_males;

                                System.out.println("How many of the males are literates?");
                                long Mliter = in.nextLong();

                                double Mliterates = (node.MLiteracy * node.Mpopulation / 100);
                                double new_Mliterates = Mliter + Mliterates;
                                node.MLiteracy = new_Mliterates / node.Mpopulation;

                                System.out.println("How many of the females are literates?");
                                long Fliter = in.nextLong();

                                double Fliterates = (node.FLiteracy * node.Fpopulation / 100);
                                double new_Fliterates = Fliter + Fliterates;
                                node.FLiteracy = new_Fliterates / node.Fpopulation;


                                System.out.println("How many of them are Hindu?");
                                long new_HP = in.nextLong();

                                double HP = (node.HinduP22 * node.Tpopulation) / 100;
                                HP += new_HP;
                                node.HinduP22 = HP / node.Tpopulation * 100;
                                node.HinduP22 += HP;

                                System.out.println("How many of them are Muslim?");
                                long new_Mu = in.nextLong();

                                double Mu = (node.MuslimP22 * node.Tpopulation) / 100;
                                Mu += new_Mu;
                                node.MuslimP22 = Mu / node.Tpopulation * 100;
                                node.MuslimP22 += Mu;

                                System.out.println("How many of them are Buddhist?");
                                long new_Bu = in.nextLong();
                                double Bu = (node.BuddhistP22 * node.Tpopulation) / 100;
                                Bu += new_Bu;
                                node.BuddhistP22 = Bu / node.Tpopulation * 100;
                                node.BuddhistP22 += Bu;

                                System.out.println("How many of them are Jain?");
                                long new_Ja = in.nextLong();

                                double Ja = (node.JainP22 * node.Tpopulation) / 100;
                                Ja += new_Ja;
                                node.JainP22 = Ja / node.Tpopulation * 100;
                                node.JainP22 += Ja;

                                System.out.println("How many of them are Sikh?");
                                long new_Si = in.nextLong();

                                double Si = (node.SikhP22 * node.Tpopulation) / 100;
                                Si += new_Si;
                                node.SikhP22 = Si / node.Tpopulation * 100;
                                node.SikhP22 += Si;

                                System.out.println("How many of them are Others/not stated?");
                                long new_Ot = in.nextLong();

                                double Ot = (node.OtherP22 * node.Tpopulation) / 100;
                                Ot += new_Ot;
                                node.OtherP22 = Ot / node.Tpopulation * 100;
                                node.OtherP22 += Ot;

                                return;
                            }
                        }
                    } else {
                        node = node.next;
                    }
//
                }
                break;
            }
            else {
                temp = temp.next;
            }
        }
        if (flagd != 1) {
            System.out.println("District not found in this particular state");
        }

    }

    public void delete_State(String st) {
        // flags=0;
        Node ptr = head.next;
        Node parent = head;
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        if (head.data.equalsIgnoreCase(st)) {
            flags = 1;
            head = head.next;
            head.prev = null;
            return;
        }
        while (ptr.next != null) {
            if (ptr.data.equalsIgnoreCase(st)) {
                flags2 = 2;
                parent.next = ptr.next;
                ptr.next.prev = parent;
                return;
            } else {
                ptr = ptr.next;
                parent = parent.next;
            }
        }
        if (ptr.data.equalsIgnoreCase(st)) {
            flags3 = 3;
            parent.next = null;
            ptr.prev = null;
            return;
        }
        if(flags!=1||flags2!=2||flags3!=3){
            System.out.println("State not found");
        }

    }
    public void delete_district(String st, String ds) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        while (temp != null) {
            if (temp.data.equalsIgnoreCase(st)) {
                flags = 6;
                Node ptr = temp.down.next;
                Node parent = temp.down;
                if (parent.data.equalsIgnoreCase(ds)) {
                    flagd = 2;
                    temp.down=ptr;
                    ptr.prev = temp;
                }
                while (ptr!= null) {
                    if (ptr.data.equalsIgnoreCase(ds)) {
                        flagd2 = 3;
                        parent.next = ptr.next;
                        return;
                    } else {
                        ptr = ptr.next;
                        parent = parent.next;
                    }
                }
            }
            temp=temp.next;
        }
        if (flags != 6 ) {
            System.out.println("State not found");
        }
        if (flagd != 2 && flagd2 != 3) {
            System.out.println("District not found");
        }
    }
    public void compare2StatesP(String st1, String st2) {
        // Information();
        Node ptr1 = head;
        Node ptr2 = head;
        while (ptr1 != null) {
            if (ptr1.data.equalsIgnoreCase(st1)) {
                flags = 8;
                break;
            } else {
                ptr1 = ptr1.next;
            }
        }
        while (ptr2 != null) {
            if (ptr2.data.equalsIgnoreCase(st2)) {
                flags2 = 9;
                break;
            } else {
                ptr2 = ptr2.next;
            }

        }

        if(flags!=8||flags2!=9){
            System.out.println("State 1 or state 2 not found");

            return;
        }
        System.out.println();
        System.out.println("\t ****** Comparision of "+st1+" and "+st2+" *******\n");
        System.out.println("States\t\t\t\t\t" + st1 + "\t\t" + st2 + "\nYear\t 2022 \n\nTotal Population\t\t\t" + ptr1.Tpopulation + "\t\t" + ptr2.Tpopulation);
        System.out.println("Male Population\t\t\t\t" + ptr1.Mpopulation + "\t\t" + ptr2.Mpopulation);
        System.out.println("Female Population\t\t\t" + ptr1.Fpopulation + "\t\t" + ptr2.Fpopulation);
        System.out.println("Average Literacy\t\t\t" + String.format("%.2f",ptr1.AvgLiteracy) + "\t\t\t" + String.format("%.2f",ptr2.AvgLiteracy));
        System.out.println("Male Literacy\t\t\t\t" + ptr1.MLiteracy + "\t\t\t" + ptr2.MLiteracy);
        System.out.println("Female Literacy\t\t\t\t" + ptr1.FLiteracy + "\t\t\t" + ptr2.FLiteracy);
        System.out.println("Sex Ratio\t\t\t\t" + ptr1.SexRatio + "\t\t\t" + ptr2.SexRatio);
        System.out.println("\n******* Religion *******");
        System.out.println("Hindu\t\t\t\t\t" + String.format("%.2f",ptr1.HinduP22) + "\t\t\t" + String.format("%.2f",ptr2.HinduP22));
        System.out.println("Muslim\t\t\t\t\t" + String.format("%.2f",ptr1.MuslimP22) + "\t\t\t" + String.format("%.2f",ptr2.MuslimP22));
        System.out.println("Jain\t\t\t\t\t" + String.format("%.2f",ptr1.JainP22)+ "\t\t\t" + String.format("%.2f",ptr2.JainP22));
        System.out.println("Buddhism\t\t\t\t" + String.format("%.2f",ptr1.BuddhistP22) + "\t\t\t" +String.format("%.2f", ptr2.BuddhistP22));
        System.out.println("Christian\t\t\t\t" + String.format("%.2f",ptr1.ChristianP22) + "\t\t\t" + String.format("%.2f",ptr2.ChristianP22));
        System.out.println("Sikh\t\t\t\t\t" + String.format("%.2f",ptr1.SikhP22) + "\t\t\t" + String.format("%.2f",ptr2.SikhP22));
        System.out.println("Other/not stated\t\t\t" + String.format("%.2f",ptr1.OtherP22) + "\t\t\t" + String.format("%.2f",ptr2.OtherP22));

        System.out.println("\n\nYear\t2011 \n\nTotal Population\t\t\t" + ptr1.Tpopulation11 + "\t\t" + ptr2.Tpopulation11);
        System.out.println("Male Population\t\t\t\t" + ptr1.Mpopulation11 + "\t\t" + ptr2.Mpopulation11);
        System.out.println("Female Population\t\t\t" + ptr1.Fpopulation11 + "\t\t" + ptr2.Fpopulation11);
        System.out.println("Average Literacy\t\t\t" +String.format("%.2f",ptr1.AvgLiteracy11) + "\t\t\t" + String.format("%.2f",ptr2.AvgLiteracy11));
        System.out.println("Male Literacy\t\t\t\t" + ptr1.MLiteracy11 + "\t\t\t" + ptr2.MLiteracy11);
        System.out.println("Female Literacy\t\t\t\t" + ptr1.FLiteracy11 + "\t\t\t" + ptr2.FLiteracy11);
        System.out.println("Sex Ratio\t\t\t\t" + ptr1.SexRatio11 + "\t\t\t" + ptr2.SexRatio11);
        System.out.println("\n******* Religion *******");
        System.out.println("Hindu\t\t\t\t\t" + String.format("%.2f",ptr1.HinduP11) + "\t\t\t" + String.format("%.2f",ptr2.HinduP11));
        System.out.println("Muslim\t\t\t\t\t" + String.format("%.2f",ptr1.MuslimP11) + "\t\t\t" + String.format("%.2f",ptr2.MuslimP11));
        System.out.println("Jain\t\t\t\t\t" + String.format("%.2f",ptr1.JainP11)+ "\t\t\t" + String.format("%.2f",ptr2.JainP11));
        System.out.println("Buddhism\t\t\t\t" + String.format("%.2f",ptr1.BuddhistP11) + "\t\t\t" +String.format("%.2f", ptr2.BuddhistP11));
        System.out.println("Christian\t\t\t\t" + String.format("%.2f",ptr1.ChristianP11) + "\t\t\t" + String.format("%.2f",ptr2.ChristianP11));
        System.out.println("Sikh\t\t\t\t\t" + String.format("%.2f",ptr1.SikhP11) + "\t\t\t" + String.format("%.2f",ptr2.SikhP11));
        System.out.println("Other/not stated\t\t\t" + String.format("%.2f",ptr1.OtherP11) + "\t\t\t" + String.format("%.2f",ptr2.OtherP11));

        System.out.println("\n\nYear\t2001 \n\nTotal Population\t\t\t" + ptr1.Tpopulation01 + "\t\t" + ptr2.Tpopulation01);
        System.out.println("Male Population\t\t\t\t" + ptr1.Mpopulation01 + "\t\t" + ptr2.Mpopulation01);
        System.out.println("Female Population\t\t\t" + ptr1.Fpopulation01 + "\t\t" + ptr2.Fpopulation01);
        System.out.println("Average Literacy\t\t\t" + String.format("%.2f",ptr1.AvgLiteracy01) + "\t\t\t" + String.format("%.2f",ptr2.AvgLiteracy01));
        System.out.println("Male Literacy\t\t\t\t" + ptr1.MLiteracy01 + "\t\t\t" + ptr2.MLiteracy01);
        System.out.println("Female Literacy\t\t\t\t" + ptr1.FLiteracy01 + "\t\t\t" + ptr2.FLiteracy01);
        System.out.println("Sex Ratio\t\t\t\t" + ptr1.SexRatio01 + "\t\t\t" + ptr2.SexRatio01);
        System.out.println("\n******* Religion *******");
        System.out.println("Hindu\t\t\t\t\t" + String.format("%.2f",ptr1.HinduP01) + "\t\t\t" + String.format("%.2f",ptr2.HinduP01));
        System.out.println("Muslim\t\t\t\t\t" + String.format("%.2f",ptr1.MuslimP01) + "\t\t\t" + String.format("%.2f",ptr2.MuslimP01));
        System.out.println("Jain\t\t\t\t\t" + String.format("%.2f",ptr1.JainP01)+ "\t\t\t" + String.format("%.2f",ptr2.JainP01));
        System.out.println("Buddhism\t\t\t\t" + String.format("%.2f",ptr1.BuddhistP01) + "\t\t\t" +String.format("%.2f", ptr2.BuddhistP01));
        System.out.println("Christian\t\t\t\t" + String.format("%.2f",ptr1.ChristianP01) + "\t\t\t" + String.format("%.2f",ptr2.ChristianP01));
        System.out.println("Sikh\t\t\t\t\t" + String.format("%.2f",ptr1.SikhP01) + "\t\t\t" + String.format("%.2f",ptr2.SikhP01));
        System.out.println("Other/not stated\t\t\t" + String.format("%.2f",ptr1.OtherP01) + "\t\t\t" + String.format("%.2f",ptr2.OtherP01));

        flags=0;
        flags2=0;
        double diff = Math.abs(ptr1.Tpopulation - ptr2.Tpopulation);
        double per = (diff * 100 / ptr1.Tpopulation);
        if (ptr1.Tpopulation > ptr2.Tpopulation) {
            System.out.println(st1 + " has " + String.format("%.2f",per) + "% more population than " + st2 + " in 2022");
        } else {
            System.out.println(st2 + " has " + String.format("%.2f",per) + "% more population than " + st1 + " in 2022");
        }

    }
    public void compare2District(String st1, String st2, String ds1, String ds2) {
        Node node1 = head;
        Node node2 = head;
        Node ptr1 = null;
        Node ptr2 = null;
        while (node1 != null) {
            if (node1.data.equalsIgnoreCase(st1)) {
                flags = 10;
                ptr1 = node1.down;
                while (ptr1 != null) {
                    if (ptr1.data.equalsIgnoreCase(ds1)) {
                        flagd = 4;
                        // System.out.println("found");
                        break;
                    } else {
                        ptr1 = ptr1.next;
                    }
                }
                break;
            } else {
                node1 = node1.next;
            }
        }
        if (flags != 10) {
            System.out.println("State one not found");
            return;
        }
        if (flagd != 4) {
            System.out.println("District one not found");
            return;
        }
        while (node2 != null) {
            if (node2.data.equalsIgnoreCase(st2)) {
                flags2 = 11;
                ptr2 = node2.down;
                while (ptr2 != null) {
                    if (ptr2.data.equalsIgnoreCase(ds2)) {
                        flagd2 = 5;
                        break;
                    } else {
                        ptr2 = ptr2.next;
                    }
                }
                break;
            } else {
                node2 = node2.next;
            }
        }
        if (flags2 != 11) {
            System.out.println("State two not found");
            return;
        }
        if (flagd2 != 5) {
            System.out.println("District two not found");
            return;
        }
        assert ptr1 != null;
        assert ptr2 != null;
        System.out.println();
        System.out.println("\t ***** Comparision of "+ds1+" and "+ds2+" ******\n");
        System.out.println("Districts\t\t\t\t\t" + ds1 + "\t\t" + ds2 + "\n\nYear\t 2022 \n\nTotal Population\t\t\t" + ptr1.Tpopulation + "\t\t\t" + ptr2.Tpopulation);
        System.out.println("Male Population\t\t\t\t" + ptr1.Mpopulation + "\t\t\t" + ptr2.Mpopulation);
        System.out.println("Female Population\t\t\t" + ptr1.Fpopulation + "\t\t\t" + ptr2.Fpopulation);
        System.out.println("Average Literacy\t\t\t" + String.format("%.2f",ptr1.AvgLiteracy) + "\t\t\t" + String.format("%.2f",ptr2.AvgLiteracy));
        System.out.println("Male Literacy\t\t\t\t" + ptr1.MLiteracy + "\t\t\t" + ptr2.MLiteracy);
        System.out.println("Female Literacy\t\t\t\t" + ptr1.FLiteracy + "\t\t\t" + ptr2.FLiteracy);
        System.out.println("Sex Ratio\t\t\t\t" + ptr1.SexRatio + "\t\t\t" + ptr2.SexRatio);
        System.out.println("\n******* Religion *******");
        System.out.println("Hindu\t\t\t\t\t" + String.format("%.2f",ptr1.HinduP22) + "\t\t\t" + String.format("%.2f",ptr2.HinduP22));
        System.out.println("Muslim\t\t\t\t\t" + String.format("%.2f",ptr1.MuslimP22) + "\t\t\t" + String.format("%.2f",ptr2.MuslimP22));
        System.out.println("Jain\t\t\t\t\t" + String.format("%.2f",ptr1.JainP22)+ "\t\t\t" + String.format("%.2f",ptr2.JainP22));
        System.out.println("Buddhism\t\t\t\t" + String.format("%.2f",ptr1.BuddhistP22) + "\t\t\t" +String.format("%.2f", ptr2.BuddhistP22));
        System.out.println("Christian\t\t\t\t" + String.format("%.2f",ptr1.ChristianP22) + "\t\t\t" + String.format("%.2f",ptr2.ChristianP22));
        System.out.println("Sikh\t\t\t\t\t" + String.format("%.2f",ptr1.SikhP22) + "\t\t\t" + String.format("%.2f",ptr2.SikhP22));
        System.out.println("Other/not stated\t\t\t" + String.format("%.2f",ptr1.OtherP22) + "\t\t\t" + String.format("%.2f",ptr2.OtherP22));

        System.out.println("\n\nYear\t2011 \n\nTotal Population\t\t\t" + ptr1.Tpopulation11 + "\t\t\t" + ptr2.Tpopulation11);
        System.out.println("Male Population\t\t\t\t" + ptr1.Mpopulation11 + "\t\t\t" + ptr2.Mpopulation11);
        System.out.println("Female Population\t\t\t" + ptr1.Fpopulation11 + "\t\t\t" + ptr2.Fpopulation11);
        System.out.println("Average Literacy\t\t\t" +String.format("%.2f",ptr1.AvgLiteracy11) + "\t\t\t" + String.format("%.2f",ptr2.AvgLiteracy11));
        System.out.println("Male Literacy\t\t\t\t" + ptr1.MLiteracy11 + "\t\t\t" + ptr2.MLiteracy11);
        System.out.println("Female Literacy\t\t\t\t" + ptr1.FLiteracy11 + "\t\t\t" + ptr2.FLiteracy11);
        System.out.println("Sex Ratio\t\t\t\t" + ptr1.SexRatio11 + "\t\t\t" + ptr2.SexRatio11);
        System.out.println("\n******* Religion *******");
        System.out.println("Hindu\t\t\t\t\t" + String.format("%.2f",ptr1.HinduP11) + "\t\t\t" + String.format("%.2f",ptr2.HinduP11));
        System.out.println("Muslim\t\t\t\t\t" + String.format("%.2f",ptr1.MuslimP11) + "\t\t\t" + String.format("%.2f",ptr2.MuslimP11));
        System.out.println("Jain\t\t\t\t\t" + String.format("%.2f",ptr1.JainP11)+ "\t\t\t" + String.format("%.2f",ptr2.JainP11));
        System.out.println("Buddhism\t\t\t\t" + String.format("%.2f",ptr1.BuddhistP11) + "\t\t\t" +String.format("%.2f", ptr2.BuddhistP11));
        System.out.println("Christian\t\t\t\t" + String.format("%.2f",ptr1.ChristianP11) + "\t\t\t" + String.format("%.2f",ptr2.ChristianP11));
        System.out.println("Sikh\t\t\t\t\t" + String.format("%.2f",ptr1.SikhP11) + "\t\t\t" + String.format("%.2f",ptr2.SikhP11));
        System.out.println("Other/not stated\t\t\t" + String.format("%.2f",ptr1.OtherP11) + "\t\t\t" + String.format("%.2f",ptr2.OtherP11));

        System.out.println("\n\nYear\t2001 \n\nTotal Population\t\t\t" + ptr1.Tpopulation01 + "\t\t\t" + ptr2.Tpopulation01);
        System.out.println("Male Population\t\t\t\t" + ptr1.Mpopulation01 + "\t\t\t" + ptr2.Mpopulation01);
        System.out.println("Female Population\t\t\t" + ptr1.Fpopulation01 + "\t\t\t" + ptr2.Fpopulation01);
        System.out.println("Average Literacy\t\t\t" + String.format("%.2f",ptr1.AvgLiteracy01) + "\t\t\t" + String.format("%.2f",ptr2.AvgLiteracy01));
        System.out.println("Male Literacy\t\t\t\t" + ptr1.MLiteracy01 + "\t\t\t" + ptr2.MLiteracy01);
        System.out.println("Female Literacy\t\t\t\t" + ptr1.FLiteracy01 + "\t\t\t" + ptr2.FLiteracy01);
        System.out.println("Sex Ratio\t\t\t\t" + ptr1.SexRatio01 + "\t\t\t" + ptr2.SexRatio01);
        System.out.println("\n******* Religion *******");
        System.out.println("Hindu\t\t\t\t\t" + String.format("%.2f",ptr1.HinduP01) + "\t\t\t" + String.format("%.2f",ptr2.HinduP01));
        System.out.println("Muslim\t\t\t\t\t" + String.format("%.2f",ptr1.MuslimP01) + "\t\t\t" + String.format("%.2f",ptr2.MuslimP01));
        System.out.println("Jain\t\t\t\t\t" + String.format("%.2f",ptr1.JainP01)+ "\t\t\t" + String.format("%.2f",ptr2.JainP01));
        System.out.println("Buddhism\t\t\t\t" + String.format("%.2f",ptr1.BuddhistP01) + "\t\t\t" +String.format("%.2f", ptr2.BuddhistP01));
        System.out.println("Christian\t\t\t\t" + String.format("%.2f",ptr1.ChristianP01) + "\t\t\t" + String.format("%.2f",ptr2.ChristianP01));
        System.out.println("Sikh\t\t\t\t\t" + String.format("%.2f",ptr1.SikhP01) + "\t\t\t" + String.format("%.2f",ptr2.SikhP01));
        System.out.println("Other/not stated\t\t\t" + String.format("%.2f",ptr1.OtherP01) + "\t\t\t" + String.format("%.2f",ptr2.OtherP01));

        double diff = Math.abs(ptr1.Tpopulation - ptr2.Tpopulation);
        double per = (diff * 100 / ptr1.Tpopulation);
        if (ptr1.Tpopulation > ptr2.Tpopulation) {
            System.out.println("\t"+ds1 + " has " +String.format("%.2f",per)+ "% more population than " + ds2 + " in 2022\n");
        } else {
            System.out.println("\t"+ds2 + " has " + String.format("%.2f",per) + "% more population than " + ds1 + " in 2022\n");
        }
    }
    public void Information() {
        addState("Uttar Pradesh", 104504000, 95307000, 88.37, 76.01, 104480510, 95331831, 79.20, 59.30, 87565369, 78632552, 68.82, 42.22, 80.50, 0.11, 18.50, 0.16, 0.13, 0.28, 0.32, 79.73, 0.10, 19.26, 0.11, 0.18, 0.32, 0.30, 80.61, 0.09, 18.50, 0.13, 0.12, 0.35, 0.20);
        addState("Maharashtra", 58255000, 54119000, 90.7, 78.4, 58243056, 54131277, 88.38, 75.87, 50400596, 46478031, 85.97, 67.03, 80.23, 6.20, 11.60, 0.78, 0.80, 0.25, 0.14, 79.83, 5.81, 11.54, 1.25, 0.96, 0.20, 0.41, 80.37, 6.03, 10.60, 1.34, 1.09, 0.22, 0.34);
        addState("Bihar", 54278000, 49821000, 88.37, 76.01, 54278157, 49821295, 71.20, 51.50, 43243795, 39754714, 58.68, 33.12, 83.10, 0.02, 16.10, 0.02, 0.13, 0.02, 0.07, 82.69, 0.02, 16.87, 0.02, 0.12, 0.02, 0.26, 83.22, 0.02, 16.53, 0.02, 0.06, 0.03, 0.06);
        addState("West Bengal", 46714000, 44154000, 83.25, 80.0, 46809027, 44467088, 81.69, 70.54, 41465985, 38710212, 77.02, 59.61, 69.20, 0.30, 28.36, 0.07, 0.80, 0.07, 1.20, 70.54, 0.31, 27.01, 0.07, 0.72, 0.07, 1.03, 72.7, 0.29, 25.6, 0.09, 0.66, 0.08, 0.58);
        addState("Madhya Pradesh", 44019000, 40982000, 83.21, 65.57, 37612306, 35014503, 77.02, 59.61, 31442652, 28904371, 76.06, 50.29, 90.10, 0.30, 7.20, 0.75, 0.32, 0.20, 1.13, 90.89, 0.30, 6.57, 0.78, 0.29, 0.21, 0.83, 91.5, 0.34, 6.3, 0.90, 0.28, 0.24, 0.44);
        addState("Rajasthan", 41235000, 38266000, 80.80, 57.66, 35550997, 32997440, 79.19, 52.12, 29420011, 27087177, 75.7, 43.85, 89.1, 0.02, 8.50, 0.89, 0.12, 1.10, 0.27, 88.49, 0.02, 9.07, 0.91, 0.14, 1.27, 0.10, 88.75, 0.02, 8.47, 1.15, 0.13, 1.45, 0.01);

        addDistrict("Maharashtra", "Mumbai", 9872000, 8522000, 92.56, 86.39, 6715931, 5726442, 91.48, 84.2, 4741720, 3898699, 90.23, 81.38, 79.5, 5.5, 12.1, 1.17, 0.98, 0.20, 0.55, 79.83, 5.81, 11.54, 1.25, 0.96, 0.20, 0.42, 80.37, 6.03, 10.60, 1.34, 1.09, 0.22, 0.24);
        addDistrict("Maharashtra", "Pune", 5473000, 5007644, 92.31, 86.67, 1603675, 1520783, 90.84, 81.05, 3769128, 3463427, 88.34, 71.89, 80.2, 4.2, 10.5, 2.1, 2.1, 0.57, 0.23, 79.43, 3.94, 11.03, 2.45, 2.17, 0.43, 0.55, 82.1, 2.50, 9.90, 2.10, 2.10, 0.47, 0.83);
        addDistrict("Uttar Pradesh", "Ghaziabad", 2883000, 2540000, 89.54, 79.45, 874607, 774036, 85.42, 69.79, 1769042, 1521544, 79.84, 58.01, 83.1, 0.14, 14.4, 0.69, 0.79, 0.84, 0.04, 82.50, 0.15, 14.18, 0.71, 0.78, 0.96, 0.01, 81.1, 0.14, 16.13, 0.62, 0.73, 0.92, 0.36);
        addDistrict("Uttar Pradesh", "Varanasi", 2222664, 2033000, 83.46, 74.55, 1921857, 1754984, 83.78, 66.69, 1649187, 1489484, 77.87, 53.05, 84.7, 0.03, 13.9, 0.06, 0.27, 0.08, 0.02, 84.52, 0.03, 14.88, 0.05, 0.21, 0.09, 0.01, 84.1, 0.04, 17.50, 0.05, 0.19, 0.09, 0.01);
        addDistrict("bihar", "Patna", 3800115, 3406800, 85.68, 71.99, 893445, 790852, 78.48, 61.96, 2519942, 2198650, 73.34, 50.83, 86.7, 0.02, 12.39, 0.07, 0.53, 0.21, 0.08, 86.39, 0.02, 12.27, 0.09, 0.51, 0.23, 0.05, 86.7, 0.02, 12.40, 0.06, 0.49, 0.25, 0.08);
        addDistrict("bihar", "Gaya", 2797000, 2622000, 75.2, 59.20, 250037, 224056, 73.31, 53.34, 1792163, 1681265, 63.27, 36.66, 91.07, 0.17, 8.23, 0.03, 0.02, 0.08, 0.41, 91.45, 0.08, 8.17, 0.04, 0.08, 0.01, 0.18, 92.02, 0.06, 7.09, 0.050, 0.07, 0.02, 0.69);
        addDistrict("West Bengal", "Kolkata", 7252000, 6784000, 90.14, 84.74, 2356766, 2139928, 88.34, 84.06, 2500040, 2072836, 83.79, 77.30, 75.92, 0.10, 21.73, 0.41, 0.97, 0.34, 0.53, 76.51, 0.11, 20.60, 0.47, 0.88, 0.31, 1.12, 77.33, 0.12, 19.82, 0.53, 0.98, 0.41, 89.19);
        addDistrict("West Bengal", "Asansol", 906052, 777000, 91.27, 80.45, 846052, 697000, 88.31, 77.90, 715333, 357666, 85.12, 71.76, 74.98, 0.11, 22.79, 0.02, 1.02, 1.00, 0.08, 75.18, 0.09, 21.26, 0.03, 0.99, 1.09, 1.36, 76.23, 0.12, 20.37, 0.04, 1.07, 1.11, 1.06);
        addDistrict("Madhya Pradesh", "Bhopal", 1446700, 1328000, 87.45, 79.16, 936168, 862050, 85.42, 74.87, 972649, 870861, 81.94, 66.37, 68.12, 1.12, 27.32, 1.43, 1.04, 0.63, 0.34, 69.20, 1.08, 26.28, 1.35, 1.12, 0.57, 0.39, 70.12, 0.99, 25.73, 1.31, 1.12, 0.31, 0.42);
        addDistrict("Madhya Pradesh", "Indore", 1989000, 1845000, 89.95, 81.48, 1035912, 958485, 87.25, 74.02, 1289352, 1176475, 84.60, 64.81, 79.21, 0.63, 15.11, 3.32, 0.51, 1.07, 0.15, 80.18, 0.51, 14.09, 3.25, 0.65, 1.09, 0.24, 81.09, 0.63, 13.12, 3.32, 0.68, 0.91, 0.25);
        addDistrict("Rajasthan", "Jaipur", 4022774, 3662267, 76.65, 89.38, 1923928, 1763237, 78.95, 51.83, 1513890, 1372615, 56.67, 72.96, 77.32, 0.03, 18.51, 2.54, 0.29, 49, 0.82, 77.91, 0.03, 18.63, 2.36, 0.36, 0.58, 0.12, 78.02, 0.03, 18.24, 2.21, 0.32, 0.56, 0.62);
        addDistrict("Rajasthan", "Jodhpur", 2231000, 2045000, 87.47, 73.46, 555371, 500820, 78.95, 51.83, 1513890, 1372615, 72.96, 38.64, 76.12, 0.03, 19.92, 3.14, 0.29, 0.29, 0.21, 76.98, 0.03, 19.30, 2.70, 0.42, 0.33, 0.25, 77.23, 0.03, 19.08, 2.69, 0.31, 0.39, 0.27);
    }
}