package manager;

import java.util.ArrayList;
import java.util.Scanner;
import person.Student;

public class StudentManager extends Manager{
    private ArrayList<Student> studentList = new ArrayList();
    
    @Override
    public void add() {
        Scanner input = new Scanner(System.in);
        Student st = new Student();
        st.input(input);
        studentList.add(st);
    }
    
    @Override
    public void show() {
        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i).toString());
    }
    
    @Override
    public void search(String name) {
        for (int i = 0; i < studentList.size(); i++)
            if(studentList.get(i).getName().equals(name))
                System.out.println(studentList.get(i).toString());
            else
                System.out.println("Tên không tồn tại.");
    }
}
