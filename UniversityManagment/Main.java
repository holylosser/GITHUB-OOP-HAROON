package UniversityManagment;

import java.util.*;
public class Main {
    void main(String[]args){
    Student one=new Student();
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Student Id :");String id=sc.next();one.setid(id);
        System.out.println("Enter Your Name  :");String name=sc.next();one.setname(name);
        System.out.println("Enter Your Program Name :");String pro=sc.next();one.setprogram(pro);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Your Course Number "+(i+1)+" name : ");
            String course=sc.next();one.setCourses(course);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Your your marks of Course ");
            int mark=sc.nextInt();one.setMarks(mark);
        }
    }
}
