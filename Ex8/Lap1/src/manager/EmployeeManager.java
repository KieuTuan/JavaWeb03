package manager;

import java.util.ArrayList;
import java.util.Scanner;
import person.Employee;

public class EmployeeManager extends Manager{
    private ArrayList<Employee> employeeList = new ArrayList();
    
    @Override
    public void add() {
        Scanner input = new Scanner(System.in);
        Employee epy = new Employee();
        epy.input(input);
        employeeList.add(epy);
    }
    
    @Override
    public void show() {
        for (int i = 0; i < employeeList.size(); i++)
            System.out.println(employeeList.get(i).toString());
    }
    
    @Override
    public void search(String name) {
        for (int i = 0; i < employeeList.size(); i++)
            if(employeeList.get(i).getName().equals(name))
                System.out.println(employeeList.get(i).toString());
            else
                System.out.println("Tên không tồn tại.");
    }
}
