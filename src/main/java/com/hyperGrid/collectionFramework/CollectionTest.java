package com.hyperGrid.collectionFramework;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("Selenium");
        collection.add(4.31);
        collection.add(true);
        collection.add('S');
        collection.add(4);
        System.out.println(collection);

        collection.add("Appium");
        System.out.println(collection);
        collection.remove("Selenium");
        System.out.println(collection);

        boolean b = collection.contains("Selenium");
        System.out.println(b);
    }
}
