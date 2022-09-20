package Polymorphism;

public class Employee {
    int employeeId=50;
    String employeeName="Mayuri";

    void searchEmployee(int empId){
        if(empId==employeeId){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("employee not found");
        }

    }
    void searchEmployee(String empName){
        if(empName.equalsIgnoreCase(employeeName)){
            System.out.println("Employee Present");
        }
        else {
            System.out.println("Employee not found");
        }
    }

}
