package com.nextBaseCRM.tests.esma.UserStory6;

import java.util.ArrayList;
import java.util.Arrays;

public class Credentials {

    private static ArrayList<String> userNameHR = new ArrayList<>(Arrays.asList("hr45@cybertekschool.com", "hr46@cybertekschool.com"));

    private static ArrayList<String> userNameMarketing = new ArrayList<>(Arrays.asList("marketing45@cybertekschool.com", "marketing46@cybertekschool.com"));

    private static ArrayList<String> userNameHelpDesk = new ArrayList<>(Arrays.asList("helpdesk45@cybertekschool.com", "helpdesk46@cybertekschool.com"));

    private final static String passWord = "UserUser";

    public static ArrayList<String> getUserNameHR() {
        return userNameHR;
    }

    public static void setUserNameHR(ArrayList<String> userNameHR) {
        Credentials.userNameHR = userNameHR;
    }

    public static ArrayList<String> getUserNameMarketing() {
        return Credentials.userNameMarketing;
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

    public static String getPassWord() {
        return passWord;
    }
}
