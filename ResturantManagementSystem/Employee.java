package ResturantManagementSystem;

public class Employee {
    String employee_user_name;
    String employee_shift;

    Employee(String user_name, String shift) {
        employee_user_name = user_name;
        employee_shift = shift;
    }

    void Change_Food_Condition(Food the_food, String value) {
        the_food.food_condition = value;
    }

    void Change_Food_Cost(Food the_food, int value) {
        the_food.food_cost = value;
    }
}
