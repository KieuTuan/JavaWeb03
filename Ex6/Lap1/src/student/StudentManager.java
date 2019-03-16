package student;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> listStudent = new ArrayList<>();
    
    public boolean add(Student stud) {
        try {
            listStudent.add(stud);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void search(String name) {
        for (int i = 0; i < listStudent.size(); i++)
            if(listStudent.get(i).getName().equals(name)) {
                System.out.println(name);
                System.out.println(listStudent.get(i).getEmail());
                System.out.println(listStudent.get(i).getAge());
                return;
            }
        System.out.println("Không tồn tại.");
    }
    
    private String toString(Student st) {
        return st.getName()+" "+st.getEmail()+" "+st.getAge();
    }
    
    public void list() {
        Student st = new Student();
        for (int i = 0; i < listStudent.size(); i++) {
            st = listStudent.get(i);
            System.out.println(toString(st));
        }
    }
}
