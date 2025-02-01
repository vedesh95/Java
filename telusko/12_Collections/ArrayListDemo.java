import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; 

class Student{
    public int age;
    public int marks;
    public String name;
    public Student(int age, int marks, String name){
        this.age = age;
        this.marks = marks;
        this.name = name;
    }
    public int compareTo(Student that){
        if(this.age >= that.age){
            return 1;
        }else{
            return -1;
        }
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", marks=" + marks + ", name=" + name + "]";
    }
    
}
public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<Student> studs = new ArrayList<> ();
        studs.add(new Student(21, 90, "Vedesh"));
        studs.add(new Student(22, 80, "Harsh"));
        studs.add(new Student(20, 70, "Ank"));

        Comparator<Student> com = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1. age >= o2.age) return 1;
                return -1;
            }
            
        }; 
        Collections.sort(studs,com);
        System.out.println(studs);
        
    }
}

