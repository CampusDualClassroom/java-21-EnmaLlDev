package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> newHashSet = new HashSet<>();
        newHashSet.add("ELEMENT KPRBC");
        newHashSet.add("ELEMENT YPBTM");
        newHashSet.add("ELEMENT AADXU");
        newHashSet.add("ELEMENT RXCGJ");
        newHashSet.add("ELEMENT WYMVD");
        newHashSet.add("ELEMENT WFGEJ");
        newHashSet.add("ELEMENT TYGBS");
        newHashSet.add("ELEMENT MAPTK");
        newHashSet.add("ELEMENT GJXVE");
        newHashSet.add("ELEMENT BAFGL");

        return newHashSet;
    }

    public static Set<String> createTreeSet() {
        Set<String> newTreeSet = new TreeSet<>();
        newTreeSet.add("ELEMENT KPRBC");
        newTreeSet.add("ELEMENT YPBTM");
        newTreeSet.add("ELEMENT AADXU");
        newTreeSet.add("ELEMENT RXCGJ");
        newTreeSet.add("ELEMENT WYMVD");
        newTreeSet.add("ELEMENT WFGEJ");
        newTreeSet.add("ELEMENT TYGBS");
        newTreeSet.add("ELEMENT MAPTK");
        newTreeSet.add("ELEMENT GJXVE");
        newTreeSet.add("ELEMENT BAFGL");

        return newTreeSet;
    }

    private static void printSet(Set<String> customSet) {
        if (customSet == null) {
            System.out.println("It is empty");
            return;
        }
        for (String element : customSet) {
            System.out.println(element);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        if (set == null || elementToAdd == null) {
            return false;
        }
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> exampleHashSet = createHashSet();
        Set<String> exampleTreeSet = createTreeSet();

        addElementToSet(exampleHashSet, "ELEMENT AAA");

        addElementToSet(exampleTreeSet, "ELEMENT AAA");

        System.out.println("-----------------");
        printSet(exampleHashSet);
        System.out.println("-----------------");
        printSet(exampleTreeSet);
        System.out.println("-----------------");
    }

}
