package ResturantManagementSystem;

public class Manager {
    String manager_user_name;
    String manager_mail_address;

    Manager(String user_name, String mail_address) {
        manager_user_name = user_name;
        manager_mail_address = mail_address;
    }

    void Check_Employee_Status(Employee the_employee) {
        System.out.println("Employee username : " + the_employee.employee_user_name);
        System.out.println("Employee shift : " + the_employee.employee_shift);
    }

    void Change_Employee_Shift(Employee the_employee, String shift) {
        the_employee.employee_shift = shift;
    }

}
