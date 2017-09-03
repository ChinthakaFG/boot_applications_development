package com.fg.boot.interview;

import java.util.*;

/**
 * App Name spring-boot-with-spring-security
 * <p>
 * Created Date : 9/2/17 Time : 8:46 PM
 * Created By : chikaslocalhost
 * <p>
 * Package Name : com.fg.boot.interview
 * Class Name : SetCreatot
 */
public class SetCreatot {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("String");
        set.add(1);
        set.add(0.25d);

        TreeSet<String> treeSet = new TreeSet();
        treeSet.add("Umaya");
        treeSet.add("AManda");
        treeSet.add("Sumana");
        treeSet.add("Amantha");
        treeSet.add("Gunawardene");
        treeSet.add("1");

        for (String s: treeSet) {

            System.out.println(s);

        }

        for (Object s: set) {
            System.out.println(s);
        }

    }


}
