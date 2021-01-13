package com.nextBaseCRM.tests.esma.userStory13;

import java.util.ArrayList;
import java.util.Arrays;

public class Credentials {
//***the class is holding credentials for HR helpdesk and marketing.***
    private static ArrayList<String> userNameHR, userNameMarketing, userNameHelpDesk,userNameMarketing_HR;
    //there is only one password for all so only string
    private static String passwordAll;
// ***because the usernames will not change I declared them static and initialized them***
    static {
        userNameHR = new ArrayList<>(Arrays.asList("hr45@cybertekschool.com", "hr46@cybertekschool.com"));
        userNameMarketing = new ArrayList<>(Arrays.asList("marketing45@cybertekschool.com", "marketing46@cybertekschool.com"));
        userNameHelpDesk = new ArrayList<>(Arrays.asList("helpdesk45@cybertekschool.com", "helpdesk46@cybertekschool.com"));
        passwordAll = "UserUser";

    }

//***getting and setting usernames for all***
    public static ArrayList<String> getUserNameHR() {
        return userNameHR;
    }

    public static ArrayList<String> getUserNameMarketing_HR() {
        return userNameMarketing_HR;
    }

    public static void setUserNameMarketing_HR(ArrayList<String> userNameMarketing_HR) {
        Credentials.userNameMarketing_HR = userNameMarketing_HR;
    }

    public static void setUserNameHR(ArrayList<String> userNameHR) {
        Credentials.userNameHR = userNameHR;
    }

    public static ArrayList<String> getUserNameMarketing() {
        return userNameMarketing;
    }

    public static void setUserNameMarketing(ArrayList<String> userNameMarketing) {
        Credentials.userNameMarketing = userNameMarketing;
    }

    public static ArrayList<String> getUserNameHelpDesk() {
        return userNameHelpDesk;
    }

    public static void setUserNameHelpDesk(ArrayList<String> userNameHelpDesk) {
        Credentials.userNameHelpDesk = userNameHelpDesk;
    }

    public static String getPasswordAll() {
        return passwordAll;
    }

    public static void setPasswordAll(String passwordAll) {
        Credentials.passwordAll = passwordAll;
    }
    //***adding new usernames to the arraylist for hr marketing and helpdesk***
    public static void addUserNameHR(String userName){
        userNameHR.add(userName);
    }
    public static void addUserNameMarketing(String userName){
        userNameMarketing.add(userName);
    }
    public static void addUserNameHelpDesk(String userName){
        userNameHelpDesk.add(userName);
    }



}
