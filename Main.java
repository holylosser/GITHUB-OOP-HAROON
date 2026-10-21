import java.util.*;
public class Main {
    void main(String[]args){
    Student one=new Student();
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Student Id :");String id=sc.next();one.setid(id);
        System.out.println("Enter Your Name  :");String name=sc.next();one.setname(name);
        System.out.println("Enter Your Program Name :");String pro=sc.next();one.setprogram(pro);
    }
}
