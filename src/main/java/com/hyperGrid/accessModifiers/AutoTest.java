package com.hyperGrid.accessModifiers;

/**
 * The AutoTest class demonstrates the usage of the AccessTest class.
 * It serves as a test class to invoke methods from the AccessTest class.
 */
public class AutoTest {

    /**
     * The main method acts as the entry point of the application.
     * It creates an object of the AccessTest class and calls its methods.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create an instance of AccessTest
        AccessTest accessTest = new AccessTest();

        // Call the click method of AccessTest
        accessTest.click();

        // Call the sum method of AccessTest
        accessTest.sum();

        // Call the total method of AccessTest
        accessTest.total();
    }
}