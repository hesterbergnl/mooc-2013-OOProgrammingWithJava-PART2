import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("jamo"));
        students.add(new Student("jamo1"));
        students.add(new Student("alice"));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
        
    }
}
