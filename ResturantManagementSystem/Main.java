package ResturantManagementSystem;

/**
 * Main
 */

public class Main {
    public static void main(String[] args) {

        // Foods
        Food Biriyani = new Food("On Stock", 150);
        Food Rice = new Food("On Stock", 50);
        Food Chiken = new Food("On Stock", 80);
        Food Bread = new Food("On Stock", 40);
        Food Beef = new Food("Out of Stock", 110);

        // User
        User Mehedi = new User("mehedi391", "mehedi35-391@diu.edu.bd");
        User Badsha = new User("Badsha441", "badsha35-441@diu.edu.bd");
        User Sajid = new User("sajid407", "sajid35-407@diu.edu.bd");

        // Employee
        Employee Ismail = new Employee("ismail_emp427", "Day");
        Employee Rakib = new Employee("rakib_emp410", "Night");

        // Manager
        Manager Dipu = new Manager("dipu_man393", "dipu35-393@diu.edu.bd");
        Manager Farhana = new Manager("farhana_man420", "farhana35-420@diu.edu.bd");

        // Admin
        Admin the_admin = new Admin("admin1", "admin123@gmail.com");

        // Commands are executed here..

        System.exit(0);
    }
}