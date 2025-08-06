package org.example;

import org.example.manager.MemberManager;


public class Main {
    public static void main(String[] args) {
        MemberManager mm = new MemberManager();

        try {
            mm.run();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}