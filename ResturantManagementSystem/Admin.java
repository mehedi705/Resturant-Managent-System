package ResturantManagementSystem;

public class Admin {
    String admin_user_name;
    String admin_mail_address;

    Admin(String user_name, String mail_address) {
        admin_user_name = user_name;
        admin_mail_address = mail_address;
    }

    void Check_Manager_Status(Manager the_manager) {
        System.out.println("Manager username : " + the_manager.manager_user_name);
        System.out.println("Manager mail : " + the_manager.manager_mail_address);
    }

    void Check_Employee_Status(Employee the_employee) {
        System.out.println("Employee username : " + the_employee.employee_user_name);
        System.out.println("Employee shift : " + the_employee.employee_shift);
    }

}
