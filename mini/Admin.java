package com.final_census;


import java.util.Scanner;

class Admin extends MLLW {
    String State, District, UserName, Password, UNGiven, PSGiven;
    long Tpopu, Mpopu, Fpopu;
    long Tpopu11, Mpopu11, Fpopu11, Tpopu01, Mpopu01, Fpopu01 ;
    double Hindu1P22, Buddhist1P22, Muslim1P22, Jain1P22, Christian1P22, Sikh1P22, Other1P22;
    double HinduP11, BuddhistP11, MuslimP11, JainP11, ChristianP11, SikhP11, OtherP11, HinduP01, BuddhistP01, MuslimP01, JainP01, ChristianP01, SikhP01, OtherP01;
    double Lit, MLit, FLit, Lit11;
    double MLit11, FLit11, Lit01, MLit01, FLit01;
    int sexRatio, sexRatio11, sexRatio01;
    Scanner state = new Scanner(System.in);
    Scanner username = new Scanner(System.in);
    Scanner pass = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    Scanner district = new Scanner(System.in);
    MLLW obj = new MLLW();


    public boolean login() {
        return true;
//        UNGiven="AdminCensus";
//        PSGiven="Admin@Census123";
//        System.out.println("Enter your username: ");
//        UserName=username.nextLine();
//        System.out.println("Enter your password: ");
//        Password=pass.nextLine();
//        return UserName.equals(UNGiven) && Password.equals(PSGiven);
    }

    public void addState() {

        System.out.println("Enter the state you want to add: ");
        State = state.nextLine();
        System.out.println("Enter the male population of state in 2022: ");
        Mpopu = in.nextInt();
        System.out.println("Enter the female population of state in 2022: ");
        Fpopu = in.nextInt();
        System.out.println("Enter the Male Literacy rate of state in 2022: ");
        MLit = in.nextDouble();
        System.out.println("Enter the Female Literacy rate of state in 2022: ");
        FLit = in.nextDouble();
        System.out.println("Enter the Hindu population percentage in 2022: ");
        Hindu1P22 = in.nextDouble();
        System.out.println("Enter the Muslim population percentage in 2022: ");
        Muslim1P22 = in.nextDouble();
        System.out.println("Enter the Buddhism population percentage in 2022: ");
        Buddhist1P22 = in.nextDouble();
        System.out.println("Enter the Jain population percentage in 2022: ");
        Jain1P22 = in.nextDouble();
        System.out.println("Enter the Christian population percentage in 2022: ");
        Christian1P22 = in.nextDouble();
        System.out.println("Enter the Other/not stated religion population percentage in 2022: ");
        Other1P22 = in.nextDouble();
        addState(State, Mpopu, Fpopu, MLit, FLit, Mpopu11, Fpopu11, MLit11, FLit11, Mpopu01, Fpopu01, MLit01, FLit01, Hindu1P22, Buddhist1P22, Muslim1P22, Jain1P22, Christian1P22, Sikh1P22, Other1P22, HinduP11, BuddhistP11, MuslimP11, JainP11, ChristianP11, SikhP11, OtherP11, HinduP01, BuddhistP01, MuslimP01, JainP01, ChristianP01, SikhP01, OtherP01);
    }

    public void addDistrict() {
        System.out.println("Enter the state in which you want to add district: ");
        State = state.nextLine();
        System.out.println("Enter the district you want to add: ");
        District = district.nextLine();
        System.out.println("Enter the total population of district in 2022: ");
        Tpopu = in.nextInt();
        System.out.println("Enter the male population of district in 2022: ");
        Mpopu = in.nextInt();
        System.out.println("Enter the female population of district in 2022: ");
        Fpopu = in.nextInt();
        System.out.println("Enter the Literacy rate of district in 2022: ");
        Lit = in.nextDouble();
        System.out.println("Enter the Male Literacy rate of district in 2022: ");
        MLit = in.nextDouble();
        System.out.println("Enter the Female Literacy rate of district in 2022: ");
        FLit = in.nextDouble();
        System.out.println("Enter the Hindu population percentage in 2022: ");
        Hindu1P22 = in.nextDouble();
        System.out.println("Enter the Muslim population percentage in 2022: ");
        Muslim1P22 = in.nextDouble();
        System.out.println("Enter the Buddhism population percentage in 2022: ");
        Buddhist1P22 = in.nextDouble();
        System.out.println("Enter the Jain population percentage in 2022: ");
        Jain1P22 = in.nextDouble();
        System.out.println("Enter the Christian population percentage in 2022: ");
        Christian1P22 = in.nextDouble();
        System.out.println("Enter the Other/not stated religion population percentage in 2022: ");
        Other1P22 = in.nextDouble();
        addDistrict(State, District, Mpopu, Fpopu, MLit, FLit, Mpopu11, Fpopu11, MLit11, FLit11, Mpopu01, Fpopu01, MLit01, FLit01, Hindu1P22, Buddhist1P22, Muslim1P22, Jain1P22, Christian1P22, Sikh1P22, Other1P22, HinduP11, BuddhistP11, MuslimP11, JainP11, ChristianP11, SikhP11, OtherP11, HinduP01, BuddhistP01, MuslimP01, JainP01, ChristianP01, SikhP01, OtherP01);
    }

    public void Update_State() {
        State();
        System.out.println("Enter the state you want to update: ");
        State = state.nextLine();
        update_state(State);
        if(flags==1&&ch10==1){
            State();
        }

    }


    public void Update_District() {
        State();
        System.out.println("Enter the state in which you want to update the district: ");
        State = state.nextLine();
        district(State);
        if (flags!=15){
            return;}
        System.out.println("Enter the district you want to update");
        District = district.nextLine();
        update_district(State, District);
        if (flagd==1){
            district(State);
        }}

    public void Delete_State() {
        State();
        System.out.println("Enter the state you want to delete: ");
        State = state.nextLine();
        delete_State(State);
        if(flags==1||flags2==2||flags3==3) {
            State();
        }
    }

    public void Delete_District() {
        State();
        System.out.println("Enter the state in which you want to delete the district: ");
        State = state.nextLine();
        district(State);
        if (flags == 15) {
            System.out.println("Enter the district you want to delete");
            District = district.nextLine();
            delete_district(State, District);
            district(State);
        }
    }

    void comparison() {
        String ds1=null,ds2=null,st2=null,st1=null;
        //Information();
        System.out.println("What do you want to compare?");
        System.out.println("1.compare two states");
        System.out.println("2.compare two district");

        int ch5 = in.nextInt();
        switch (ch5) {
            case 1 -> {
                State();
                System.out.println("\nEnter state1: ");
                st1 = state.nextLine();
                System.out.println("\nEnter state2");
                st2 = state.nextLine();
                compare2StatesP(st1, st2);
            }
            case 2 -> {
                State();
                System.out.println("\nEnter state1: ");
                st1 = state.nextLine();
                district(st1);
                if (flags!=15){return;
                }else{
                    System.out.println("\nEnter district1: ");
                    ds1 = district.nextLine();

                    State();

                    System.out.println("Enter state2");
                    st2 = state.nextLine();
                    district(st2);
                    if (flags!=15){
                        return;
                    }else{
                        System.out.println("Enter district2: ");
                        ds2 = district.nextLine();

                        compare2District(st1, st2, ds1, ds2);

                    }}}
            default -> {
                System.out.println("Enter valid input:");
                comparison();
            }
        }
    }

    public void displayAllAttributesState() {
        //Information();

        System.out.println("Enter a choice:");
        System.out.println("1.State");
        System.out.println("2.District");
        int ch8 = in.nextInt();
        switch (ch8) {
            case 1 -> {

                System.out.println("\nEnter state");
                State();
                String st = state.nextLine();
                Node ptr = head;
                while (ptr != null) {
                    if (ptr.data.equalsIgnoreCase(st)) {
                        flags2 = 8;
                        float diff1TP = Math.abs(ptr.Tpopulation - ptr.Tpopulation11);
                        float diff2TP = Math.abs(ptr.Tpopulation11 - ptr.Tpopulation01);
                        float per22_11TP = (diff1TP * 100 / ptr.Tpopulation11);
                        float per11_01TP = (diff2TP * 100 / ptr.Tpopulation01);
                        float diff1MP = Math.abs(ptr.Mpopulation - ptr.Mpopulation11);
                        float diff2MP = Math.abs(ptr.Mpopulation11 - ptr.Mpopulation01);
                        float per22_11MP = (diff1MP * 100 / ptr.Mpopulation11);
                        float per11_01MP = (diff2MP * 100 / ptr.Mpopulation01);
                        float diff1FP = Math.abs(ptr.Fpopulation - ptr.Fpopulation11);
                        float diff2FP = Math.abs(ptr.Fpopulation11 - ptr.Fpopulation01);
                        float per22_11FP = (diff1FP * 100 / ptr.Fpopulation11);
                        float per11_01FP = (diff2FP * 100 / ptr.Fpopulation01);
                        double diff1AL = Math.abs(ptr.AvgLiteracy - ptr.AvgLiteracy11);
                        double diff2AL = Math.abs(ptr.AvgLiteracy11 - ptr.AvgLiteracy01);
                        double per22_11AL = (diff1AL * 100 / ptr.AvgLiteracy11);
                        double per11_01AL = (diff2AL * 100 / ptr.AvgLiteracy01);
                        double diff1ML = Math.abs(ptr.MLiteracy - ptr.MLiteracy11);
                        double diff2ML = Math.abs(ptr.MLiteracy11 - ptr.MLiteracy01);
                        double per22_11ML = (diff1ML * 100 / ptr.MLiteracy11);
                        double per11_01ML = (diff2ML * 100 / ptr.MLiteracy01);
                        double diff1FL = Math.abs(ptr.FLiteracy - ptr.FLiteracy11);
                        double diff2FL = Math.abs(ptr.FLiteracy11 - ptr.FLiteracy01);
                        double per22_11FL = (diff1FL * 100 / ptr.FLiteracy11);
                        double per11_01FL = (diff2FL * 100 / ptr.FLiteracy01);


                        System.out.println("\t\t\t\t\t\t ****** All the attributes for "+st+" *******");

                        System.out.println("\n\nYear\t\t\t\t\t\t2022\t\t\t\t\t2011\t\t\t\t2001\t\t\t\t% 2022-2011\t\t\t\t% 2011-2001\n");
                        System.out.println("Total population\t\t\t\t" + ptr.Tpopulation + " \t\t\t\t" + ptr.Tpopulation11 + "\t\t\t" + ptr.Tpopulation01 + "\t\t\t" + String.format("%.2f", per22_11TP) + "\t\t\t\t\t" + String.format("%.2f", per11_01TP));
                        System.out.println("Total Male population\t\t\t\t" + ptr.Mpopulation + "\t\t\t\t" + ptr.Mpopulation11 + "\t\t\t" + ptr.Mpopulation01 + "\t\t\t" + String.format("%.2f", per22_11MP) + "\t\t\t\t\t" + String.format("%.2f", per11_01MP));
                        System.out.println("Total Female population\t\t\t\t" + ptr.Fpopulation + "\t\t\t\t" + ptr.Fpopulation11 + "\t\t\t" + ptr.Fpopulation01 + "\t\t\t" + String.format("%.2f", per22_11FP) + "\t\t\t\t\t" + String.format("%.2f", per11_01FP));
                        System.out.println("Sex ratio\t\t\t\t\t" + ptr.SexRatio + "\t\t\t\t\t" + ptr.SexRatio11 + "\t\t\t\t" + ptr.SexRatio01+"\n");
                        System.out.println("****** Literacy ******");
                        System.out.println("Average Literacy\t\t\t\t" + String.format("%.2f", ptr.AvgLiteracy) + "\t\t\t\t\t" + String.format("%.2f", ptr.AvgLiteracy11) + "\t\t\t\t" + String.format("%.2f", ptr.AvgLiteracy01) + "\t\t\t\t" + String.format("%.2f", per22_11AL) + "\t\t\t\t\t" + String.format("%.2f", per11_01AL));
                        System.out.println("Male Literacy\t\t\t\t\t" + String.format("%.2f", ptr.MLiteracy) + "\t\t\t\t\t" + String.format("%.2f", ptr.MLiteracy11) + "\t\t\t\t" + String.format("%.2f", ptr.MLiteracy01) + "\t\t\t\t" + String.format("%.2f", per22_11ML) + "\t\t\t\t\t" + String.format("%.2f", per11_01ML));
                        System.out.println("Female Literacy\t\t\t\t\t" + String.format("%.2f", ptr.FLiteracy) + "\t\t\t\t\t" + String.format("%.2f", ptr.FLiteracy11) + "\t\t\t\t" + String.format("%.2f", ptr.FLiteracy01) + "\t\t\t\t" + String.format("%.2f", per22_11FL) + "\t\t\t\t\t" + String.format("%.2f", per11_01FL)+"\n");

                        System.out.println("****** Religion Population ******");
                        System.out.println("Hindu\t\t\t\t\t\t" + String.format("%.2f", ptr.HinduP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.HinduP11) + "\t\t\t\t" + String.format("%.2f", ptr.HinduP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.HinduP22 - ptr.HinduP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.HinduP11 - ptr.HinduP01)));
                        System.out.println("Muslim\t\t\t\t\t\t" + String.format("%.2f", ptr.MuslimP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.MuslimP11) + "\t\t\t\t" + String.format("%.2f", ptr.MuslimP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.MuslimP22 - ptr.MuslimP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.MuslimP11 - ptr.MuslimP01)));
                        System.out.println("Buddhism\t\t\t\t\t" + String.format("%.2f", ptr.BuddhistP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.BuddhistP11) + "\t\t\t\t" + String.format("%.2f", ptr.BuddhistP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.BuddhistP22 - ptr.BuddhistP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.BuddhistP11 - ptr.BuddhistP01)));
                        System.out.println("Jain\t\t\t\t\t\t" + String.format("%.2f", ptr.JainP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.JainP11) + "\t\t\t\t" + String.format("%.2f", ptr.JainP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.JainP22 - ptr.JainP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.JainP11 - ptr.JainP01)));
                        System.out.println("Christian\t\t\t\t\t" + String.format("%.2f", ptr.ChristianP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.ChristianP11) + "\t\t\t\t" + String.format("%.2f", ptr.ChristianP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.ChristianP22 - ptr.ChristianP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.ChristianP11 - ptr.ChristianP01)));
                        System.out.println("Sikh\t\t\t\t\t\t" + String.format("%.2f", ptr.SikhP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.SikhP11) + "\t\t\t\t" + String.format("%.2f", ptr.SikhP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.SikhP22 - ptr.SikhP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.SikhP11 - ptr.SikhP01)));
                        System.out.println("Others/not stated\t\t\t\t" + String.format("%.2f", ptr.OtherP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.OtherP11) + "\t\t\t\t" + String.format("%.2f", ptr.OtherP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.OtherP22 - ptr.OtherP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.OtherP11 - ptr.OtherP01)));
                        return;
                    } else {
                        ptr = ptr.next;
                    }
                }
                if (flags2 != 8) {
                    System.out.println("State not found");
                }
            }
            case 2 -> {
                State();
                System.out.println("\nEnter state");
                String st = state.nextLine();
                district(st);
                if (flags == 15) {
                    System.out.println("\nEnter district");

                    String ds = district.nextLine();

                    Node node = head;
                    while (node != null) {
                        if (node.data.equalsIgnoreCase(st)) {
                            flags3 = 7;
                            Node ptr = node.down;
                            while (ptr != null) {
                                if (ptr.data.equalsIgnoreCase(ds)) {
                                    flagd3 = 7;
                                    float diff1TP = Math.abs(ptr.Tpopulation - ptr.Tpopulation11);
                                    float diff2TP = Math.abs(ptr.Tpopulation11 - ptr.Tpopulation01);
                                    float per22_11TP = (diff1TP * 100 / ptr.Tpopulation11);
                                    float per11_01TP = (diff2TP * 100 / ptr.Tpopulation01);
                                    float diff1MP = Math.abs(ptr.Mpopulation - ptr.Mpopulation11);
                                    float diff2MP = Math.abs(ptr.Mpopulation11 - ptr.Mpopulation01);
                                    float per22_11MP = (diff1MP * 100 / ptr.Mpopulation11);
                                    float per11_01MP = (diff2MP * 100 / ptr.Mpopulation01);
                                    float diff1FP = Math.abs(ptr.Fpopulation - ptr.Fpopulation11);
                                    float diff2FP = Math.abs(ptr.Fpopulation11 - ptr.Fpopulation01);
                                    float per22_11FP = (diff1FP * 100 / ptr.Fpopulation11);
                                    float per11_01FP = (diff2FP * 100 / ptr.Fpopulation01);
                                    double diff1AL = Math.abs(ptr.AvgLiteracy - ptr.AvgLiteracy11);
                                    double diff2AL = Math.abs(ptr.AvgLiteracy11 - ptr.AvgLiteracy01);
                                    double per22_11AL = (diff1AL * 100 / ptr.AvgLiteracy11);
                                    double per11_01AL = (diff2AL * 100 / ptr.AvgLiteracy01);
                                    double diff1ML = Math.abs(ptr.MLiteracy - ptr.MLiteracy11);
                                    double diff2ML = Math.abs(ptr.MLiteracy11 - ptr.MLiteracy01);
                                    double per22_11ML = (diff1ML * 100 / ptr.MLiteracy11);
                                    double per11_01ML = (diff2ML * 100 / ptr.MLiteracy01);
                                    double diff1FL = Math.abs(ptr.FLiteracy - ptr.FLiteracy11);
                                    double diff2FL = Math.abs(ptr.FLiteracy11 - ptr.FLiteracy01);
                                    double per22_11FL = (diff1FL * 100 / ptr.FLiteracy11);
                                    double per11_01FL = (diff2FL * 100 / ptr.FLiteracy01);

                                    System.out.println("\t\t\t\t\t\t ****** All the attributes for "+ds+" *******");

                                    System.out.println("\n\nYear\t\t\t\t\t\t2022\t\t\t\t\t2011\t\t\t\t2001\t\t\t\t% 2022-2011\t\t\t\t% 2011-2001\n");
                                    System.out.println("Total population\t\t\t\t" + ptr.Tpopulation + " \t\t\t\t" + ptr.Tpopulation11 + "\t\t\t\t" + ptr.Tpopulation01 + "\t\t\t\t" + String.format("%.2f", per22_11TP) + "\t\t\t\t\t" + String.format("%.2f", per11_01TP));
                                    System.out.println("Total Male population\t\t\t\t" + ptr.Mpopulation + "\t\t\t\t\t" + ptr.Mpopulation11 + "\t\t\t\t" + ptr.Mpopulation01 + "\t\t\t\t" + String.format("%.2f", per22_11MP) + "\t\t\t\t\t" + String.format("%.2f", per11_01MP));
                                    System.out.println("Total Female population\t\t\t\t" + ptr.Fpopulation + "\t\t\t\t\t" + ptr.Fpopulation11 + "\t\t\t\t" + ptr.Fpopulation01 + "\t\t\t\t" + String.format("%.2f", per22_11FP) + "\t\t\t\t\t" + String.format("%.2f", per11_01FP));
                                    System.out.println("Sex ratio\t\t\t\t\t" + ptr.SexRatio + "\t\t\t\t\t" + ptr.SexRatio11 + "\t\t\t\t" + ptr.SexRatio01+"\n");
                                    System.out.println("****** Literacy ******");
                                    System.out.println("Average Literacy\t\t\t\t" + String.format("%.2f", ptr.AvgLiteracy) + "\t\t\t\t\t" + String.format("%.2f", ptr.AvgLiteracy11) + "\t\t\t\t" + String.format("%.2f", ptr.AvgLiteracy01) + "\t\t\t\t" + String.format("%.2f", per22_11AL) + "\t\t\t\t\t" + String.format("%.2f", per11_01AL));
                                    System.out.println("Male Literacy\t\t\t\t\t" + String.format("%.2f", ptr.MLiteracy) + "\t\t\t\t\t" + String.format("%.2f", ptr.MLiteracy11) + "\t\t\t\t" + String.format("%.2f", ptr.MLiteracy01) + "\t\t\t\t" + String.format("%.2f", per22_11ML) + "\t\t\t\t\t" + String.format("%.2f", per11_01ML));
                                    System.out.println("Female Literacy\t\t\t\t\t" + String.format("%.2f", ptr.FLiteracy) + "\t\t\t\t\t" + String.format("%.2f", ptr.FLiteracy11) + "\t\t\t\t" + String.format("%.2f", ptr.FLiteracy01) + "\t\t\t\t" + String.format("%.2f", per22_11FL) + "\t\t\t\t\t" + String.format("%.2f", per11_01FL)+"\n");

                                    System.out.println("****** Religion Population ******");
                                    System.out.println("Hindu\t\t\t\t\t\t" + String.format("%.2f", ptr.HinduP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.HinduP11) + "\t\t\t\t" + String.format("%.2f", ptr.HinduP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.HinduP22 - ptr.HinduP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.HinduP11 - ptr.HinduP01)));
                                    System.out.println("Muslim\t\t\t\t\t\t" + String.format("%.2f", ptr.MuslimP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.MuslimP11) + "\t\t\t\t" + String.format("%.2f", ptr.MuslimP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.MuslimP22 - ptr.MuslimP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.MuslimP11 - ptr.MuslimP01)));
                                    System.out.println("Buddhism\t\t\t\t\t" + String.format("%.2f", ptr.BuddhistP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.BuddhistP11) + "\t\t\t\t" + String.format("%.2f", ptr.BuddhistP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.BuddhistP22 - ptr.BuddhistP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.BuddhistP11 - ptr.BuddhistP01)));
                                    System.out.println("Jain\t\t\t\t\t\t" + String.format("%.2f", ptr.JainP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.JainP11) + "\t\t\t\t" + String.format("%.2f", ptr.JainP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.JainP22 - ptr.JainP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.JainP11 - ptr.JainP01)));
                                    System.out.println("Christian\t\t\t\t\t" + String.format("%.2f", ptr.ChristianP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.ChristianP11) + "\t\t\t\t" + String.format("%.2f", ptr.ChristianP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.ChristianP22 - ptr.ChristianP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.ChristianP11 - ptr.ChristianP01)));
                                    System.out.println("Sikh\t\t\t\t\t\t" + String.format("%.2f", ptr.SikhP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.SikhP11) + "\t\t\t\t" + String.format("%.2f", ptr.SikhP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.SikhP22 - ptr.SikhP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.SikhP11 - ptr.SikhP01)));
                                    System.out.println("Others/not stated\t\t\t\t" + String.format("%.2f", ptr.OtherP22) + "\t\t\t\t\t" + String.format("%.2f", ptr.OtherP11) + "\t\t\t\t" + String.format("%.2f", ptr.OtherP01) + "\t\t\t\t" + String.format("%.2f", Math.abs(ptr.OtherP22 - ptr.OtherP11)) + "\t\t\t\t\t" + String.format("%.2f", Math.abs(ptr.OtherP11 - ptr.OtherP01)));
                                    return;
                                } else {
                                    ptr = ptr.next;
                                }
                            }
                            if (flagd3 != 7) {
                                System.out.println("District not found in this particular state");
                                return;
                            }

                        } else {
                            node = node.next;
                        }
                    }
                }
            }
            default -> {
                System.out.println("Invalid input");
                displayAllAttributesState();
            }
        }
    }


    void displayIndia() {
        // Information();
        long TPopIndia = 0, MPopIndia = 0, FPopIndia = 0, TPopIndia11 = 0, MPopIndia11 = 0, FPopIndia11 = 0, TPopIndia01 = 0, MPopIndia01 = 0, FPopIndia01 = 0;
        double ALT = 0, MLT = 0, FLT = 0, ALT11 = 0, MLT11 = 0, FLT11 = 0, ALT01 = 0, MLT01 = 0, FLT01 = 0, ALIndia;
        double HPT = 0, MPT = 0, BPT = 0, JPT = 0, CPT = 0, SPT = 0, OPT = 0, HPT11 = 0, MPT11 = 0, BPT11 = 0, JPT11 = 0, CPT11 = 0, SPT11 = 0, OPT11 = 0, HPT01 = 0, MPT01 = 0, BPT01 = 0, JPT01 = 0, CPT01 = 0, SPT01 = 0, OPT01 = 0;
        Node ptr = head;

        while (ptr != null) {
            System.out.println("\nState: " + ptr.data);
            TPopIndia += ptr.Tpopulation;
            MPopIndia += ptr.Mpopulation;
            FPopIndia += ptr.Fpopulation;
            TPopIndia11 += ptr.Tpopulation11;
            MPopIndia11 += ptr.Mpopulation11;
            FPopIndia11 += ptr.Fpopulation11;
            TPopIndia01 += ptr.Tpopulation01;
            MPopIndia01 += ptr.Mpopulation01;
            FPopIndia01 += ptr.Fpopulation01;
            ALT += ptr.AvgLiteracy;
            MLT += ptr.MLiteracy;
            FLT += ptr.FLiteracy;
            ALT11 += ptr.AvgLiteracy11;
            MLT11 += ptr.MLiteracy11;
            FLT11 += ptr.FLiteracy11;
            ALT01 += ptr.AvgLiteracy01;
            MLT01 += ptr.MLiteracy01;
            FLT01 += ptr.FLiteracy01;
            HPT += ptr.HinduP22;
            BPT += ptr.BuddhistP22;
            MPT += ptr.MuslimP22;
            JPT += ptr.JainP22;
            CPT += ptr.ChristianP22;
            SPT += ptr.SikhP22;
            OPT += ptr.OtherP22;
            HPT11 += ptr.HinduP11;
            BPT11 += ptr.BuddhistP11;
            MPT11 += ptr.MuslimP11;
            JPT11 += ptr.JainP11;
            CPT11 += ptr.ChristianP11;
            SPT11 += ptr.SikhP11;
            OPT11 += ptr.OtherP11;
            HPT01 += ptr.HinduP01;
            BPT01 += ptr.BuddhistP01;
            MPT01 += ptr.MuslimP01;
            JPT01 += ptr.JainP01;
            CPT01 += ptr.ChristianP01;
            SPT01 += ptr.SikhP01;
            OPT01 += ptr.OtherP01;
            Node ptr2 = ptr.down;
            while (ptr2 != null) {
                System.out.println("  *" + "District: " + ptr2.data);
                ptr2 = ptr2.next;
            }
            ptr = ptr.next;
        }
        ALIndia = ALT / 7;
        double ALIndia11 = ALT11 / 7;
        double ALIndia01 = ALT01 / 7;
        double MLIndia = MLT / 7;
        double MLIndia11 = MLT11 / 7;
        double MLIndia01 = MLT01 / 7;
        double FLIndia = FLT / 7;
        double FLIndia11 = FLT11 / 7;
        double FLIndia01 = FLT01 / 7;
        double HPIndia = HPT / 7;
        double HPIndia11 = HPT11 / 7;
        double HPIndia01 = HPT01 / 7;
        double MPIndia = MPT / 7;
        double MPIndia11 = MPT11 / 7;
        double MPIndia01 = MPT01 / 7;
        double BPIndia = BPT / 7;
        double BPIndia11 = BPT11 / 7;
        double BPIndia01 = BPT01 / 7;
        double JPIndia = JPT / 7;
        double JPIndia11 = JPT11 / 7;
        double JPIndia01 = JPT01 / 7;
        double CPIndia = CPT / 7;
        double CPIndia11 = CPT11 / 7;
        double CPIndia01 = CPT01 / 7;
        double SPIndia = SPT / 7;
        double SPIndia11 = SPT11 / 7;
        double SPIndia01 = SPT01 / 7;
        double OPIndia = OPT / 7;
        double OPIndia11 = OPT11 / 7;
        double OPIndia01 = OPT01 / 7;

        System.out.println("\t\t\t\t\t ********** INDIA'S CENSUS **********");
        System.out.println("\nYear\t\t\t\t\t\t2022\t\t\t\t\t2011\t\t\t\t2001\n");
        System.out.println("Total population\t\t\t\t" + TPopIndia + " \t\t\t\t" + TPopIndia11 + "\t\t\t" + TPopIndia01);
        System.out.println("Total Male population\t\t\t\t" + MPopIndia + "\t\t\t\t" + MPopIndia11 + "\t\t\t" + MPopIndia01);
        System.out.println("Total Female population\t\t\t\t" + FPopIndia + "\t\t\t\t" + FPopIndia11 + "\t\t\t" + FPopIndia01+"\n");
        System.out.println("****** Literacy ******");
        System.out.println("Average Literacy\t\t\t\t" + String.format("%.2f",ALIndia) + "\t\t\t\t\t" + String.format("%.2f",ALIndia11) + "\t\t\t\t" + String.format("%.2f",ALIndia01));
        System.out.println("Male Literacy\t\t\t\t\t" + String.format("%.2f",MLIndia) + "\t\t\t\t\t" + String.format("%.2f",MLIndia11) + "\t\t\t\t" + String.format("%.2f",MLIndia01));
        System.out.println("Female Literacy\t\t\t\t\t" + String.format("%.2f",FLIndia) + "\t\t\t\t\t" + String.format("%.2f",FLIndia) + "\t\t\t\t" + String.format("%.2f",FLIndia)+"\n");
        System.out.println("****** Religion Population ******");
        System.out.println("Hindu\t\t\t\t\t\t" + String.format("%.2f", HPIndia) + "\t\t\t\t\t" + String.format("%.2f", HPIndia11) + "\t\t\t\t" + String.format("%.2f", HPIndia01));
        System.out.println("Muslim\t\t\t\t\t\t" + String.format("%.2f", MPIndia) + "\t\t\t\t\t" + String.format("%.2f", MPIndia11) + "\t\t\t\t" + String.format("%.2f", MPIndia01));
        System.out.println("Buddhism\t\t\t\t\t" + String.format("%.2f", BPIndia) + "\t\t\t\t\t" + String.format("%.2f", BPIndia11) + "\t\t\t\t" + String.format("%.2f", BPIndia01));
        System.out.println("Christian\t\t\t\t\t" + String.format("%.2f", CPIndia) + "\t\t\t\t\t" + String.format("%.2f", CPIndia11) + "\t\t\t\t" + String.format("%.2f", CPIndia01));
        System.out.println("Jain\t\t\t\t\t\t" + String.format("%.2f", JPIndia) + "\t\t\t\t\t" + String.format("%.2f", JPIndia11) + "\t\t\t\t" + String.format("%.2f", JPIndia01));
        System.out.println("Sikh\t\t\t\t\t\t" + String.format("%.2f", SPIndia) + "\t\t\t\t\t" + String.format("%.2f", SPIndia11) + "\t\t\t\t" + String.format("%.2f", SPIndia01));
        System.out.println("Others/not stated\t\t\t\t" + String.format("%.2f", OPIndia) + "\t\t\t\t\t" + String.format("%.2f", OPIndia11) + "\t\t\t\t" + String.format("%.2f", OPIndia01)+"\n");


    }

}