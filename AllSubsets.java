package com.bmc.dwp.testautomation.project.myit;

import java.util.ArrayList;
import java.util.List;

public class AllSubsets {
    // Declare a global list
    static List<String> al = new ArrayList<>();

    // Creating a public static Arraylist such that
    // we can store values
    // IF there is any question of returning the
    // we can directly return too// public static
    // ArrayList<String> al = new ArrayList<String>();
    public static void main(String[] args)
    {
        String s = "hmoememehoemeeoooomooe";
        int count = 0;
        findsubsequences(s, ""); // Calling a function
        System.out.println(al);
        for (String S : al){
            if(S.equals("home")){
                ++count;
            }
        }
        System.out.println(count);
    }

    private static void findsubsequences(String s,
                                         String ans)
    {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }

        // We add adding 1st character in string
        findsubsequences(s.substring(1), ans + s.charAt(0));
        // Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not
        findsubsequences(s.substring(1), ans);
    }
}
