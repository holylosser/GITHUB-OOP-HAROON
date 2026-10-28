package UniversityManagment;
import java.util.*;
public class Main {
    void main(String[]args){
    Student one=new Student();
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Student Id :");String id=sc.next();one.setid(id);
        System.out.println("Enter Your Name  :");String name=sc.nextLine();one.setname(name);sc.nextLine();
        System.out.println("Enter Your Program Name :");String pro=sc.nextLine();one.setprogram(pro);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Your Course Number "+(i+1)+" name : ");
            String course=sc.next();one.setCourses(i,course);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Your your marks of Course number "+(i+1));
            int mark=sc.nextInt();one.setMarks(i,mark);
        }
        System.out.println("The Id of This Student is "+one.getid());
        System.out.println("The Name of This Student is "+one.getname());
        System.out.println("The University of This Student is "+one.getuniname());
        System.out.println("The Program of this Student is "+one.getprogram());
        for (int i = 0; i < 5; i++) {
            System.out.println("The Course number "+(i+1)+" of this student is "+one.getCourses(i));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("The marks of this student in course number "+(i+1)+" are "+one.getMarks(i));
        }
    }
}
