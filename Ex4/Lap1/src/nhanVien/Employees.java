package nhanVien;

import java.util.Scanner;

public class Employees {
    private String name;
    private int age;
    private String address;
    private double salary;      // lương
    private int hoursWorked;

    public Employees() {
    }

    public Employees(String name, int age, String address, double salary, int hoursWorked) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public void inputInfo(Scanner input) {
        System.out.println("Nhập thông tin nhân viên:");
        System.out.print("Nhập tên: ");
        name = input.nextLine();
        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("Nhập địa chỉ: ");
        address = input.nextLine();
        System.out.print("Nhập tiền lương: ");
        salary = Double.parseDouble(input.nextLine());
        System.out.print("Nhập số giờ làm: ");
        hoursWorked = Integer.parseInt(input.nextLine());
        System.out.println();
    }
    
    public void printInfo() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
        System.out.println("Hours Worked: "+hoursWorked);
    }
    
    public double bonus() {
        double bonus;
        if(hoursWorked >= 200)
            bonus = salary*0.2;
        else if(hoursWorked < 100)
            bonus = 0;
        else
            bonus = salary*0.1;
        return bonus;
    }
}
