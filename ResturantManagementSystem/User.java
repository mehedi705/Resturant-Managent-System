package ResturantManagementSystem;

public class User {

    String user_name;
    String user_mail_address;

    User(String name, String mail_address) {
        user_name = name;
        user_mail_address = mail_address;
    }

    void Check_Food_Status(Food the_food) {
        System.out.println("This Food " + the_food.food_condition + ".");
        System.out.println("Cost : " + the_food.food_cost + " TK.");
    }

    void Buy_Food(Food the_food) {
        if (the_food.food_condition == "On Stock") {
            System.out.println("This Food cost : " + the_food.food_cost + " TK.");
            System.out.println("Purchased Successful!");
        } else {
            System.out.println("Sorry this item not available right now!");
        }
    }

}
